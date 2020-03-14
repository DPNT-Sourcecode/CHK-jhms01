package befaster.solutions.CHK;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class CheckoutSolution {
    private Map<String, Product> skuPrices = new Hashtable<>();

    public CheckoutSolution() {
        skuPrices.put("A", new Product("A", 50).offer(3, 130));
        skuPrices.put("B", new Product("B", 30).offer(2, 45));
        skuPrices.put("C", new Product("C", 20));
        skuPrices.put("D", new Product("D", 15));
    }

    public Integer checkout(String skus) {
        if (Objects.isNull(skus) || skus.equalsIgnoreCase("-")) {
            return -1;
        }

        Map<String, Ordered> ordered = new Hashtable<>();
        String[] skusList = skus.split(",");
        for (String sku : skusList) {
            if (!ordered.containsKey(sku.trim())) {
                ordered.put(sku.trim(), new Ordered(sku.trim()));
            }
            Ordered currentOrder = ordered.get(sku.trim());
            currentOrder.add();
        }

        return ordered.values().stream().mapToInt(o -> {
            Product product = skuPrices.getOrDefault(o.getSku(), new Product("", 0));
            return product.calculateProductTotal(o.getOrdered());
        }).sum();
    }
}





