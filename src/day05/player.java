package day05;

public class player {
    String nickName;
    int level;
    int hp;



    //생성자 생성 : 우클릭
    public player() {
        this("이름없음");
        //this()는 나의 또다른 생성자를 호출
        //첫줄에 선언
        //코드 중복 제거

//        System.out.println("1번 생성자 호출");
//        this.nickName = "이름없음";
//        this.level = 1;
//        this.hp = 50;
        //필드라는 것을 확인시켜주기 위해 가능한 this를 붙히기
    }

    public player(String nickName) {
        this(nickName,1,50);
//        System.out.println("2번 생성자 호출");
    }

    public player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    //기능 - 메서드
    void attack(player this, player target) {
//    void attack(player target){

        //자기 자신을 때릴 때
        if (this == target) return;

        //맞은녀석의 체력을 10~15 랜덤으로 감소
        int damage = (int) (Math.random() * 6 + 10);
        target.hp -= damage;

        System.out.println("target 주소 :" + target);
        System.out.println("this 주소 :" + this);

        //전투로그를 출력
        //"가해자가 피해자를 공격해서 xxx의 피해를 입힘"
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘\n"
                , this.nickName, target.nickName, damage);

        /*
         *
         * */
    }


}
