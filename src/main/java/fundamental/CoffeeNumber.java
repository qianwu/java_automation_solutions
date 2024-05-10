package fundamental;

import java.util.Scanner;

public class CoffeeNumber {
//Create a program that asks a user for a season of the year, then a whole number, then an adjective.
// And use the input to complete the sentence below. Output the result.

    public static void main(String args[]){
        // 1. Get the season of the year
        System.out.println("Enter a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        //2. Get a whole number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();
        //3. Get an adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();
        //4. output the result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
