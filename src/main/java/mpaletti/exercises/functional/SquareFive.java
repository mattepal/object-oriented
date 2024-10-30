package mpaletti.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class SquareFive {
    public static long squareFive(List<Integer> nums){
        return nums.stream().map(n->Math.pow(n,2)+10).filter(n->n%10!=5).count();
    }
}
