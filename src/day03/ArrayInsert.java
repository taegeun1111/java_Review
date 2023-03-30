package day03;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        //20이랑 30사이에 insert
        int targetIndex = 1;
        int newData = 25;

        //1. 배열 사이즈를 먼저 1 늘려놓기
        int[] temp = new int[arr.length + 1];
        //2. 늘려놓은 배열에 원본배열을 다 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        System.out.println("수정 전 : " + Arrays.toString(temp));
        //3. 맨 뒤부터 targetIndex까지 한칸씩 뒤로 민다.
        for (int i = temp.length - 1; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }
//        temp[5] = arr[4];
//        temp[4] = arr[3];
//        temp[3] = arr[2];
        //4. targetIndex 자리에 새 데이터를 넣는다.
        temp[targetIndex] = newData;
        //5. 주소를 바꾼다.
        arr = temp;
        temp = null;
        System.out.println("수정 후 : " + Arrays.toString(arr));
    }
}
