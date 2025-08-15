package org.nc.algo.data.structures.stacks;

import java.util.ArrayList;
import java.util.List;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class StackImpl {
    Node top;
    Node bottom;
    int length;

    public Node peek() {
        return this.top;
    }

    public List<Integer> peekList() {
        Node peekNode = this.top;
        List<Integer> list = new ArrayList<>();
        while (peekNode != null) {
            list.add(peekNode.value);
            peekNode = peekNode.next;
        }
        return list;
    }

    public Node push(int value) {
        Node node = new Node(value);
        if (this.length == 0) {
            this.top = node;
            this.bottom = node;
        }  else {
            Node holdingPointer = this.top;
            this.top = node;
            this.top.next = holdingPointer;
        }
        length++;
        return node;
    }

    public Node pop() {
        if (this.length == 0) {
            return null;
        }
        Node ref = this.top;
        this.top = this.top.next;
        length--;
        return ref;
    }
}
