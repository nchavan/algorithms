package org.nc.algo.data.structures.linkedList;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {

    Node head;
    Node tail;
    int size = 0;

    public LinkedListExample(int data) {
        Node node = new Node(data);
        head = node;
        tail = node;
        size++;
    }

    public void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = head;
        }  else {
            tail.next = node;
            tail = node;
        }

        size++;
    }


    public void add2(int data) {
       Node node = new Node(data);
       Node currentNode = head;

       while (currentNode.next != null) {
           currentNode = currentNode.next;
       }

       currentNode.next = node;
       tail = currentNode.next;
       size++;
    }

    public void prepend(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    public void remove(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        currentNode.next = currentNode.next.next;
        size--;
    }

    public void appendWithIndex(int index, int data) {
        Node node = new Node(data);
        Node currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index) {
             currentNode = currentNode.next;
            currentIndex++;
        }

        node.next = currentNode.next;
        currentNode.next = node;
        size++;
    }

    public void print() {
        Node currentNode = head;

        while (currentNode.next != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    public List<Integer> getList() {
        Node currentNode = head;
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while (currentNode.next != null) {
            list.add(index, currentNode.data);
            currentNode = currentNode.next;
            index++;
        }
        list.add(index, currentNode.data);
        return list;
    }

}
