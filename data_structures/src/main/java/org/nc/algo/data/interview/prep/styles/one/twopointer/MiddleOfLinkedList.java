package org.nc.algo.data.interview.prep.styles.one.twopointer;

import java.util.Arrays;
import java.util.List;

// Definition for a Linked List node
 class ListNode {
     int val;
     ListNode next;

     // Constructor
     public ListNode(int val) {
         this.val = val;
         this.next = null;
     }
 }

class LinkedList {
    ListNode head;

    // Default constructor
    public LinkedList() {
        head = null;
    }

    // Constructor to initialize from a list of values
    public LinkedList(List<Integer> values) {
        head = null;
        createLinkedList(values);
    }

    // Function to create a linked list from a list of values
    private void createLinkedList(List<Integer> values) {
        if (values.isEmpty()) {
            head = null;
            return;
        }

        head = new ListNode(values.get(0));
        ListNode current = head;
        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }
    }

}

public class MiddleOfLinkedList {

    public static ListNode middleNode(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }

    // Driver code
    public static void main( String args[] ) {

        List<List<Integer>> inputs = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(1, 2, 3, 4, 5, 6),
                Arrays.asList(3, 2, 1),
                Arrays.asList(10),
                Arrays.asList(1, 2)
        );

        for(int i=0; i<inputs.size(); i++){
            System.out.print(i+1);
            LinkedList inputLinkedList = new LinkedList(inputs.get(i));
            System.out.print(".\tInput linked list:  ");
            System.out.print(inputLinkedList.head);
            System.out.print("\tMiddle of the linked list is:  " );
            System.out.println(middleNode(inputLinkedList.head).val);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

}
