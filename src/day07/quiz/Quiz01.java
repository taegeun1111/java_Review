package day07.quiz;

public class Quiz01 {

    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 999; i++) {
            if (i % 3 == 0 && i % 2 != 0)
                a = i;
        }
        System.out.print(a);
    }
}

