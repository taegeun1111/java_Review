package day12.lambda;

import day06.modi.pac1.A;

import java.util.ArrayList;
import java.util.List;

import static day12.lambda.Color.*;

//사과를 여러 방법으로 필터링
public class FilterApple {
    /**
     * @param basket : 여러 사과가 모여있는 바구니
     * @return : 녹색사과들만 모여있는 바구니
     * @solution - try1 : 사과바구니에서 녹색사과만 필터링해야 한다.
     * @problem : 만약 다른 색깔의 사과를 필터링해야 한다면? 새로운 메서드가 필요
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) { //사과 목록
        //녹색사과만 담을 바구니
        List<Apple> greenApples = new ArrayList<>();

        //반복문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == GREEN) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    /**
     * @solution - try2 : 색상을 파라미터화 한다
     * @problem
     * - filter 기준이 색상이 아니라 무게라면?
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color){
        //특정 색상 사과만 담을 바구니
        List<Apple> filteredApples = new ArrayList<>();

        //반복문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @solution - try3 : 동작을 파라미터화 한다 -> 추상적 조건으로 필터링
     *
     * @problem
     * - 오렌지바구니를 필터링해야한다면?
     * - 전자제품바구니를 필터링해야한다면?
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate p){
        List<Apple> filteredApples = new ArrayList<>();

        //반복문을 통해 필터링
        for (Apple apple : basket) {
            if (p.test(apple)) {
                //if()파라미터를 추상메서드로 받고 상황에 따라 오버라이딩을 실행
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @solution - try4 : 제네릭 필터 메서드 생성
     */
    //리턴타입에 제네릭 표시를 사용하면 반드시 그 앞에 제네릭 타입을 붙여야 한다.
    public static <T> List<T> filter(List<T> basket, GenericPredicate p){
        List<T> filterList = new ArrayList<>();
        for(T t : basket){
            if(p.test(p)){
                filterList.add(t);
            }
        }
        return filterList;
    }

}
