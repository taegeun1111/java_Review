package day09.final_;

public class Main {
    public static void main(String[] args) {
        Person kim = new Person("김철수", "000001-12313312",
                "대한민국", new BagPack(5, "잔스포츠"));

        kim.name = "김출수";
//        kim.ssn="123123-2312333"; //변경 불가


    }
}
