package mpaletti.exercises.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    public static void reverse(List<String> sentence){
        Deque<String> stack= new LinkedList<>();
        while (!sentence.isEmpty()){
            stack.push(sentence.removeFirst());
        }
        while (!stack.isEmpty()){
            sentence.addLast(stack.poll());
        }
    }
}
