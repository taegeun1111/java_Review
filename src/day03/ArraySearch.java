package day03;

public class ArraySearch {
    static String[] foods = {"삼겹살", "족발", "피자", "햄버거"};

    public static int indextOf(String target) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int index = indextOf("족발");
        System.out.println(index);
        System.out.println(foods);
    }

}
