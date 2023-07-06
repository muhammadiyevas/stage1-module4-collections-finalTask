package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> sortList = new HashMap<>();

        for (Map.Entry<String, Integer> list : sourceMap.entrySet()) {
            String key = list.getKey();
            int length = key.length();

            Set<String> keySet = sortList.getOrDefault(length, new HashSet<>());

            keySet.add(key);
            sortList.put(length, keySet);
        }

        return sortList;
    }
}
