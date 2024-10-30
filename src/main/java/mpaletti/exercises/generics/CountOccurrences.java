package mpaletti.exercises.generics;

import java.util.Objects;

public class CountOccurrences {
    public static <T> int countOccurrencesPlain(T[] src, T item){
        int count=0;
        for (T t:src){
            if (t==item){
                count++;
            }
        }
        return count;
    }
    public static <T> int countOccurrencesObjects(T[] src, T item){
        int count=0;
        for (T t: src){
            if(Objects.equals(item,t)){
                count++;
            }
        }
        return count;
    }
}
