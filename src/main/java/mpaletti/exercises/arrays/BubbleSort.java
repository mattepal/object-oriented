package mpaletti.exercises.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[]v){
        boolean change= true;
        while (change){
            change=false;
            for (int i=0;i<v.length-1;i++){
                if (v[i]>v[i+1]){
                    change=true;
                    int tmp=v[i];
                    v[i]=v[i+1];
                    v[i+1]=tmp;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] out= Arrays.copyOf(v,v.length);
        bubbleSort(out);
        return out;
    }

}
