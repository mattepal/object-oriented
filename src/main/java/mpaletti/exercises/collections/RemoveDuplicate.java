package mpaletti.exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> ret= new HashSet<>(list);
        return new  ArrayList<Integer>(ret);

    }
}
