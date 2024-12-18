
package coding;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TestLog {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int x=0,y=0;
        try{          
       
         x = input.nextInt();
         MyLogger.writeToLog("The input was "+x);
         y = input.nextInt();
         MyLogger.writeToLog("The input was "+y);
        double res = x/y;
        System.out.println(res);
        
        }catch(ArithmeticException e){
            MyLogger.writeToLog("Exception:: ",e);
        }catch(InputMismatchException e){
            MyLogger.writeToLog("Exception:: ",e);
        } 
    }
}
