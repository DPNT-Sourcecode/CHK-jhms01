package befaster.solutions.CHK;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class CheckoutSolution {
    private Map<String, Integer> skuPrices = new Hashtable<>();

    public CheckoutSolution() {
        skuPrices.put("A", 50);
        skuPrices.put("B", 45);
        skuPrices.put("C", 20);
        skuPrices.put("D", 15);
    }

    public Integer checkout(String skus) {
        int total = 0;
        if (Objects.isNull(skus) || skus.length() == 0) {
            return -1;
        }

        String[] skusList = skus.split(",");
        for (String sku : skusList) {
            total += skuPrices.getOrDefault(sku, 0);
        }

        return total;
    }
}

