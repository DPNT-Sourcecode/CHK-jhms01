package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Asif Akhtar
 * 14/03/2020 21:12
 */
public class CheckoutSolutionTest {
    private CheckoutSolution checkoutSolution;

    @Before
    public void setup() {
        checkoutSolution = new CheckoutSolution();
    }

    @Test
    public void should_return_negative_for_null_skus() {
        assertThat(checkoutSolution.checkout(null), is(-1));
    }

    @Test
    public void should_return_negative_for_blank_skus() {
        assertThat(checkoutSolution.checkout(null), is(-1));
    }

    @Test
    public void should_checkout_for_sku_d() {
        assertThat(checkoutSolution.checkout("D"), is(15));
    }

    @Test
    public void should_checkout_for_sku_c() {
        assertThat(checkoutSolution.checkout("C"), is(20));
    }

    @Test
    public void should_checkout_for_sku_b() {
        assertThat(checkoutSolution.checkout("B"), is(45));
    }

    @Test
    public void should_checkout_for_sku_a() {
        assertThat(checkoutSolution.checkout("A"), is(50));
    }

    @Test
    public void should_checkout_for_multiple_skus_of_same_type_no_offers() {
        assertThat(checkoutSolution.checkout("D, D"), is(30));
    }
}