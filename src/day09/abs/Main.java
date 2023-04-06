package day09.abs;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("해피","푸들",2),
                new Dog("초코","시츄",2),
                new Dog("최강","불독",2),
                new Cat("나비","러시안블루",2),
        };

        GoldFish goldFish = new GoldFish("골골", "물고기", 3);
        goldFish.eat();


//      오버라이딩을 통해 동물마다 다른 행동
        for (Pet pet : pets) {
            pet.takeNap();
            pet.eat();
        }





    }
}
