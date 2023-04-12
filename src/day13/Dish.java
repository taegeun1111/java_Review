package day13;

public class Dish {
    //static을 빼고 그냥 final을 붙히면
    //요리마다 이름이 다 다르다.
    //생성자를 통해 값을 받는다.
    //하지만 한 번 이름이 정해지면 값을 변경할 수 없다. (유일성)

    //static이 있다면 요리마다 이름이 다 같다.(상수, 불변성)
    private final String name;
    private final boolean vegeterian;
    private final int calories;
    private final Type type;

    public enum Type{
        MEAT,FISH,OTHER;
    }

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
