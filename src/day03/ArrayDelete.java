package day03;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제전 : " + Arrays.toString(arr));
        //중간 배열(arr[1]) 삭제
//        arr[1] = arr[2];
//        arr[2] = arr[3];
//        arr[3] = arr[4];
//        arr[4] = arr[5];

        //정규식
        int delInext = 1;
        for (int i = delInext; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //pop : 마지박 배열 제거
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        System.out.println("삭제후 : " + Arrays.toString(arr));
    }

}

