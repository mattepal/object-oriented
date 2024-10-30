package mpaletti.exercises.exceptions;

import java.util.Map;

public class DivisionSquared {
    public static int divisionSquared(int a, int b) {
        try {
            return (int)Math.pow(a/b,2);
        }
        catch ( ArithmeticException e){
            return 0;
        }
    }
}
