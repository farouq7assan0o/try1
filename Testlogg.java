

package coding;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Testlogg {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        
	         int u=44,h=88;
	         
	        try{ 
	        	
	        	
	            u = input.nextInt();
	            
	            MyLogger.writeToLog("The input was "+u);
	            h = input.nextInt();
	            MyLogger.writeToLog("The input was "+h);
	            double check = u-h;
	            
	            System.out.println(check);

	            

	        } catch(ArithmeticException e) {
	        	
	            MyLogger.writeToLog("its an exception for the arithmeic",e);
	        	
	        	
	        } catch(InputMismatchException e){
	            MyLogger.writeToLog(" exception for the input",e);
	        } 
	        
	 }
}
	 
