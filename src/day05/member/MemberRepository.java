package day05.member;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

// 회원 저장소 역할
public class MemberRepository {
    public static final int NOT_FOUND = -1;

    Member[] memberList;

    //삭제된 회원 배열(휴지통)
    Member[] removeMembers;

    public MemberRepository() {
        this.memberList = new Member[3];

        memberList[0] = new Member(1, "1111", "1111",
                "콩벌레", Gender.MALE, 22);
        memberList[1] = new Member(2, "1234@1234.com", "2222",
                "팥죽이", Gender.FEMALE, 33);
        memberList[2] = new Member(3, "12345@12345.com", "3333",
                "죽상이", Gender.MALE, 44);


    }

    /*
     * 모든 회원 정보를 출력해주는 메서드
     */
    void showMembers() {
        System.out.printf("=========현재 회원정보 (총 %d명)=========\n", memberList.length);
        for (Member m : memberList) {
            System.out.println(m.inform());
        }
    }
    /*
     * 회원 가입 기능
     * @param1 - newMember : 새롭게 회원가입하는 회원의 정보
     * @return : 회원가입 성공여부
     *           성공시 true, 이메일이 중복되어 실패시 false
     */

    boolean addMembers(Member newMember) {
        //이메일이 중복인가?
        if (isDupulicateEmail(newMember.email)) return false;
        //실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }

        //회원가입 시간 등록
        newMember.regDate = LocalDate.now();

        temp[temp.length - 1] = newMember;
        memberList = temp;

        //save파일 생성 기존 save파일에 유지하면서 데이터 추가(미완성 옛날에 썻던 방식)
//        try (FileWriter fw = new FileWriter("/Users/taegeun/exercise/member.txt")) {
//            String saveInfo = "";
//            saveInfo += newMember.memberId;
//            saveInfo += ","+newMember.email;
//            saveInfo += ","+newMember.password;
//            saveInfo += ","+newMember.gender;
//            saveInfo += ","+newMember.age;
//            fw.append(saveInfo + "\n");
//        } catch (IOException e) {
//            System.out.println("파일 저장 실패");
//        }
        return true;
    }

    /*
     * 이메일의 중복여부를 확인하는 기능
     * @param1 - targetEmail : 검사 대상 이메일
     * @return : 중복되었을 시 true, 사용가능할 시 false
     */
    boolean isDupulicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    /*
     * 마지막 회원의 번호를 알려주는 기능
     */
    int getLastMemberId() {
        return !isEmpty() ? memberList[memberList.length - 1].memberId : 0;
    }

    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
     *
     * @return : 찾은 회원의 객체정보, 못찾으면 null반환
     * @param1 email : 찾고 싶은 회원의 이메일
     */
    Member findByEmail(String email) {
        for (Member m : memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }

    /**
     * 이메일을 통해 저장된 회원의 인덱스값을 알아내는 메서드
     *
     * @param email - 탐색 대상의 이메일
     * @return : 찾아낸 인데스, 못찾으면 -1
     */
    int findIndexByEmail(String email) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email))
                return i;
        }
        return NOT_FOUND;
    }

    /**
     * 비밀번호를 수정하는 기능
     *
     * @param email       : 수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */
    boolean changePassword(String email, String newPassword) {
        int index = findIndexByEmail(email);
        //수정진행
        if (index != NOT_FOUND) return false;

        memberList[index].password = newPassword;
        return true;

    }

    /**
     * 회원정보 삭제
     */
    void removeMember(String email) {
        // 인덱스 찾기
        int delIndex = findIndexByEmail(email);

        // 앞으로 땡기기
        for (int i = delIndex; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];
        }

        // 배열 마지막 칸 없애기
        Member[] temp = new Member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
    }

    //멤버가 비었는지 확인
    boolean isEmpty() {
        return memberList.length == 0;
    }


}
