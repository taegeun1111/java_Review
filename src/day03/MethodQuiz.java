package day03;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String food) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = food;
        foods = temp;
        temp = null;
    }

    static int indexOf(String food) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == food) {
                index = i;
                return i;
            }
        }
        return index;
    }

    static void remove(String food) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == food) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        if (index > -1) {
            //index = 1
            String[] temp = new String[foods.length - 1];
            for (int i = index; i < temp.length; i++) {
                temp[i] = foods[i-1];
            }
            foods = temp;
            temp = null;
        } else if(index == -1){
            System.out.println("삭제 데이터 없음");
        }
    }


    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();
        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        System.out.println(idx);
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println(idx2);
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println(idx3);


        remove("치킨"); // foods배열에서 김치찌개 제거
        printFoods();
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();

/*
        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        //clear();  // foods배열 모든 데이터 삭제

*/
    }


}