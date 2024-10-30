package mpaletti.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n) {
        if(n<=0){
            return new ArrayList<Long>();
        }
        ArrayList<Long> collatz=new ArrayList<Long>();
        while (n>1){
            collatz.add(n);
            if (n%2==0){
                n/=2;
            }
            else {
                n=n*3+1;
            }
        }
        collatz.add(n);
        return collatz;
    }
}
