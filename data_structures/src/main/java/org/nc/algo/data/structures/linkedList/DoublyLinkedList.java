package org.nc.algo.data.structures.linkedList;

class NodeDobly {
    int value;
    NodeDobly next;
    NodeDobly prev;

    public NodeDobly(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {

    NodeDobly head;
    NodeDobly tail;
    int length = 0;

    public DoublyLinkedList(int value) {
        NodeDobly node = new NodeDobly(value);
        head = node;
        tail = node;
        length++;
    }

    public void add(int data) {
        NodeDobly node = new NodeDobly(data);
        NodeDobly currentNode = head;
        NodeDobly previousNode = head;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
            previousNode = currentNode;
        }

        currentNode.next = node;
        node.prev = previousNode;
        tail = currentNode.next;
        length++;
    }

    public void print() {
        NodeDobly currentNode = head;

        while(currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
