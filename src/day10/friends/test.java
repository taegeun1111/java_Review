package day10.friends;

import day07.util.Utility;

import java.util.List;

/**
 * 기능 1. 팔로워 대기목록에 팔로우 요청한 사람을 추가하는 기능
 * 기능 2. 팔로워 목록에 팔로우 수락한 사람을 추가하는 기능
 * 기능 3. 팔로워 대기목록에서 닉네임들을 보여주는 기능
 * 기능 4. 팔로워 목록에서 닉네임들을 보여주는 기능
 * 기능 5. 사용자가 팔로우 요청 직접 취소
 */

public class test {
    public static void main(String[] args) {
        People kim = new People("김철수");
        People park = new People("박영희");
        People hong = new People("홍길동");

        //kim의 팔로워 대기목록에 park,hong,chan 추가
        kim.addFollowerWaitList(park);
        kim.addFollowerWaitList(hong);


        Utility.makeLine();
        //팔로우 요청목록 출력
        waitList(kim);

        //팔로우 요청 사용자[kim]이 취소
        kim.cancelFollow(park);
        waitList(kim);


        kim.addFollower(park);

        park.addFollowerWaitList(kim);
        park.addFollower(kim);


        System.out.println("김철수 팔로워목록 = " + kim.showFollower());
        System.out.println("김철수 팔로잉목록 = " + kim.showFollowings());
        Utility.makeLine();
        System.out.println("박영희 팔로워목록 = " + park.showFollower());
        System.out.println("박영희 팔로잉목록 = " + park.showFollowings());


        System.out.println("kim팔로워목록 : "+kim.isMatch(park));
        System.out.println("kim팔로워목록 : "+kim.isMatch(hong));
    }

    public static void waitList(People people) {
        List<String> strings = people.showFollowerWaitPerson();
        System.out.printf("현재[%s]의 팔로우 요청 목록 = " + strings+"\n",people.getNickName());
    }

}
