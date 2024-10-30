package mpaletti.exercises.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;
public class FillArray {
    public static double[] fillArray(int size,double value,boolean addNoise){
        double[] dst=new double[size];
        Arrays.fill(dst,value);
        if (addNoise){
            RandomGenerator rnd= RandomGenerator.getDefault();
            for (int i=0;i<size;i++){
                dst[i]+=rnd.nextDouble(-value,value)*0.05;
            }
        }
        return dst;
    }
}
