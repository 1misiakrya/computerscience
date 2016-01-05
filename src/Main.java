/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author 1misiakrya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        boolean runCheck = true;

        double sum = a + b + c;

        if (a < 0 || a > 180) {
            runCheck = false;
        } else if (b < 0 || b > 180) {
            runCheck = false;
        } else if (c < 0 || c > 180) {
            runCheck = false;
        } else if(sum != 180){
            runCheck = false;
        }

        if (!runCheck) {
            System.out.println("Error");
        } else {
            if (a == 60 && a == b && a == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isoceles");
            } else {
                System.out.println("Scalene");
            }
        }

    }

}
