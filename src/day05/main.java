package day05;

public class main {
    public static void main(String[] args) {
        player scv = new player("SCV");
        player marine = new player("marine");
        System.out.println("------------------------------");
        player noname = new player();

        marine.attack(scv);
        System.out.println("남은 체력 : "+scv.hp);

        System.out.println("때린 marine 주소 :"+scv);
        System.out.println("맞은 scv 주소 :"+scv);
    }
}
