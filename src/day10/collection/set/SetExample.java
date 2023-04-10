package day10.collection.set;

import java.util.*;

/**
 * <Set>
 * - 집합 자료구조
 * - 저장순서를 보장하지 않음
 * - 인덱스, 키를 사용하지 않아서 개별탐색이 불리함
 * - 저장값의 중복을 허용하지 않음
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> foodset = new HashSet<>();

        /**
         * add(E e) 데이터 추가
         */
        foodset.add("김말이");
        boolean flag1 = foodset.add("김밥");
        foodset.add("단무지");
        boolean flag2 = foodset.add("김밥");
        foodset.add("라면");

        System.out.println(foodset.size());
        System.out.println(foodset);
        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);

        //fori는 인덱스가 없기 때문에 사용하지 못한다.
        for (String food : foodset) {
            System.out.println("food = " + food);
        }

        //remove(obj) : 삭제
        foodset.remove("라면");
        System.out.println(foodset);

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,1,1,3,3,5,6,7,8)
        );
        
        //리스트를 SET으로 반환
        Set<Integer> numberSet = new HashSet<>(numbers);
//        numberSet.addAll(numbers);
        System.out.println("numberSet = " + numberSet);


    }
}
