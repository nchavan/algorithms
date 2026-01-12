package org.nc.algo.data.structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<Integer> bfs(Node tree) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(tree);

        while (!queue.isEmpty()) {
            Node value = queue.poll();
            list.add(value.value);
            if (value.left != null) {
                queue.add(value.left);
            }

            if (value.right != null) {
                queue.add(value.right);
            }
        }

        return list;
    }

    public List<Integer> bfsRec(Queue queue, List<Integer> list) {

        if (queue.size() == 0) {
            return list;
        }

        Node value = (Node) queue.poll();
        list.add(value.value);

        if (value.left != null) {
            queue.add(value.left);
        }

        if (value.right != null) {
            queue.add(value.right);
        }

        return bfsRec(queue, list);
    }

    public List<Integer> dfsInOrder(Node tree,  List<Integer> list) {

        Integer value = tree.value;
        if (tree.left != null) {
            dfsInOrder(tree.left, list);
        }
        list.add(value);
        if (tree.right != null) {
            dfsInOrder(tree.right, list);
        }

        return list;
    }

    public List<Integer> dfsPreOrder(Node node,  List<Integer> list) {
        Integer value = node.value;
        list.add(value);

        if (node.left != null) {
            dfsPreOrder(node.left, list);
        }
        if (node.right != null) {
            dfsPreOrder(node.right, list);
        }

        return list;
    }

    public List<Integer> dfsPostOrder(Node node,  List<Integer> list) {
        Integer value = node.value;

        if (node.left != null) {
            dfsPostOrder(node.left, list);
        }

        if (node.right != null) {
            dfsPostOrder(node.right, list);
        }

        list.add(value);
        return list;
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

    public boolean isValidBst(Node node) {

        return validBst(node, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private boolean validBst(Node node, int minValue, int maxValue) {

        if (node == null) {
            return true;
        }

        if (node.value <= minValue || node.value >= maxValue) {
            return false;
        }

        return validBst(node.left, minValue, node.value) &&
                validBst(node.right, node.value, maxValue);
    }

}
