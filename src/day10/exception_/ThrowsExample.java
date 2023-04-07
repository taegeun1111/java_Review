package day10.exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 모든 곳에 try/catch를 넣기 힘들 때 Throws를 사용
 * 만든 사람이 try/catch를 하는 것이 아니라
 * 사용하는 사람(Main)쪽에 일괄적으로 한 곳에 모아서 사용
 */
public class ThrowsExample {

    //정수를 입력받아서 리턴하는 메서드
    public int inputNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    //문자열을 정수로 변환하는 기능
    public int convert(String num) throws NumberFormatException, NullPointerException{
        int n = Integer.parseInt(num);
        return n;
    }

    public void convertAndInput(){
        try {
            int n = inputNumber();
            int m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수입력해주세요");
        } catch (NumberFormatException e) {
            System.out.println("숫자변환 불가");
        }
    }
}
