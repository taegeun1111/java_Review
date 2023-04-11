package day12.inner;

public class Main {

    //내부 클래스(inner class)
    public static class SubCalculator implements Calculator{

        @Override
        public int operate(int n1, int n2) {
            return n1-n2;
        }
    }

    public static void main(String[] args) {

        //덧셈 계산
        Calculator addCalculator = new AddCalculator();
        System.out.println(addCalculator.operate(10,20));

        //뺄셈 계산
        //(다른 패키지에서 사용x. 해당 main에서만 사용)
        SubCalculator subCalculator = new SubCalculator();
        System.out.println(subCalculator.operate(30,10));

        //곱셉 계산
        //익명 클래스
        Calculator multicalculator = new Calculator() {
            //필드 선언 가능
            private String name;

            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        System.out.println(multicalculator.operate(5,6));

        //나눗셈 계산
        //람다식 : 인터페이스의 추상메서드가 딱 1개일때만 사용 가능
        //2개 이상일 때는 추상 클래스
        Calculator divCalculator = (n1, n2) -> n1 / n2;
        System.out.println(divCalculator.operate(50,10));
        /*
        new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1/n2;
            }
        };
        */

        //------------------------------------------------

        //1회용 강아지
        Pet pet = new Pet() {

            @Override
            public void eat() {
                System.out.println("강아지는 개사료를 먹습니다.");
            }

            @Override
            public void play() {
                System.out.println("강아지는 마당에서 뛰어놉니다..");
            }
        };


    }
}
