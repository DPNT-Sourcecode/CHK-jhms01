package befaster.solutions.CHK;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Asif Akhtar
 * 14/03/2020 21:49
 */
public class Product {
    private String sku;
    private int price;
    private Map<Integer, Integer> offers = new Hashtable<>();

    public Product(String sku, int price) {
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Map<Integer, Integer> getOffers() {
        return offers;
    }

    public void setOffers(Map<Integer, Integer> offers) {
        this.offers = offers;
    }

    public int calculateProductTotal(int ordered) {
        return getOffers().getOrDefault(ordered, ordered * price);
    }
}
