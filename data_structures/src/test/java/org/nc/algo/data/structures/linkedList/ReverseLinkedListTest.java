package org.nc.algo.data.structures.linkedList;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void reverse() {
        ReverseLinkedList list = new ReverseLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = list.reverse(head);
        list.printList(head);
    }
}