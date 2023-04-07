package day10.exception_;

public class ThrowsMain {
    public static ThrowsExample te;
    public static void main(String[] args) {
        te = new ThrowsExample();

        int n = te.inputNumber();
        int m = te.convert("100");
        System.out.println(n);
        System.out.println(m);
    }
}
