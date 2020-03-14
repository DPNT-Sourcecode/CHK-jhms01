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
        assertThat(checkoutSolution.checkout(""), is(0));
    }

    @Test
    public void should_return_negative_for_invalid_skus() {
        assertThat(checkoutSolution.checkout("-"), is(-1));
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
        assertThat(checkoutSolution.checkout("B"), is(30));
    }

    @Test
    public void should_checkout_for_sku_b_with_offers() {
        assertThat(checkoutSolution.checkout("B,B"), is(45));
    }

    @Test
    public void should_checkout_for_sku_a() {
        assertThat(checkoutSolution.checkout("A"), is(50));
    }

    @Test
    public void should_return_negative_for_unknown_product() {
        assertThat(checkoutSolution.checkout("a"), is(-1));
    }

    @Test
    public void should_checkout_for_multiple_skus_of_same_type_no_offers() {
        assertThat(checkoutSolution.checkout("D, D"), is(30));
    }

    @Test
    public void should_checkout_for_multiple_skus_of_different_type_no_offers() {
        assertThat(checkoutSolution.checkout("C, D"), is(35));
    }

    @Test
    public void should_checkout_for_skus_with_offers() {
        assertThat(checkoutSolution.checkout("A,A,A"), is(130));
    }

    @Test
    public void should_checkout_for_skus_with_offers_and_no_offers() {
        assertThat(checkoutSolution.checkout("A,A,A,D"), is(145));
    }

    @Test
    public void should_checkout_for_skus_with_multiple_offers() {
        assertThat(checkoutSolution.checkout("A,A,A,B,B"), is(175));
    }
}


