package org.nc.algo.data.structures.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTreeTest {

    @Test
    void binarySearchTreeTest() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(2);
        binarySearchTree.insert(8);
        binarySearchTree.insert(15);
        binarySearchTree.insert(11);
        binarySearchTree.insert(25);

        List<Integer> traverseTreeList = new ArrayList<>();
        binarySearchTree.traverseTreeAndGetAllValues(binarySearchTree.node, traverseTreeList);
        assertThat(traverseTreeList)
                .containsExactlyInAnyOrder(10, 5, 2, 8 ,15, 11, 25);

        List<Integer> listBfs1 = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(binarySearchTree.node);
        assertThat(binarySearchTree.bfsRec(queue, listBfs1))
                .containsExactly(10, 5, 15, 2 ,8, 11, 25);
        assertThat(binarySearchTree.bfs(binarySearchTree.node))
                .containsExactly(10, 5, 15, 2 ,8, 11, 25);

        List<Integer> listDfs1 = new ArrayList<>();
        assertThat(binarySearchTree.dfsInOrder(binarySearchTree.node, listDfs1))
                .containsExactly(2, 5, 8, 10 ,11, 15, 25);

        List<Integer> listDfs2 = new ArrayList<>();
        assertThat(binarySearchTree.dfsPreOrder(binarySearchTree.node, listDfs2))
                .containsExactly(10, 5, 2, 8 ,15, 11, 25);

        List<Integer> listDfs3 = new ArrayList<>();
        assertThat(binarySearchTree.dfsPostOrder(binarySearchTree.node, listDfs3))
                .containsExactly(2, 8 ,5, 11, 25, 15, 10);

        assertThat(binarySearchTree.isValidBst(binarySearchTree.node))
                .isEqualTo(true);
    }

}