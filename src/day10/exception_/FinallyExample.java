package day10.exception_;

public class FinallyExample {
    public static void main(String[] args) {
        String[] pets;

        pets = new String[]{"비둘기", "거북이", "앵무새"};

        for (int i = 0; i < 4; i++) {   //ArrayIndexOutOfBoundsException
            try {
                System.out.println(pets[i] + "키우기");
            } catch (Exception e) {
                System.out.println("[ERROR]애완동물 정보가 없습니다.");
            } finally { //예외와 관계없이 항상 실행할 코드
                System.out.println("*****애완동물 애호가*****");

                /**
                 * 사용용도 : 데이터베이스 접속 후 다음 접속을 위해
                 *            데이터베이스 연결을 종료시켜야 할 경우
                 */
            }
        }
        System.out.println("프로그램 정상 종료");


    }
}
