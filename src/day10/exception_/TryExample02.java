package day10.exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sc.close();
        try {
            System.out.print("정수1: ");
            int n1 = sc.nextInt();  //InputMismatchException

            System.out.print("정수2: ");
            String strN2 = sc.next();

            int n2 = Integer.parseInt(strN2);   //NumberFormatException

            int result = n1/n2; //ArithmeticException
            System.out.println("result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("첫번째 숫자는 정수로만 입력해주세요.");
        }catch (NumberFormatException e){
            System.out.println("두번째 숫자는 정수로만 입력해주세요.");
        }catch (Exception e){   //생각지도 못한 에러가 발생할 때 잡아준다.
            System.out.println("알 수 없는 에러입니다. 관리자에게 문의하세요.");
        }

        System.out.println("프로그램 정상 종료");


    }

}
