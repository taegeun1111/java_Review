package day04;

//실행용 클래스
//여기에는 설계를 하지 않고 main메서드를 작성
public class DancerMain {
    public static void main(String[] args) {
        Dancer kim = new Dancer();
        //String 타입 3개, int 1개, return값 3개의 기능을 가지는 Dancer타입을 생성한다.

        kim.dancerName = "Bang";
        kim.crewName = "Holly";
        System.out.println(kim.introduce());
        kim.stretch();
    }
}
