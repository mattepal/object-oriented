package mpaletti.exercises.arrays;


public class DivideArrays {
    public static double[] divideArrays(double[] v1,double[] v2){
        if(v1.length!=v2.length){
           return new double[]{};
        }
        double ret[]=new double[v1.length];
        for (int i=0;i<v1.length;i++){
            ret[i]=v1[i]/v2[i];
        }
        return  ret;
    }
}
