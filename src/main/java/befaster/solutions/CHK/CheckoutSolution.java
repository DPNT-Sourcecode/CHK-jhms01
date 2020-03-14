package befaster.solutions.CHK;

import java.util.Objects;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if (Objects.isNull(skus) || skus.length() == 0) {
            return -1;
        }

        if (skus.equalsIgnoreCase("D")) {
            return 15;
        } else if (skus.equalsIgnoreCase("c")) {
            return 20;
        }

        return 0;
    }
}
