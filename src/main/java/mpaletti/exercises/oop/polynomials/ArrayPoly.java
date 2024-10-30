package mpaletti.exercises.oop.polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {

    double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double coefficient(int c) {
        return coefficients[c];
    }

    @Override
    public double[] coefficients() {
        double[] ret= new double[coefficients.length];
        for (int i=0;i<coefficients.length;i++){
            ret[i]=coefficients[i];
        }
        return ret;
    }

    @Override
    public int degree() {
        return coefficients.length-1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
}
