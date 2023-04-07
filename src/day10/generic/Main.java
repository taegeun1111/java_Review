package day10.generic;

import day04.Array.StringList;
import day09.quiz2.Artist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AppleBasket ap = new AppleBasket();
        ap.setApple(new Apple());
        Apple apple = ap.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();


        Basket<Apple> apples = new Basket<>();
        apples.setFruit(new Apple());
        Apple apple1 = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
        bananas.setFruit(new Banana());
        Banana banana1 = bananas.getFruit();

        System.out.println("banana1 = " + banana1);
        System.out.println("apple1 = " + apple1);


        MyList<String> objectMyList = new MyList<>();
        objectMyList.push("짬뽕");
        objectMyList.push("짜장");
        objectMyList.push("탕수육");
        System.out.println(objectMyList);

        MyList<Integer> numbers = new MyList<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        System.out.println(numbers);

        MyList<Artist> artist = new MyList<>();
        artist.push(new Artist("동방신기", new StringList("hug")));
        Object[] getsArr = artist.getsArr();
        String s = artist.toString();

    }
}
