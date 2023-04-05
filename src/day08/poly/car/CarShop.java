package day08.poly.car;

//자동차 판매 대리점
public class CarShop {
    Car[] cars; //상속시켜서 하나의 타입으로 만든 Car타입에 전부 넣기

    //대리점에 차를 입고하는 기능
    public void importCar() {
        cars = new Car[]{new Mustang(), new Stinger(), new Tucson(),};
    }

    public void runTest() {
        importCar(); //차 입고
        for (Car car : cars) {
            car.accelerate();
        }
    }

    //차를 고객에게 인도하는 기능
    public Car exportCar(int money) {
        if (money == 6000) {
            return new Mustang();
        } else if (money == 5000) {
            return new Stinger();
        } else if (money == 3000) {
            return new Tucson();
        } else {
            return null;
        }

    }
}

