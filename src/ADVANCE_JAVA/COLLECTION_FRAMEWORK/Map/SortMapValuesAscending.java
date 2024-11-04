package ADVANCE_JAVA.COLLECTION_FRAMEWORK.Map;

import java.util.*;

public class SortMapValuesAscending {
    public static void main(String[] args) {
        // Create a map with unsorted values
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Three");
        unsortedMap.put(1, "One");
        unsortedMap.put(4, "Four");
        unsortedMap.put(2, "Two");

        // Sort the map values in ascending order
        Map<Integer, String> sortedMap = sortByValuesAscending(unsortedMap);

        // Print the sorted map
        System.out.println("Sorted Map Values (Ascending Order):");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to sort a map by its values in ascending order
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValuesAscending(Map<K, V> map) {
        List<Map.Entry<K, V>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));
        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
