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

/**
 *
 * @author 1misiakrya
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double initialInvestment = 150.00;
        double interestRate = 0.09;
        double accountTotal = initialInvestment;
        double totalInterest;
        double finalTotal;

        int years = 10;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        for (int year = 1; year <= years; year += 1) {
            totalInterest = accountTotal*interestRate;
            finalTotal = totalInterest + accountTotal;
            System.out.format("%5s %10s %10s %10s\n", year, money.format(accountTotal), money.format(totalInterest), money.format(accountTotal+(accountTotal*interestRate)));
            accountTotal = accountTotal + finalTotal;
        }

    }

}
