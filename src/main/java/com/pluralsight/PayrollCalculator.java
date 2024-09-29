package com.pluralsight;
import java.util.*;

public class PayrollCalculator {

    public static void main(String[] args) {

        // Add Scanner to input variables

        Scanner myScanner = new Scanner(System.in);

        // Create Expressions to declare variables using Scanner

        System.out.print("Enter your name: ");
        String empName = myScanner.nextLine();

        System.out.print("Enter your hours worked: ");
        double hrsWorked = myScanner.nextDouble();

        System.out.print("Enter Enter your pay rate: $" );
        double payRate = myScanner.nextDouble();

        //Declaring Gross pay to print after an argument
        double grossPay;

        //Declaring Overtime hours

        double overHrs = hrsWorked - 40;
        myScanner.nextLine();

        //Calculating Gross pay to pay 1.5x overtime after 40 hours

        if (hrsWorked > 40) {
            grossPay = (40 * payRate) + (overHrs * payRate * 1.5);
        } else {
            grossPay = hrsWorked * payRate;
        }
        // Print the operation created
        System.out.print("\nName: " + empName + "\nGross pay: " + "$" + grossPay);
    }
}
