package mpaletti.exercises.collections;

import java.util.*;
public class DownSize {
    public static void downsize(List<String> list, int n) {
        int i=1;
        for (Iterator<String> iterator= list.iterator();iterator.hasNext();){
            iterator.next();
            if ( i % n == 0){
                iterator.remove();
            }
            i++;
        }
    }

}
