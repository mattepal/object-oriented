package mpaletti.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> ret=new HashSet<>(first);
        for (int i:second){
            ret.add(i);
        }
        return ret;
    }
    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> ret=new HashSet<>(first);
        ret.addAll(second);
        return ret;
    }
}
