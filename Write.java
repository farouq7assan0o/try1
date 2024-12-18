package coding;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Write {
	
    public static void main(String[] args) {
    	try { 
    		FileWriter file = new FileWriter("noteone.txt");
	BufferedWriter wr = new BufferedWriter(file); 
	
	wr.write("secure coding");
	wr.close();

} catch (IOException e) {
    System.out.println("IO Exception");
}
    	
    } 
    }
