package day12.inner;

public class AddCalculator implements Calculator {

    //인터페이스를 클래스를 통해 구체화시킨 다음 재정의하고 구체화된
    //객체를 생성
    @Override
    public int operate(int n1, int n2) {
        return n1+n2;
    }
}
