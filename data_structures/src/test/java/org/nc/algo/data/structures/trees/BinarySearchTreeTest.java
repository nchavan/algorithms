package org.nc.algo.data.structures.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTreeTest {

    @Test
    void insert() {
        List<Integer> list = new ArrayList<>();
        BinarySearchTree binarySearchTree = new BinarySearchTree(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(2);
        binarySearchTree.insert(8);
        binarySearchTree.insert(15);
        binarySearchTree.insert(11);
        binarySearchTree.insert(25);
        binarySearchTree.traverseTreeAndGetAllValues(binarySearchTree.node, list);

        assertThat(list)
                .containsExactlyInAnyOrder(10, 5, 2, 8 ,15, 11, 25);

        assertThat(binarySearchTree.search(25)).isTrue();
        assertThat(binarySearchTree.search(16)).isFalse();

    }
}