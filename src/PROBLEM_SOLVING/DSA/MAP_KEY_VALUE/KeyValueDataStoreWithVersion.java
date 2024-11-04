package PROBLEM_SOLVING.DSA.MAP_KEY_VALUE;

import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

final class User {
    private long userId;
    private String name;
    private String designation;

    User(long userId, String name, String designation) {
        this.userId = userId;
        this.name = name;
        this.designation = designation;
    }

    public User(User user) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.designation = user.getDesignation();
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String
    toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}'+"\n";
    }
}

public final class KeyValueDataStoreWithVersion {
    private final ConcurrentHashMap<Long, TreeMap<Integer, User>> userDatabase = new ConcurrentHashMap<>();

    public synchronized void put(long id, User valueUser) {
        TreeMap<Integer, User> userVersions = userDatabase.get(id);
        TreeMap<Integer, User> user = new TreeMap<>();
        if(null == userVersions){
            user.put(user.size()+1, valueUser);
            userDatabase.put(id, user);
        } else {
            userVersions.put(userVersions.size()+1, valueUser);
            userDatabase.put(id, userVersions);
        }
    }

    public synchronized User get(long id, int version){
        TreeMap<Integer, User> userVersions = userDatabase.get(id);
        if(userVersions == null)
            return null;
        return userVersions.get(version);
    }

    public synchronized User get(long id){
        TreeMap<Integer, User> userVersions = userDatabase.get(id);
        if(userVersions == null)
            return null;
        return userVersions.get(userVersions.size());
    }

    public synchronized void delete(long id){
        userDatabase.remove(id);
    }

    @Override
    public String toString() {
        return "KeyValueDataStoreWithVersion{" +
                "database=" + userDatabase +
                '}';
    }
}
class Runner{
    public static void main(String[] args) {

        // Create an user1
        User user = new User(1, "Dibyansu", "Analyst");
        // Create an user1
        User user1 = new User(2, "John", "Analyst");
        // Initialize our custom data-structure
        KeyValueDataStoreWithVersion keyValueVersion = new KeyValueDataStoreWithVersion();
        // Add user1 to our data-structure
        keyValueVersion.put(user.getUserId(), new User(user));

        // Change the user1 designation and another entry.
        user.setDesignation("Consultant");
        keyValueVersion.put(user.getUserId(), new User(user));

        // Add user2 to our data-structure
        keyValueVersion.put(user1.getUserId(), new User(user1));
        // Check all values in the database
        System.out.println(keyValueVersion);
        System.out.println("================");
        System.out.println(keyValueVersion.get(1));// getting the latest user1 with latest designation
        System.out.println(keyValueVersion.get(1, 1));// getting the user1 with previous designation

    }
}