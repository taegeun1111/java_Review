package day10.generic;

//제네릭은 관례상 한 글자로
public class Basket <F>{
    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }




}
