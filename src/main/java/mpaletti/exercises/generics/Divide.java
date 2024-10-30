package mpaletti.exercises.generics;

public class Divide {
    public static <T extends Number> double divide(T a, T b){
        double diviso= a.doubleValue()/b.doubleValue();
        return diviso;
    }
}
