package ru.geekbrains.lesson_4.sortedTreeMap;

import java.util.*;

public class TreeMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> sortedMap = new TreeMap(new ValueComparator(map));

        map.put("10", 5);
        map.put("20", 4);
        map.put("30", 3);
        map.put("40", 2);
        map.put("50", 1);

        System.out.println(map);
        sortedMap.putAll(map);
        System.out.println(sortedMap);
        sortWithoutComparator(map);

    }

    private static void sortWithoutComparator (Map <String, Integer> mp){
        Set<Integer> hs = new HashSet(mp.values());
        for (Integer integer : hs){
            for(Map.Entry entry : mp.entrySet()){
                if(entry.getValue().equals(integer)) {
                    System.out.print("{" + entry.getKey() + "=" + entry.getValue() + "}");
                }
            }
        }
    }
}
