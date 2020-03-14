package befaster.solutions.CHK;

import com.google.common.collect.ImmutableMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class CheckoutSolution {
    private Map<String, Product> skuPrices = new Hashtable<>();

    public CheckoutSolution() {
        Product productA = new Product("A", 50);
        productA.setOffers(ImmutableMap.of(3, 130));
        skuPrices.put("A", productA);

        Product productB = new Product("B", 45);
        productB.setOffers(ImmutableMap.of(2, 45));
        skuPrices.put("B", productB);

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



