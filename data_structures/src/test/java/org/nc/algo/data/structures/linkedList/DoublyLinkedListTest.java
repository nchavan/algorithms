package org.nc.algo.data.structures.linkedList;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

    @Test
    void addElementsToDoublyLinkedList() {
        DoublyLinkedList linkedListExample = new DoublyLinkedList(10);
        linkedListExample.add(20);
        linkedListExample.add(30);
        linkedListExample.add(40);
        linkedListExample.print();
        System.out.println("-------------------------------------------------------------");
    }
}