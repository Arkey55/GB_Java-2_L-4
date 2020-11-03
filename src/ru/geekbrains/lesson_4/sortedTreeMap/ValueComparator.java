package ru.geekbrains.lesson_4.sortedTreeMap;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator {
    private Map map;

    public ValueComparator(Map map) {
        this.map = map;
    }

    public int compare(Object o1, Object o2) {
        Comparable valueA = (Comparable) map.get(o1);
        Comparable valueB = (Comparable) map.get(o2);
        return valueA.compareTo(valueB);
    }
}
