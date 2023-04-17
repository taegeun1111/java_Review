package test;

import java.util.ArrayList;
import java.util.List;
import static test.categoryType.*;

public class RepositoryTest {
    public static List<CartAll> cart;

    static {
        cart = new ArrayList<>(
                List.of(
                        new espressoCart("1","4500",ESPRESSO),
                        new latteCart("10","230",LATTE)
                )
        );
    }

    public static void main(String[] args) {
        for (CartAll cartAll : cart) {
cartAll.getOrderCnt();
        }
    }
}
