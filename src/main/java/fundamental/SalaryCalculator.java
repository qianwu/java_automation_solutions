package fundamental;
/*
IF statement.
All sales people get a standard rate of $1,000 a week. For any of them who make more than 10 sales that week, they get an additional bonus of $250.
So, the main path would be to pay a salesperson $1,000 - everyone gets this no matter what.
 However, at some point we need to check to see if the condition was met of them making more than 10 sales.
  If it's met, then we need to add more to their payment.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){
        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        //Get values from the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //Quick detour for the bonus earners
        if (sales > quota){
            salary = salary + bonus;
        }
        //Output
        System.out.println("The employee's pay is $" + salary);
    }
}
