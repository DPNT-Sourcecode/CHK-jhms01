package befaster.solutions.CHK;

/**
 * @author Asif Akhtar
 * 14/03/2020 22:00
 */
public class Ordered {
    private String sku;
    private int ordered;

    public Ordered(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    public void add() {
        this.ordered += 1;
    }
}
