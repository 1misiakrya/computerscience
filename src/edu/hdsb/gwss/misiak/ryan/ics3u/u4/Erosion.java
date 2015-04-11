/*
 * Name: Erosion
 * Date: April 3, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program calculates the amount of years it would take before Canada could not grow crops 
 (assuming Canada's initial topsoil is 30cm deep).
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u4;

/**
 *
 * @author RMisiak
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Title & explanation of program for user
        System.out.println("Topsoil Erosion");

        System.out.println("Careless land management causes approximately 1 percent of the topsoil to erode each \n"
                + "year. It is then lost forever, since it takes nature approximately 500 years to produce 2.5 \n"
                + "cm of topsoil. At 9 cm the topsoil is so shallow that crops cannot be grown on a large \n"
                + "scale. If Canada has about 30 cm of topsoil, how many years will it take for the depth to \n"
                + "be reduced to 9 cm?");

        //Declaring the variables.
        double depth = 30;
        int totalYears = 0;
        final double PERCENT_LOSS = 0.99;

        //OUTPUT
        for (int years = 1; depth >= 9; years += 1) {
            depth = depth + 0.005;
            depth = depth * PERCENT_LOSS;
            totalYears = years;
        }
        System.out.println("It will take " + totalYears + " years for the soil to erode to a depth such that crops \n"
                + "will not grow.");
    }

}
