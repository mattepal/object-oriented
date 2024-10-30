package mpaletti.exercises.arrays;

import java.util.Arrays;

public class CanBalance {

    public static int summ(int[] v,int begin,int end){
        int sum=0;
        for (int i=begin;i<end;i++){
            sum=sum+v[i];
        }
        return sum;
    }
    public static boolean canBalance(int[] v){
        if (v.length<2){
            return false;
        }
        int sumbeg= summ(v,0,1);
        int sumend=summ(v,1,v.length);
        for (int i=0;i<v.length;i++){
            if(sumbeg==sumend){
                return true;
            }
            sumend-=v[i];
            sumbeg+=v[i];
        }
        return false;
    }
}
