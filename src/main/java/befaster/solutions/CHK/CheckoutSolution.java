package befaster.solutions.CHK;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class CheckoutSolution {
    private Map<String, Product> skuPrices = new Hashtable<>();

    public CheckoutSolution() {
        skuPrices.put("A", new Product("A", 50));
        skuPrices.put("B", new Product("B", 45));
        skuPrices.put("C", new Product("C", 20));
        skuPrices.put("D", new Product("D", 15));
    }

    public Integer checkout(String skus) {
        int total = 0;
        if (Objects.isNull(skus) || skus.length() == 0) {
            return -1;
        }

        String[] skusList = skus.split(",");
        for (String sku : skusList) {
            total += skuPrices.getOrDefault(sku.trim(), new Product("", 0)).getPrice();
        }

        return total;
    }
}


