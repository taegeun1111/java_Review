package day08.poly.car;

import day07.util.Utility;

public class Main {
    public static void main(String[] args) {
        CarShop shop = new CarShop();
        shop.runTest();

        Utility.makeLine();

        Driver park = new Driver();

        park.drive(new Mustang());
        park.drive(new Stinger());

        Utility.makeLine();

        Car mustang = new Mustang();
        mustang.accelerate();
//        mustang.powerSound();

        Stinger stinger = new Stinger();
        stinger.accelerate();

        /*
        Car car = shop.exportCar(6000)/
        System.out.println("car = " + car);
        car.powerSound(); => 호출안됨.
        */


        Mustang car = (Mustang)shop.exportCar(6000);

        //하위타입 확인 방법 : instanceof
//        System.out.println(car instanceof Stinger); // Car가 Stinger의 객체인가? => false
        System.out.println(car instanceof Mustang);

        //Mustang의 기능을 사용하고 싶으면 다운캐스팅을 해줘야 한다.
        car.powerSound();

    }
}
