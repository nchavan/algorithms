package org.nc.algo.data.structures.arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfDistinctElementsInArray {

    public int sumDistinctElements(int[] array) {

        return Arrays.stream(Arrays.stream(array).toArray())
                .distinct()
                .sum();
    }

    public int sumDistinctElementsUsing(int[] array) {

        Set<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toSet());

        return collect.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int sumDistinctElementsUsing2(int[] array) {
       Set<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toSet());

       return collect.stream().mapToInt(Integer::intValue).sum();
    }

    public int sumDistinctElementsUsing1(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        return map.keySet()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

}
