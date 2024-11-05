package CORE_JAVA.IMMUTABILITY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final List<String> hobbies;

    // Constructor initializes all fields
    public ImmutableClass(int id, String name, List<String> hobbies) {
        this.id = id;
        this.name = name;
        // Perform defensive copying to ensure immutability
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Getter methods for each field, but no setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return an unmodifiable view of the hobbies list to prevent external modifications
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }
}
