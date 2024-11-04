package ADVANCE_JAVA.COLLECTION_FRAMEWORK.Map;

import java.util.*;

// Custom comparator class for sorting keys based on length of their string representations
class Util_StringLengthComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer key1, Integer key2) {
        int len1 = String.valueOf(key1).length();
        int len2 = String.valueOf(key2).length();
        return Integer.compare(len1, len2);
    }
}

