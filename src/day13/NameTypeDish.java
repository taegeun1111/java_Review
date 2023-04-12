package day13;

public class NameTypeDish {
    private final String name;
    private final Dish.Type type;

    public NameTypeDish(Dish dish){
        this.name = dish.getName();
        this.type = dish.getType();
    }

    public NameTypeDish(String name, Dish.Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Dish.Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "NameTypeDish{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
