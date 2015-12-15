/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chargersPlusPlus;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author 1misiakrya
 */
public class CCC2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("j1.1.in"));
        int count = 0;

        int[] Angle;
        double a;
        double b = 0;
        double c = 0;
        
        while (input.hasNext()) {
            System.out.println(input.nextLine());
            count++;
        }

        a = (double) count;

        boolean runCheck = true;

        double sum = a + b + c;

        if (a < 0 || a > 180) {
            runCheck = false;
        } else if (b < 0 || b > 180) {
            runCheck = false;
        } else if (c < 0 || c > 180) {
            runCheck = false;
        }

        if (runCheck) {
            if (sum != 180) {
                System.out.println("Error");
            } else {
                if (a == 60 && (a == b) && (a == c)) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isoceles");
                } else {
                    System.out.println("Scalene");
                }
            }

        }
    }

}
