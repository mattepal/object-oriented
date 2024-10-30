package mpaletti.exercises.generics;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list){
        Deque<T> stack= new LinkedList<>();
        while(!list.isEmpty()){
            stack.addFirst(list.removeFirst());
        }
        while (!stack.isEmpty()){
            list.addLast(stack.removeFirst());
        }
    }
}
