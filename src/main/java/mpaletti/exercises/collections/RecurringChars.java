package mpaletti.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string){
        Set<Character> seen=new HashSet<>();
        Set<Character> duplicate=new HashSet<>();
        for (Character c:string.toCharArray()){
            if (seen.contains(c)){
                duplicate.add(c);
            }
            else {
                seen.add(c);
            }
        }
        return duplicate;
    }
}
