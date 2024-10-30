package mpaletti.exercises.generics;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src){
        StringBuilder string=new StringBuilder();
        for (E c : src) {
            string.append(c).append(", ");
        }
        return string.toString();
    }
}
