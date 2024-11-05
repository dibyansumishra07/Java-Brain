package ADVANCE_JAVA.EXCEPTION_HANDLING.exceptionConcept;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Open a file for reading
            reader = new BufferedReader(new FileReader("example.txt"));

            // Read from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the IOException
            System.err.println("An IOException occurred: " + e.getMessage());
        } finally {
            try {
                // Close the file
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // Handle the IOException when closing the file
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
