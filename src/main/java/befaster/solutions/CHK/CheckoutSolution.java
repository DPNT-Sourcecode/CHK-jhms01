package befaster.solutions.CHK;

import java.math.BigInteger;
import java.util.Arrays;
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
//        BigInteger.valueOf(0l)
        if (Objects.isNull(skus) || skus.length() == 0) {
            return -1;
        }

//        Arrays.asList(skus.split(",")).forEach(sku->{
//
//        });

        return skuPrices.getOrDefault(skus, -1);
    }
}
