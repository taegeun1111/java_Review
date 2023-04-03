package day06.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜져");

//        myCar.setSpeed(-500);
        myCar.setSpeed(150);

        myCar.setMode('A');
        System.out.println(myCar.getSpeed());
        System.out.println(myCar.getMode());

        myCar.pressButton();
//        myCar.inject();
//        myCar.putOil();
//        myCar.moveCylinder();



    }
}
