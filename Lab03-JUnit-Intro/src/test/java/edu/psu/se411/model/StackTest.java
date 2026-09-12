package edu.psu.se411.model;

import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void testPushAndPop() {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("Z");
        stringStack.push("A");

        assertEquals("A", stringStack.pop());
    }

    @Test
    public void pop_empty_stack() {
        Stack<String> stringStack = new Stack<>();

        NoSuchElementException thrown =
            assertThrows(NoSuchElementException.class,
                () -> stringStack.pop());

        assertEquals("Stack is empty, cannot pop", thrown.getMessage());
    }

    @Test
    public void testReverseOrder() {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");

        assertEquals("C", stringStack.pop());
        assertEquals("B", stringStack.pop());
        assertEquals("A", stringStack.pop());
    }

    @Test
    public void testPushNull() {
        Stack<String> stringStack = new Stack<>();

        stringStack.push(null);

        assertNull(stringStack.pop());
    }

    @Test
    public void testMultiplePushAndPop() {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());

        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    public void testZeroCapacity() {
        Stack<String> stack = new Stack<>(0);

        stack.push("A");

        assertEquals("A", stack.pop());
    }

    @Test
    public void testNegativeCapacity() {
        Stack<String> stack = new Stack<>(-5);

        stack.push("A");

        assertEquals("A", stack.pop());
    }
}