package day04;
//Dancer의 설계도
//설계도에는 main을 만들지 않는다.
public class Dancer {

    //속성(필드)
    String dancerName; //댄서 이름

    String crewName; //크루 이름

    String genre; //춤 장르

    int level; //춤 수준(0:초보자, 1:중수, 2:고수)

    //기능 (메서드) : static을 붙이지 마세요.
    //춤추는 기능
    void dance(){
        System.out.println("춤을 열정적으로 춥니다.");
    }

    //스트레칭을 하는 기능
    void stretch(){
        System.out.println("몸을 유연하게 풉니다.");
    }

    //자기소개 기능
    String introduce(){
        //printf형태로 return하고 싶을 시 String.format
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.",dancerName,crewName);
    }
}
