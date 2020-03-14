package befaster.solutions.SUM;

import befaster.runner.ValidationException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        if (validated(x, 0, 100) && validated(y, 0, 100)) {
            return x + y;
        } else {
            throw new ValidationException("Parameters must be between 0 and 100");
        }
    }

    private boolean validated(int value, int min, int max) {
        return value > min && value <= max;
    }

}



