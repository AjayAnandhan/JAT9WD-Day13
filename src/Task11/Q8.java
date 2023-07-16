package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        try {

            String filePath = "C:\\Users\\user\\Desktop\\GitHub Access Token.txt";

            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }
            
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                System.out.println(line);
            }
                      
        } 
        catch (FileNotFoundException e) {

            System.err.println(e.getMessage());

        }
    }
}
