package befaster.solutions.CHK;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class CheckoutSolution {
    private Map<String, Product> skuPrices = new Hashtable<>();

    public CheckoutSolution() {
        skuPrices.put("A", new Product("A", 50).offer(3, 130));
        skuPrices.put("B", new Product("B", 45).offer(2, 45));
        skuPrices.put("C", new Product("C", 20));
        skuPrices.put("D", new Product("D", 15));
    }

    public Integer checkout(String skus) {
        Map<String, Ordered> ordered = new Hashtable<>();
        int total = 0;
        if (Objects.isNull(skus) || skus.length() == 0) {
            return -1;
        }

        String[] skusList = skus.split(",");
        for (String sku : skusList) {
            if (!ordered.containsKey(sku.trim())) {
                ordered.put(sku.trim(), new Ordered(sku.trim()));
            }
            Ordered currentOrder = ordered.get(sku.trim());
            currentOrder.add();
        }

        for (Ordered order : ordered.values()) {
            Product product = skuPrices.getOrDefault(order.getSku(), new Product("", 0));
            total += product.calculateProductTotal(order.getOrdered());
        }

        return total;
    }
}

