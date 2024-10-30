package mpaletti.exercises.oop.polynomials;

import java.util.ArrayList;
import java.util.Date;

public class ListPoly extends AbstractPoly{
    ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<Double>();
        for (double d: coefficients){
            this.coefficients.add(d);
        }
    }

    @Override
    public double coefficient(int c) {
        return coefficients.get(c);
    }

    @Override
    public double[] coefficients() {
        double[] ret= new double[coefficients.size()];
        for (int i=0;i<coefficients.size();i++){
            ret[i]=coefficients.get(i);
        }
        return ret;
    }

    @Override
    public int degree() {
        return coefficients.size()-1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}
