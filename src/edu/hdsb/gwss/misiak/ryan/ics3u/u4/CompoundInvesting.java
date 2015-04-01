/*
 * Name: CompoundInvesting
 * Date: April 1, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program will print out a title table that will display the amount of 
 a yearly investment over a period of up to 15 years.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1misiakrya
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Explanations
        System.out.println("Compound Investing");
        System.out.println("This program will print out a title table that will display"
                + "the amount of a yearly investment over a period of up to 15 years.");

        //Getting the user's input
        System.out.format("%20s %1s", "Enter the yearly investment", " : ");

        Scanner inputYearlyInvestment = new Scanner(System.in);
        double yearlyInvestment = inputYearlyInvestment.nextDouble();

        System.out.format("%20s %1s", "Enter the interest rate (%)", " : ");

        Scanner inputInterestRate = new Scanner(System.in);
        double interestRate = inputInterestRate.nextDouble();

        System.out.format("%20s %1s", "Enter the number of years", " : ");

        Scanner inputNumberOfYears = new Scanner(System.in);
        int years = inputNumberOfYears.nextInt();

        //Other totals needed
        double accountTotal = yearlyInvestment;
        double totalInterest;
        double finalTotal;

        //Formatting currency
        NumberFormat money = NumberFormat.getCurrencyInstance();

        //OUTPUT
        if (years > 15 || years < 0) {
            System.out.println("Error: INVALID NUMBER OF YEARS. Must be above 0 and less than or equal to 15.");
        } else {
            for (int year = 1; year <= years; year += 1) {
                totalInterest = accountTotal * interestRate;
                finalTotal = totalInterest + accountTotal;
                System.out.format("%5s %15s %15s %15s\n", year, money.format(accountTotal), money.format(totalInterest), money.format(accountTotal + (accountTotal * interestRate)));
                accountTotal = yearlyInvestment + finalTotal;
            }
        }

    }

}
