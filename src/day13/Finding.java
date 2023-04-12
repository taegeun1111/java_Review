package day13;

import java.util.Comparator;
import java.util.Optional;

import static day13.Menu.menuList;

public class Finding {
    public static void main(String[] args) {
        //메뉴 목록에서 채식주의자가 먹을 수 있는 요리가
        //하나라도 존재하는가?

        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.isVegeterian());

        System.out.println(flag1);

        menuList.stream()
                .anyMatch(d -> d.getCalories() < 100);

        //메뉴 목록의 모든 요리(allMatch)가 1000칼로리 미만인가?
        menuList.stream()
                .allMatch(s -> s.getCalories() < 1000);

        //noneMatch : allMathc의 반대
        boolean b = menuList.stream()
                .noneMatch(s -> s.getCalories() < 1000);
        System.out.println("b = " + b);

        Optional<Dish> min = menuList.stream()
                .min(Comparator.comparing(d -> d.getType() == Dish.Type.MEAT));

        System.out.println(min);

    }
}
