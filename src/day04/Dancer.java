package day04;

//Dancer의 설계도
//설계도에는 main을 만들지 않는다.
public class Dancer {

    //속성(필드)
    String dancerName; //댄서 이름

    String crewName; //크루 이름

    String genre; //춤 장르

    DanceLevel level; //춤 수준(0:초보자, 1:중수, 2:고수)

    //생성자 : 스카우터, 개발자, 기술자
    //생성자도 함수개념, 리턴타입이 void로 고정
    //리턴값은 생성한 객체의 주소값을 리턴
    //객체 생성시 필요한 데이터를 셋팅
    //생성자는 여러개를 만들 수 있다.
    Dancer() {
        dancerName = "갑돌이";
        crewName = "idle";
        genre = "아이돌";
        level = DanceLevel.AMATUER;
    }

    //생성자 오버로딩
    Dancer(String dgenre) {
        dancerName = "홍길동";
        crewName = "활빈당";
        genre = dgenre;
        level = DanceLevel.AMATUER;
    }

    //dName, dGenre, dlevel은 변수, dancerName, crewName, genre, level은 필드
    //변수는 main에서 Dancer()를 생성하면 메모리에서 사라진다.
    Dancer(String dName, String dGenre, DanceLevel dlevel) {
        dancerName = dName;
        crewName = "하하호호";
        genre = dGenre;
        level =dlevel;
    }

    //기능 (메서드) : static을 붙이지 마세요.
    //춤추는 기능
    void dance() {
        System.out.println(genre + "춤을 열정적으로 춥니다.");
    }

    //스트레칭을 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다.");
    }

    //자기소개 기능
    String introduce() {
        //printf형태로 return하고 싶을 시 String.format
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.", dancerName, crewName);
    }
}
