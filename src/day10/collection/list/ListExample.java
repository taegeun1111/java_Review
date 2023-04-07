package day10.collection.list;

import day07.util.Utility;

import java.util.*;

import static day07.util.Utility.*;

/**
 *  - 저장 데이터의 순서를 보장
 *  - 인덱스를 가지고 있음
 *  - 중복 데이터를 저장 가능
 *  ex)추천데이터, 게시물 순서
 */
public class ListExample {

    public static List<String> foodList;

    public static void main(String[] args) {
        foodList = new ArrayList<>();
        //다형성을 위해 객체의 타입을 List로 사용

        /**
         * add(E e) : 끝 추가
         */
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("유린기");
        foodList.add("팔보채");
        foodList.add("볶음밥");
        foodList.add("삼선짬뽕");

        int size = foodList.size();
        System.out.println("size = " + size);

//        System.out.println(foodList.toString());
        //toString 생략 가능
        System.out.println(foodList);

        /**
         * add(index, element) : 중간 삽입
         */
        foodList.add(2,"족발");


        /**
         * indexOf(E e) : 해당 데이터의 인덱스 반환
         */
        int index = foodList.indexOf("팔보채");
        System.out.println("index = " + index);

        /**
         * contains(E e) : 해당 데이터 저장 유무 확인
         */
        System.out.println(foodList.contains("짜장면"));
        System.out.println(foodList.contains("탕수육"));

        /**
         * remove(index), remove(obj)
         */
        String remove = foodList.remove(1);
        //index로 지우면 지운 데이터를 추출해준다.
        foodList.remove("삼선짬뽕");
        System.out.println(foodList);

        /**
         * set(index,newElement) : 수정
         */
        //배열이 private로 설정되어 있어서 foodlist[0]="값"으로 설정하지 못하는 대신 메서드로 수정가능하다.
        foodList.set(0,"동파육");
        System.out.println(foodList);

        /**
         * get(index) : 리스트에 저장된 데이터 참조
         */
        String s = foodList.get(1);
        System.out.println("s = " + s);

        /**
         * 반목문 처리
         */
        makeLine();
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }
        makeLine();
        for (String food : foodList) {
            System.out.print(food+",");
        }

        /**
         * clear() : 내부 데이터 전체삭제
         */
        makeLine();
        foodList.clear();
        System.out.println("foodList = " + foodList);
        System.out.println(foodList.isEmpty());

        /**
         * 리스트에 초기값 넣고 시작하기
         */
        List<String> tvxq = new ArrayList<>(
                Arrays.asList("유노윤호","최강창민")
        );
        System.out.println(tvxq);

        /**
         * 정렬 (듀얼 피벗 퀵 정렬)
         */
        makeLine();
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(5,30,17,9,52,41)
        );
        System.out.println(numbers);

        // ==> 오름차순 정렬
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);
        // ==> 내림차순 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);


    }
}
