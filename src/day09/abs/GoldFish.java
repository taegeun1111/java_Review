package day09.abs;

public class GoldFish extends Pet{
    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("골드피쉬 잠");
    }

    @Override
    public void eat() {
        System.out.println("골드피쉬 밥");

    }
}
