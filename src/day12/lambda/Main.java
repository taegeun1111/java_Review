package day12.lambda;

import day07.util.Utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;

public class Main {
    public static void main(String[] args) {
        //사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN),
                new Apple(150, GREEN),
                new Apple(120, RED),
                new Apple(90, RED),
                new Apple(200, YELLOW),
                new Apple(60, YELLOW),
                new Apple(70, GREEN),
                new Apple(170, RED)
        );

        Utility.makeLine();
        //--------------------------------------------------------------
        List<Apple> filterGreenApples = filterGreenApples(appleBasket);
        for (Apple GreenApple : filterGreenApples) {
            System.out.println(GreenApple);
        }

        Utility.makeLine();
        //--------------------------------------------------------------
        List<Apple> colorApples = filterApplesByColor(appleBasket, RED);
        for (Apple ca : colorApples) {
            System.out.println(ca);
        }

        Utility.makeLine();
        //--------------------------------------------------------------
        List<Apple> filterApples = filterApples(appleBasket, new LightApplePredicate());
        for (Apple filterApple : filterApples) {
            System.out.println(filterApple);
        }

        //빨강 사과 필터링(익명 클래스 사용)
        Utility.makeLine();
        //--------------------------------------------------------------
        List<Apple> filterApples1 = filterApples(appleBasket, apple -> apple.getColor() == RED);
        for (Apple apple : filterApples1) {
            System.out.println(apple);
        }

        //녹색사과이면서 100g이하 필터링(익명 클래스 사용)
        Utility.makeLine();
        //--------------------------------------------------------------
        List<Apple> filterApples2 = filterApples(appleBasket,
                (apple) -> apple.getColor() == GREEN && apple.getWeight() <= 100
        );
        for (Apple greenWeightApples : filterApples2) {
            System.out.println(greenWeightApples);
        }

        Utility.makeLine();
        //--------------------------------------------------------------
//        filter(appleBasket,
//                apple -> apple.getWeight()>=100
//                && apple.getWeight() <= 150);
        Utility.makeLine();
        //--------------------------------------------------------------
        List<String> wordList = List.of("유사","만들","어져");
        List<String> filter3
                = wordList.stream()
                .filter(w -> w.length() < 5)
                .collect(Collectors.toList())
                ;
        System.out.println("filter3 = " + filter3);

    }

}
