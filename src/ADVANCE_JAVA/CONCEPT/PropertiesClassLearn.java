package ADVANCE_JAVA.CONCEPT;

import java.util.Properties;
/**
 * This class demonstrates the usage of Java's Properties class.
 * It creates two Properties objects, properties1 and properties2,
 * and demonstrates how properties can be inherited from a parent Properties object.
 */
public class PropertiesClassLearn {
    public static void main(String[] args) {
        Properties properties1 = new Properties();
        properties1.setProperty("name", "John DoeP1");
        properties1.setProperty("age", "30P1");
        properties1.setProperty("city", "New YorkP1");
        properties1.setProperty("country", "USA");

        Properties properties2 = new Properties(properties1);
        properties2.setProperty("age", "30P2");
        properties2.setProperty("city", "New YorkP2");

        System.out.println("Age: " + properties2.get("age"));
        System.out.println("Age: " + properties2.getProperty("age"));
        System.out.println("country: " + properties2.get("country"));
        // Here due to inheritance, if current property doesn't have value for country,
        // it should ideally return the default value provided in the second argument instead of this it is returning us the value from parent property
        System.out.println("country: " + properties2.getProperty("country","defaultCountry"));
        System.out.println("countryy: " + properties2.getProperty("countryy","defaultCountry"));
    }

}
