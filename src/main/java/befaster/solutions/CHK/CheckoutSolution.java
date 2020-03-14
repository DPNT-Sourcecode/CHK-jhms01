package befaster.solutions.CHK;

import java.util.Objects;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if (Objects.isNull(skus) || skus.length() == 0) {
            return -1;
        }

        return 0;
    }
}
