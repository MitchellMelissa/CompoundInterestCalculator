/*
Compound Interest Calculator
This program will calculate the compound interest for the years user will specify. 
The calculator also provides the total profit for the same amount of years.
 */
package interest_calculator;
import java.util.Scanner;
/**
 *
 * @author Melissa Mitchell
 */
public class Interest_Calculator {

    public static void main(String[] args) {
        double p = 0.0; //principle
        double r = 0.0; //interest rate
        int t = 0; //time
        int aa = 0; //annual addition;
        double profit = 0.0;
        String go = "yes";
        String keepgoing = "yes";
        Scanner scan = new Scanner(System.in);
        
        
            System.out.println("Welcome to Melissa's Compound Interest Calculator");
            System.out.println("After every entry, please press enter to continue");
        while (go.equals("yes")){    
            System.out.println();
            System.out.println("Enter principle amount:");
            p = scan.nextDouble();
            
            System.out.println("Enter annual addition amount:");
            aa = scan.nextInt();
            
            System.out.println("Enter interest rate:");
            r = scan.nextDouble();
            
            System.out.println("Enter length of time to invest:");
            t = scan.nextInt();
            
            double realRate = r * 0.1; 
            double total = p * (1 + realRate);
            int y = 1;
            System.out.println();
            System.out.println("The total amount for " + y + " year is: $" + total);
            
            int i = 1;
            
            while(i < t){
                total = (total + aa) * (1 + realRate);
                i = i + 1;
                y = y + 1;
                System.out.println("The total amount for " + y + " years are: $" + total);
            }
            i = i - 1;
            profit = total - (p + (aa * i));
            System.out.println();
            System.out.println("The total profit for the " + t + " years is: $" + profit);
            System.out.println();
            System.out.println("Would you like to do another calculation? (Enter yes/no)");
            keepgoing = scan.next();
           
            
            if(keepgoing.equals("yes")){
                go = "yes";
            }
            else{
                System.out.println();
                System.out.println("Thank you for using this calculator");
                System.out.println("Goodbye");
                go = "null";
            }
        }
    }
    
}
