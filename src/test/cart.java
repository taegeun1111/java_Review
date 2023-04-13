package test;

public class cart {
    private int espressoTotalPrice;
    private int latteTotalPrice;

    public cart() {
    }

    public cart(int espressoTotalPrice, int latteTotalPrice) {
        this.espressoTotalPrice = espressoTotalPrice;
        this.latteTotalPrice = latteTotalPrice;
    }

    public int getEspressoTotalPrice() {
        return espressoTotalPrice;
    }

    public void setEspressoTotalPrice(int espressoTotalPrice) {
        this.espressoTotalPrice = espressoTotalPrice;
    }

    public int getLatteTotalPrice() {
        return latteTotalPrice;
    }

    public void setLatteTotalPrice(int latteTotalPrice) {
        this.latteTotalPrice = latteTotalPrice;
    }
}
