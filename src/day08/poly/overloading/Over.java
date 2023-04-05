package day08.poly.overloading;

/**
 * 오버라이딩 : 부모클래스의 메서드를 자식이 재정의하는 것
 * 오버로딩 : 하나의 클래스 안에서 같은 이름의
 *            메서드를 여러개 선언하는 것
 *
 * 오버로딩의 조건 : 반드시 매개변수의 타입, 순서, 개수가 달라야 한다.
 *                   리턴다입과 접근제한자는 관련이 없다.
 */
public class Over {

    //데이터를 전달하면 데이터의 타입을 알려주는 기능

    //alertType(String)
    void alertType(String s){
        System.out.println("전달된 데이터는 문자열입니다.");
    }
    //alertType(int)
    void alertType(int x) {
        System.out.println("전달된 데이터는 정수입니다.");
    }
    //alertType(int,int)
    void alertType(int x, int y) { //개수가 다르면 가능
    }
    //    int alertType(int x, int y) { //개수가 다르면 가능
    //    } => 리턴 다입이 달라도 매개변수가 같으면 생성이 되지 않는다.

    //alertType(int,String)
    void alertType(int x, String y) {}
    //alertType(String,int)
    void alertType(String y, int x) {} //순서가 다르면 가능

    void test(){
        alertType("3",3);
    }

    //사용하는 경우 : println
}
