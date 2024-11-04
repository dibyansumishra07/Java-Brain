package ADVANCE_JAVA.COLLECTION_FRAMEWORK.underrated;

import java.util.EnumMap;

enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY, FRIDAY }

/**
 * @implSpec EnumMap is helpful when we are dealing with ENUM Key
 * It is much more efficient
 * Internally uses array to store.
 *<
 */
public class EnumMapConcept {
    public static void main(String[] args) {
        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
        schedule.put(Day.MONDAY, "Work");
        schedule.put(Day.SATURDAY, "Rest");
    }
}



