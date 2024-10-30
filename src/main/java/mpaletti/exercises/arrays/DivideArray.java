package mpaletti.exercises.arrays;

public class DivideArray {
    public static double[] divideArray(double[] v,double fatctor){
        double[] out=new double[v.length];
        for (int i=0;i<v.length;i++){
            out[i]=v[i]/fatctor;
        }
        return out;
    }
}
