package day13;

import day07.util.Utility;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Menu.menuList;

public class Mapping {
    public static void main(String[] args) {
        //stream의 map : 리스트에서 원하는 정보만 추출

        //메뉴 목록에서 요리의 이름들만 목록으로 추출
        List<String> dishNames = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println("dishNames = " + dishNames);

        makeLine();
        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> collect = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        makeLine();

        //메뉴 목록에서 메뉴이름과 칼로리(두개를 하나로 묶어주는 객체 생성SimpleDish)를 추출하는데
        //칼로리를 정수가 아닌 문자열로 kcal을 뒤로 붙여서 추출 후
        //메뉴이름 : xxxkcal로 반복 출력
        List<SimpleDish> collect1 = menuList.stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList());

        makeLine();
        collect1.forEach(System.out::println);


        //메뉴 목록에서 칼로리가 500칼로리보다 큰 음식들을 필터링한 다음에
        //음식의 [이름과 타입]만 추출해서 출력해주세요.
        makeLine();
        menuList.stream()
                .filter(dish -> dish.getCalories() >= 500)
                .map(dish -> new NameTypeDish(dish))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();
        //메뉴 목록에 있는 요리들의 총 칼로리수 구하기
        double asDouble = menuList.stream()
                .mapToInt(d -> d.getCalories())//int만 사용할 수 있다.
                .average()//총합, 안전 처리를 위해 OptionalDouble로 리턴
                .getAsDouble(); //그런 문제 때문에 getAsDouble()호출

        System.out.println(asDouble);



    }
}
