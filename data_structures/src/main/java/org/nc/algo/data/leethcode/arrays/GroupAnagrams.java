package org.nc.algo.data.leethcode.arrays;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * https://leetcode.com/problems/group-anagrams/description
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupList = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            boolean addedElement = false;
            String str = strs[i];
            for (int j = 0; j < groupList.size(); j++) {
                List<String> individualGroupList = groupList.get(j);
                String listElement = individualGroupList.get(0);
                if (listElement.length() == str.length()) {
                    if (compareTwoStrings(str, listElement)) {
                        groupList.remove(individualGroupList);

                        List<String> newList = new ArrayList<>(individualGroupList);
                        newList.add(str);
                        newList.stream().sorted();
                        groupList.add(newList);
                        addedElement = true;
                        break;
                    }
                }
            }

            // Create new groupList
            if (!addedElement) {
                groupList.add(List.of(str));
            }

        }

        return groupList;
    }

    public List<List<String>> groupAnagramsOptimalSol(String[] strs) {
        Map<String, List<String>> groupList = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            AtomicBoolean addedElement = new AtomicBoolean(false);
            String str = strs[i];

            groupList.keySet()
                    .stream()
                    .filter(s -> compareTwoStrings(s, str))
                    .forEach(s -> {
                        List<String> newList =  new ArrayList<>(groupList.get(s));
                        newList.add(str);
                        addedElement.set(true);
                        groupList.put(s, newList);
                    });

            // Create new groupList
            if (!addedElement.get()) {
                groupList.put(str, List.of(str));
            }

        }

        return groupList.values().stream().toList();
    }

    private boolean compareTwoStrings(String str, String listElement) {
        return Arrays.stream(str.split("")).sorted().toList()
                .equals(Arrays.stream(listElement.split("")).sorted().toList());
    }

}
