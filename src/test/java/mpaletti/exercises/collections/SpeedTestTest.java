package mpaletti.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SpeedTestTest {
    final int times=10000;

    @Test
    void insertBeginning() {
        long arrayListTime = SpeedTest.insertBeginning(new ArrayList<>(), "nicola", times);
        long linkedListTime = SpeedTest.insertBeginning(new LinkedList<>(), "nicola", times);
        assertTrue(linkedListTime < arrayListTime);
    }

    @Test
    void insertEnd() {
        long arrayListTime = SpeedTest.insertEnd(new ArrayList<>(), "nicola", times);
        long linkedListTime = SpeedTest.insertEnd(new LinkedList<>(), "nicola", times);
        assertTrue(linkedListTime > arrayListTime);
    }
}