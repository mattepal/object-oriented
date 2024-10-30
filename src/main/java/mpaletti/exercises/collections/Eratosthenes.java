package mpaletti.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> sequence= new HashSet<>();
        for (int i=2;i<=n;i++){
            sequence.add(i);
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            sequence.removeAll(multiples(i,n));
        }
        return sequence;
    }
    public static Set<Integer> multiples(int i,int limit){
        Set<Integer> ret=new HashSet<>();
        for (int j=2;j*i<=limit;j++){
            ret.add(j*i);
        }
        return ret;
    }
}
