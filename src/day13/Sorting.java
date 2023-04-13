package day13;

import day07.util.Utility;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.util.Utility.makeLine;
import static day13.Menu.*;
import static java.util.stream.Collectors.toList;

public class Sorting {

    //stream의 정렬 sorted
    public static void main(String[] args) {
        //오름차
        menuList.stream()
                .sorted(Comparator.comparing(d->d.getCalories()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();
        //메뉴 목록 중 이름으로 내림차 정렬(zyx순)
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(Comparator.comparing(cal->cal.getCalories()))
                .limit(4)
                .collect(toList())
                .forEach(System.out::println);


    }

}
