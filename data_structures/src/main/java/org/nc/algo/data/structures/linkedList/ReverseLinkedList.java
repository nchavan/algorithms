package org.nc.algo.data.structures.linkedList;

public class ReverseLinkedList {

    public Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;

        Node rev =  reverse(head.next);

        head.next.next = head;

        head.next = null;

        return rev;
    }

    public void printList(Node curr){
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
