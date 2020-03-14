package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {
        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }

//    @Test(expected = ValidationException.class)
//    public void should_fail_validation_if_first_arg_is_over_100() {
//        sum.compute(101, 1);
//    }
//
//    @Test(expected = ValidationException.class)
//    public void should_fail_validation_if_first_arg_is_less_than_0() {
//        sum.compute(-1, 1);
//    }
//
//    @Test(expected = ValidationException.class)
//    public void should_fail_validation_if_second_arg_is_over_100() {
//        sum.compute(10, 101);
//    }
//
//    @Test(expected = ValidationException.class)
//    public void should_fail_validation_if_second_arg_is_less_than_0() {
//        sum.compute(10, -1);
//    }
}





