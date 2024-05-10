package fundamental;

import java.util.Scanner;

/**
 * Create a program that determines the number of quarters, dimes, nickels,
 * and pennies needed to make change for a dollar.
 */
public class ChangeForDollar {

    public static void main(String args[]){
        // 1. Get the number of quarters
        System.out.println("Enter the number of quarters:");
        Scanner scanner = new Scanner(System.in);
        int quarters = scanner.nextInt();
        // 2. Get the number of dimes
        System.out.println("Enter the number of dimes:");
        int dimes = scanner.nextInt();
        // 3. Get the number of nickels
        System.out.println("Enter the number of nickels:");
        int nickels = scanner.nextInt();
        // 4. Get the number of pennies
        System.out.println("Enter the number of pennies:");
        int pennies = scanner.nextInt();
        scanner.close();
        // 5. Calculate the total
        double total = quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01;
        // 6. Output the result
        if(total == 1.00){
            System.out.println("Congratulations! You have exactly a dollar.");
        }
        else if(total > 1.00){
            System.out.println("Sorry, you have more than a dollar.");
        }
        else{
            System.out.println("Sorry, you have less than a dollar.");
        }
    }
}
