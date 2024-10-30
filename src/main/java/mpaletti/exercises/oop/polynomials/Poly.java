package mpaletti.exercises.oop.polynomials;

public interface Poly {
    double coefficient(int c);
    double[] coefficients();
    int degree();
    Poly derivative();
}
