package day03;

public class MethodBasic {

    //함수 : 코드블록의 기능적 표현
    //ex) add(10,20)
    //메서드 : 객체의 동작 표현
    //ex) 샤프계산기.add(10,20)
    //    카시오계산기.add(20,30)

    //2개의 정수를 더해서 리턴하는 메서드
    //static을 붙히면 함수처럼 보이게 하는 기능을 하고, 실제 함수는 아니다.
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static void makeLine() {
        System.out.println("-------------------------");
    }

    //여러 값을 리턴하고 싶은 경우
    //2개 정수 전달하면 덧셈,뺄셈,곱셈 결과 리턴
    int[] operateAll(int n1, int n2) {
//        int[] result = {
//                n1+n2,
//                n1-n2,
//                n1*n2
//        };
        int[] result = {
                n1 + n2,
                n1 - n2,
                n1 * n2
        };
        return result;
    }

    //n개의 정수를 전달받아 총합을 리턴
    // static int addAll(int[] numbers) {
    // 배열 스프레드 가능
    static int addAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    //2개의 정수 배열을 전달받아
    //들어있는 숫자의 개수가 더 많은 배열을 리턴하는 메서드
    static int[] compareNumbers(int[] arr1, int[] arr2) {
//        if(arr1.length>arr2.length) {
//            return arr1;
//        }else{
//            return arr2;
//        }
        return arr1.length > arr2.length ? arr1 : arr2;
    }


    public static void main(String[] args) {

        System.out.println(add(10, 20));
        int ra = addAll(new int[]{10, 20, 30});
        System.out.println(ra);
        int r2 = addAll(10, 20, 30, 40);
        System.out.println(r2);
    }
}
