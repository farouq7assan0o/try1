package coding;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        
        
        
        try {
        	int arr[] = new int[3];
        	for(int i=0;i<=3;i++) {
        		System.out.println(arr[i]);
        		
        	}
            System.out.print("Enter the first integer: ");
            int x = input.nextInt();
            
            System.out.print("Enter the second integer: ");
            int y = input.nextInt(); 
            
            double res = (double) x / y; // Casting to double for precise division
            System.out.println("Result: " + res);
        } catch (InputMismatchException e) {
            System.out.println("The value is not an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        } catch( FarouqException) {
        	
        	System.out.println("")
        }
    }
}
