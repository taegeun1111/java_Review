package day13;

import java.util.ArrayList;
import java.util.List;

import static day13.Dish.Type.*;

public class Menu {
    public static final List<Dish> menuList;
    //final:목록이 추가되면 메뉴를 변경하지 못한다.
    static {
      menuList = List.of(
              new Dish("pork", false, 800, MEAT),
              new Dish("beef", false, 700, MEAT),
              new Dish("chicken", false, 400, MEAT),
              new Dish("french fries", true, 530, OTHER),
              new Dish("rice", true, 350, OTHER),
              new Dish("season fruit", true, 120, OTHER),
              new Dish("pizza", true, 550, OTHER),
              new Dish("prawns", false, 400, FISH),
              new Dish("salmon", false, 450, FISH)
      );
    }
}
