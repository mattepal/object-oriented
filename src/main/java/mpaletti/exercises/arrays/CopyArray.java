package mpaletti.exercises.arrays;

public class CopyArray {
    public static double[] copyArray(double[] v){
        double[] copy= new double[v.length];
        System.arraycopy(v,0,copy,0,v.length);
        return copy;
    }
}
