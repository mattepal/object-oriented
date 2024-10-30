package mpaletti.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {

    final int numerator;
    final int denominator;
    public RationalNumber(int numerator, int denominator) {
        int gcd=greatestCommonDivisor(numerator,denominator);
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
    }
    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }
    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
    public RationalNumber add(RationalNumber o){
        int den=leastCommonMultiple(o.getDenominator(),this.denominator);
        int num= o.getNumerator()*this.denominator+this.numerator*o.getDenominator();
        return new RationalNumber(num,den);
    }
    public RationalNumber multuply(RationalNumber o){
        return new RationalNumber(o.getNumerator()*this.numerator,o.getDenominator()*this.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RationalNumber that)) return false;
        return getNumerator() == that.getNumerator() && getDenominator() == that.getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator(), getDenominator());
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
