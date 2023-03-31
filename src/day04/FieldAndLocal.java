package day04;

public class FieldAndLocal {
    int a; //필드

    void test(int b){ //변수
        int c; //지역변수

        if(a>10){
            c=99;
        } else if (a<5) {
            c=-100;
        }else{
            c=55;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // a는 필드이기 때문에 기본값이 들어가있다.
        // b는 객체생성 후 함수호출할 때 값을 받는다.
        // c는 지역변수이기 때문에 초기화를 해주지 않으면 오류가 난다.
    }
}
