package org.nc.algo.data.structures.trees;

import java.util.List;

public class BinarySearchTree {

    public Node node;

    public BinarySearchTree(int value) {
        this.node = new Node(value);
    }

    public void insert(int value) {

        Node current = this.node;
        Node newNode = new Node(value);
        boolean inserted = false;

        while (!inserted) {

            // move left
            if (current.value > value) {
                if (current.left == null) {
                    current.left = newNode;
                    inserted = true;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    inserted = true;
                }  else {
                    current = current.right;
                }
            }

        }

    }

    public List<Integer> traverseTreeAndGetAllValues(Node  tree, List<Integer> list) {

        if (tree.left == null) {
            list.add(tree.value);
            return list;
        } else {
            traverseTreeAndGetAllValues(tree.left, list);
        }

        if (tree.right == null) {
            list.add(tree.value);
            return list;
        } else {
            traverseTreeAndGetAllValues(tree.right, list);
        }

        list.add(tree.value);
        return list;
    }

}
