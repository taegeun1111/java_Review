package day02;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        //배열 복사 알고리즘
        String[] pets = new String[] {"멍멍이","야옹이","짹짹이"};
//        String[] petscopy = pets;

        String[] petsCopy = new String[pets.length];

        for (int i = 0; i <pets.length; i++) {
            petsCopy[i]=pets[i];
        }

        pets[1] = "사마귀";

        System.out.println("원본배열 : "+Arrays.toString(pets) );
        System.out.println("사본배열 : "+Arrays.toString(petsCopy) );

    }
}
