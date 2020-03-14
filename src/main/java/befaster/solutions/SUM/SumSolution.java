package befaster.solutions.SUM;

import befaster.runner.ValidationException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        if (x > 0 && x <= 100) {
            return x + y;
        } else {
            throw new ValidationException("Parameters must be between 0 and 100");
        }
    }

}


