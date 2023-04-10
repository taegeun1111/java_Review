package day11.api.String;

public class StrBuilder {

    private static void makeString() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 500000; i++) {
            s += "A";
        }
        long end = System.currentTimeMillis();

        System.out.println("총 소요시간 : " + (end - start) + "밀리초");
    }

    private static void makeStringBuilder() {

        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 500000; i++) {
            s.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("빌더 총 소요 시간: " + (end - start) + "밀리초");
    }


    public static void main(String[] args) {
        makeString();
        makeStringBuilder();

        Integer a = 10; //오토 박싱. 기본값:null int는 0이므로 초기값에 주의하여야 한다.
        Character c = 'A';
        Byte b = 1;
        Double d = 11.1;
    }
}
