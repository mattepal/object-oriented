package mpaletti.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums){
        return nums.stream().filter(n->n<13 || n>19).collect(Collectors.toList());
    }
}
