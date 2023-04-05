package day08.poly;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class Basic {
    Object x = new A();
    // 다형성 : 자식의 객체가 부모의 타입을 사용할 수 있는 것
    // 간단하게 말하면 객체에서 말하는 타입캐스팅을 의미
    // 자식 객체는 상속관계에 있는 상위타입을 사용할 수 있다.


    A x1 = new A();     //A객체의 타입은 A 하단 동일
    A x2 = new B();
    A x3 = new C();
    A x4 = new D();
    A x5 = new E();
    //C의 형태를 가질 수 있고, E의 형태도 가질 수 있다.


    void test(){
        int a = 10;
        double b = a;

        B x = new B();
        A z = x;
        C y = (C)z; //다운캐스팅
    }


}


