package day11.api.system;

import java.util.Arrays;

public class SystemExample {
    public static void main(String[] args) {
        //운영체제의 현재 시간 읽기
        //currentTimeMillis : 1970년 1월 1일 00:00부터 현재 까지 1/1000초 단위로 리턴
        long time = System.currentTimeMillis();
        System.out.println("time = " + time);

        //코드 : 프로그램 실행시간 측정
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time);

        //배열 카피
        int[] arr = {10,20,30};
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr,0,copyArr,0,arr.length);
        //원본,원본의 시작위치, 사본, 사본의 시작위치, 길이
        System.out.println(Arrays.toString(copyArr));
    }

}
