package org.nc.algo.data.structures.stacks;

import org.junit.jupiter.api.Test;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StackImplTest {

    @Test
    void stackArraySequenceTest() {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(stack.peekList(), of(30, 20, 10));
    }

}