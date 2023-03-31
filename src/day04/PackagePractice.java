package day04;
import fruits.Banana;
import fruits.warm.PineApple;
import fruits.*;
import juice.Apple;

public class PackagePractice {
    public static void main(String[] args) {
        //다른 패키지 내에 같은 파일 명이 있을 때
        new juice.Apple();
        new fruits.Apple();

        //다른 패키지 내에 생성자 객체 호출법
        Banana banana = new Banana();

        //같은 패키지 내에서는 생략 가능
        new day04.Dancer();
        new Dancer();

    }
}
