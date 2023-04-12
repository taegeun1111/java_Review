package day12.lambda;

import day05.member.Gender;
import day05.member.Member;
import day07.util.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.*;

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
        List<Apple> filterApples1 = filterApples(appleBasket, apple-> apple.getColor()==RED);
        for (Apple apple2 : filterApples1) {
            System.out.println(apple2);
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
        filter(appleBasket,
            (apple2)-> apple2.getWeight()<=150 && apple2.getColor()==RED
        );
        for (Apple apple2 : filterApples2) {
            System.out.println("apple십 = " + apple2);
        }


        Utility.makeLine();
        //--------------------------------------------------------------
        List<String> wordList = List.of("유사","만들","어져","erfljwel");
        List<String> filter3
                = wordList.stream()
                .filter(w -> w.length() < 5)
                .collect(Collectors.toList())
                ;
        System.out.println("filter3 = " + filter3);

        Utility.makeLine();
        //--------------------------------------------------------------
        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        Utility.makeLine();
        //--------------------------------------------------------------
        //회원정보에서 회원의 닉네임만 추출
        List<Member> memberList = List.of(
                new Member(1,"aaa@aaa.com","1111","홍길동", Gender.FEMALE,15),
                new Member(2,"bbb@bbb.com","2222","대길이", Gender.MALE,20),
                new Member(3,"ccc@ccc.com","3333","이길이", Gender.MALE,23),
                new Member(4,"ddd@ddd.com","4444","삼길이", Gender.MALE,24),
                new Member(5,"eee@eee.com","5555","사길이", Gender.MALE,25)
        );

        List<String> map = map(memberList, member -> member.memberName);
        System.out.println("map = " + map);

        List<Integer> memberAge = map(memberList, member -> member.age);
        System.out.println("memberAge = " + memberAge);



    }



}
