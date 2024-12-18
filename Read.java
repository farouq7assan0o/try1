package coding;
import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;

public class Read {
	
    public static void main(String[] args) {
       
        try { 
        	FileReader  file = new FileReader("noteone.txt");
            BufferedReader   br = new BufferedReader(file);
            
            String line = br.readLine();
            while(line != null) { 
                System.out.println(line);
                line = br.readLine(); 
            }
            
        } catch (IOException e) { 
            System.out.println("IO Exception: " + e.getMessage());
            
        } finally {
            try {
                if (br != null) br.close();
                if (file != null) file.close();
                
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
        }
    }
}
