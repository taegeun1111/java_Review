package day09.abs;

public abstract class Pet {
    private String name; //이름
    private String kind; //종
    private int age; //나이

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //오버라이딩을 위한 메서드
    public abstract void takeNap();
    public abstract void eat();

    public void walk(){
        System.out.println("애완동물은 산책을 합니다.");
    }
}
