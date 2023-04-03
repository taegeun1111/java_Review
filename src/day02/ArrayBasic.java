package day02;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // 배열 객체 생성

        // 동종모음 구조
        int[] arr = new int[5];
        System.out.println("arr = " + arr);

        // foreach문 - 단축키 iter
        System.out.println("========================");

        for (int n : arr) {
            System.out.printf("데이터 : %d\n", n);
        }

        // 배열 내부데이터 문자열로 출력
        System.out.println(Arrays.toString(arr));
    }
}
