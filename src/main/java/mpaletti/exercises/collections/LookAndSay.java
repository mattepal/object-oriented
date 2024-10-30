package mpaletti.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {
    public static List<Long> lookAndSay(long n){
        if (n<=0){
            return new ArrayList<>();
        }
        List<Long> sequence= new ArrayList<Long>();
        sequence.add(1L);
        for (int i=1;i<n;i++){
            String prece= Long.toString(sequence.get(i-1));
            StringBuilder next= new StringBuilder();
            int count=1;
            for (int j = 1; j <prece.length() ; j++) {
                if (prece.charAt(j)==prece.charAt(j-1)){
                    count++;
                }
                else{
                    next.append(count).append(prece.charAt(j-1));
                    count=1;
                }
            }
            next.append(count).append(prece.charAt(prece.length()-1));
            sequence.add(Long.parseLong(next.toString()));
        }
        return sequence;
    }
}
