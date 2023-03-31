package day04;

//실행용 클래스
//여기에는 설계를 하지 않고 main메서드를 작성
public class DancerMain {
    public static void main(String[] args) {
        Dancer kim = new Dancer();
        Dancer park = new Dancer("스트릿댄스");
        Dancer jang = new Dancer("장돈건", "목각댄스", DanceLevel.PRO);

//        Singer song = new Singer();

        //String 타입 3개, int 1개, return값 3개의 기능을 가지는 Dancer타입을 생성한다.

        //kim의 주소(Stack,Heap참고)
        System.out.println(kim);
        System.out.println(park);

        System.out.println(kim.introduce());
        kim.stretch();

        kim.dance();
        park.dance();
    }
}
