package day13;

import day07.util.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Dish.Type.*;
import static day13.Menu.*;
import static java.util.stream.Collectors.*;

public class Filter {
    public static void main(String[] args) {
        //stream의 filter
        //필터조건에 맞는 데이터들을 필터링

        //메뉴목록중에 채식주의자가 먹을 수 있는 요리를 알려주세요.
        /* 요약 전
        List<Dish> vegeList = new ArrayList<>();
        for (Dish dish : vegeList) {
            if(dish.isVegeterian()){
                vegeList.add(dish);
            }
        }
         */
        /*
                List<Dish> filteredList = menuList.stream()
                .filter(new Predicate<Dish>() {
                    @Override
                    public boolean test.test(Dish dish) {
                        return dish.isVegeterian();
                    }
                })
                .collect(Collectors.toList());
         */

        List<Dish> filteredList = menuList.stream()
                .filter(dish -> dish.isVegeterian())
                .collect(toList());

        System.out.println("=====채식주의자 식용 요리 목록=====");
//        for (Dish dish : filteredList) {
//            System.out.println(dish);
//        }

        filteredList.forEach(System.out::println); //메서드 참조
        /*
        filteredList.forEach(new Consumer<Dish>() {
            @Override
            public void accept(Dish dish) {
                System.out.println(dish);
            }
        });
         */

        //메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링
        makeLine();
        menuList.stream()
                .filter(d -> d.getType() == MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));


        makeLine();
        menuList.stream()
                .filter(name -> name.getName().length() == 4)
                .collect(toList())
                .forEach(System.out::println);


        //메서드 체인 예제
        char c = "Hello world"
                .toUpperCase()
                .substring(0, 5)
                .charAt(2);

        System.out.println("c = " + c);

        makeLine();

        //원하는 개수만 필터링하기
        //칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만(limit) 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) //앞에서부터 3개만 추출
                .collect(toList())
                .forEach(System.out::println);

        makeLine();

        //칼로리가 300칼로리보다 높은 요리 중 처음 2개는 제외(skip)하고 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) //처음 2개 제외
                .collect(toList())
                .forEach(System.out::println);

        //메뉴 목록에서 처음 등장하는 2개의 고기요리를 필터링해서 출력
        List<Dish> collect = menuList.stream()
                .filter(s -> s.getType() == MEAT)
                .limit(2)
                .collect(toList());

        makeLine();
        collect.forEach(System.out::println);

        makeLine();
        List<Integer> numbers = List.of(5, 3, 1, 3, 3, 5, 7, 2);

        //리스트에서 중복 제거(distinct)하기
        List<Integer> distinctedList = numbers.stream()
                .filter(s -> s%2 == 0)
                .distinct() //중복제거
                .sorted()
                .collect(toList());

        System.out.println("distinctedList = " + distinctedList);

    }
}
