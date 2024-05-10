package fundamental;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overageRate = 0.25;
    static double taxRate = 0.15;



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");

        double baseCost = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        double overMinutes = scanner.nextDouble();
        scanner.close();
        //Calculate the final total
       double overageCharge = calculateOverages(overMinutes);
       double tax = calculateTax(baseCost + overageCharge);
       caculateAndPrintBill(baseCost, overageCharge, tax);

    }

    private static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    private static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }


    private static void caculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" +String.format("%.2f",base));
        System.out.println("Overage: $" +String.format("%.2f", overage));
        System.out.println("Tax : $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
