package day06.modi.pac1;

public class B {   //클래스에 default 제한 : 클래스에는 public과 default만 사용가능

    public int x1;
    int x2;
    private int x3;

    void test() {
        A a = new A();
        a.f1 = 1;   //public
        a.f2 = 1;   //default(동일한 패키지 모두 허용)
//        a.f3 = 1;   //private(오류 : 같은 클래스만 허용)
        new A();
        new A(10);
//        new A("zzz");


        a.m1(); //public
        a.m2(); //default
//        a.m3(); //private(오류 : 같은 클래스만 허용)

    }
}
