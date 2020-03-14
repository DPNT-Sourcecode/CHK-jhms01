package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Asif Akhtar
 * 14/03/2020 21:01
 */
public class HelloSolutionTest {
    private HelloSolution helloSolution;

    @Before
    public void setup() {
        helloSolution = new HelloSolution();
    }

    @Test
    public void should_return_simple_hello_message_with_a_name() {
        assertThat(helloSolution.hello("Fred"), is("Hello, Fred!"));
    }
}