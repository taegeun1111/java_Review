package test;
import java.util.Objects;

import static test.categoryType.*;
public class CartAll {
    private String orderCnt;
    private String orderPrice;
    private categoryType categoryType;

    public CartAll() {
    }

    public CartAll(String orderCnt, String orderPrice, categoryType categoryType) {
        this.orderCnt = orderCnt;
        this.orderPrice = orderPrice;
        this.categoryType = categoryType;
    }

    public String getOrderCnt() {
        return orderCnt;
    }

    public void setOrderCnt(String orderCnt) {
        this.orderCnt = orderCnt;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public categoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(categoryType categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "CartAll{" +
                "orderCnt='" + orderCnt + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartAll cartAll = (CartAll) o;
        return Objects.equals(orderCnt, cartAll.orderCnt) && Objects.equals(orderPrice, cartAll.orderPrice) && categoryType == cartAll.categoryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderCnt, orderPrice, categoryType);
    }
}
