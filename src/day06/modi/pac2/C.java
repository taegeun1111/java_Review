package day06.modi.pac2;

import day06.modi.pac1.A;
import day06.modi.pac1.B;

public class C {
    void test(){
        A a = new A();
        a.f1 = 10; //public
//        a.f2 = 20; //default(오류 : 같은 패키지만 허용)
//        a.f3 = 20; //private(오류 : 같은 클래스만 허용)

//        new A(11);
//        new A("zzzz");

        a.m1(); //public
//        a.m2(); //default
//        a.m3(); //private

        B b = new B();


    }


}
