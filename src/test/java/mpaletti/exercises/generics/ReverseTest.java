package mpaletti.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        List<Integer> l = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Character> c= new ArrayList<>(List.of('a','b','c'));
        Reverse.reverse(l);
        Reverse.reverse(c);
        assertEquals(List.of(5, 4, 3, 2, 1), l);
        assertEquals(List.of('c','b','a'), c);
    }
}