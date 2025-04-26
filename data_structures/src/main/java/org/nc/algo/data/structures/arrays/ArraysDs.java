package org.nc.algo.data.structures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysDs {
    private int length;
    private List<Integer> data;

    public ArraysDs() {
        this.length = 0;
        this.data = new ArrayList<Integer>();
    }

    public void printArray() {
        System.out.println(data.stream().map(Object::toString)
                .collect(Collectors.joining(", ")));
    }

    public List<Integer> getData() {
        return this.data;
    }

    public int get(int index) {
        return data.get(index);
    }

    public int push(int data) {
        this.data.add(data);
        length++;
        return length;
    }

    public int pop() {
        int lastItem = this.data.get(length - 1);
        this.data.remove(length - 1);
        length--;
        return length;
    }

    public int delete(int index) {
        for (int i = index;i < length - 1; i++) {
            data.set(i, data.get(i + 1));
        }

        this.data.remove(length - 1);
        length--;
        return length;
    }

}
