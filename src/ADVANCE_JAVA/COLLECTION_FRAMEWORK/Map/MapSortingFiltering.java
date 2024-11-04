package ADVANCE_JAVA.COLLECTION_FRAMEWORK.Map;

import java.util.*;

public class MapSortingFiltering {
    public static void main(String[] args) {
//        exploreDifferentMaps();
        sortMapExampleChatGpt();
        sortTreeMapWithComparator();

        // Create a TreeMap with a custom comparator to sort keys based on length of their string representations
        sortTreeMapWithCustomComparator();

    }

    private static void sortTreeMapWithCustomComparator() {
        Map<Integer, String> customTreeMap = new TreeMap<>(new Util_StringLengthComparator());

        // Add elements to the TreeMap
        customTreeMap.put(3, "Three");
        customTreeMap.put(10, "Ten");
        customTreeMap.put(555, "Five Hundred Fifty-Five");
        customTreeMap.put(22, "Twenty-Two");

        // Display the TreeMap
        System.out.println("Custom TreeMap (keys sorted based on length of their string representations):");
        for (Map.Entry<Integer, String> entry : customTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void sortTreeMapWithComparator() {
        // Create a TreeMap with a custom comparator to sort keys in descending order
        Map<Integer, String> customTreeMap = new TreeMap<>(Comparator.reverseOrder());

        // Add elements to the TreeMap
        customTreeMap.put(3, "Three");
        customTreeMap.put(1, "One");
        customTreeMap.put(4, "Four");
        customTreeMap.put(2, "Two");

        // Display the TreeMap
        System.out.println("Custom TreeMap (keys sorted in descending order):");
        for (Map.Entry<Integer, String> entry : customTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void exploreDifferentMaps() {
        Map<Integer,String> treeMap = new TreeMap<>();
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();

        treeMap.put(3,"Dibyansu");
        treeMap.put(1,"Ayush");
        treeMap.put(2,"Mayank");

        hashMap.put(3,"Dibyansu");
        hashMap.put(1,"Ayush");
        hashMap.put(2,"Mayank");

        linkedHashMap.put(3,"Dibyansu");
        linkedHashMap.put(1,"Ayush");
        linkedHashMap.put(2,"Mayank");

        System.out.println("Tree map: "+treeMap);
        System.out.println("Hash map: "+hashMap);
        System.out.println("Linked map: "+linkedHashMap);

        System.out.println("Tree map: "+treeMap);
        System.out.println("Hash map: "+hashMap);
        System.out.println("Linked map: "+linkedHashMap);
    }

    private static void sortMapExampleChatGpt() {
        // Create a HashMap
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 30);
        unsortedMap.put("Bob", 20);
        unsortedMap.put("Charlie", 40);
        unsortedMap.put("David", 25);
        System.out.println(unsortedMap);
        // Convert Map to List of Map.Entry
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

        // Sort the list using a custom comparator
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                // Sort by value in ascending order
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Create a LinkedHashMap to preserve the order of elements
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Display the sorted Map
        System.out.println("Sorted Map:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
