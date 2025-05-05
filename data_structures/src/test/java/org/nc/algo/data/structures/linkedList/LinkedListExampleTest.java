package org.nc.algo.data.structures.linkedList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListExampleTest {

    @Test
    void linkedListExample() {
        LinkedListExample linkedListExample = new LinkedListExample(10);
        linkedListExample.add(20);
        linkedListExample.add(30);
        linkedListExample.add(40);
        linkedListExample.prepend(5);
        linkedListExample.appendWithIndex(2, 25);
        linkedListExample.print();
        System.out.println("-------------------------------------------------------------");
        linkedListExample.remove(2);
        linkedListExample.remove(0);
        linkedListExample.print();

        List<Integer> output = linkedListExample.getList();

        Assertions.assertThat(output)
                .containsExactly(5, 20, 30, 40);
    }

}