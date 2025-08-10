import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q9{

    public static void readFile(String filePath) {
        BufferedReader reader = null;
        
        try {
            // Try to open the file
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: Problem reading the file - " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close file resource
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "test.txt"; 
        readFile(filePath);
    }
}
