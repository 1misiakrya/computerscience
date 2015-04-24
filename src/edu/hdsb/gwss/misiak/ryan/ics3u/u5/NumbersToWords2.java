/*
 * Name: NumbersToWords2
 * Date: April 17, 2015
 * Version: v0.1
 * Author: Mr. R. Misiak
 * Description: This program converts three digit numbers given by the user into the english word that goes with them.
 */
package edu.hdsb.gwss.misiak.ryan.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author RMisiak
 */
public class NumbersToWords2 {

    //Declaring global variables
    public static String numberString;
    public static int hundreds;
    public static int tens;
    public static int ones;
    public static int teens;
    public static double number;
    public static String onesString = "";
    public static int length;

    public static void main(String[] args) {

        //Getting user's input
        System.out.println("Enter a number (0 < x <= 999): ");

        Scanner inputNumber = new Scanner(System.in);
        numberString = inputNumber.nextLine();
        number = Integer.parseInt(numberString);
        length = numberString.length();

        //Checking that user's input works in the program
        if (number > 999 || number < 0) {
            System.out.println("Invalid entry.");
        } else {
            if (length == 1) {
                ones();
            } else if (length == 2) {
                tens();
                ones();
                teens();
            } else if (length == 3) {
                hundreds();

                tens();

                ones();

                teens();
            }
        }
    }

    public static void hundreds() {

        //Finding the digit in the hundreds column
        hundreds = (int) number / 100;

        //OUTPUT for hundreds column
        if (hundreds == 1) {
            System.out.print("ONE HUNDRED ");
        } else if (hundreds == 2) {
            System.out.print("TWO HUNDRED ");
        } else if (hundreds == 3) {
            System.out.print("THREE HUNDRED ");
        } else if (hundreds == 4) {
            System.out.print("FOUR HUNDRED ");
        } else if (hundreds == 5) {
            System.out.print("FIVE HUNDRED ");
        } else if (hundreds == 6) {
            System.out.print("SIX HUNDRED ");
        } else if (hundreds == 7) {
            System.out.print("SEVEN HUNDRED ");
        } else if (hundreds == 8) {
            System.out.print("EIGHT HUNDRED ");
        } else if (hundreds == 9) {
            System.out.print("NINE HUNDRED ");
        }
    }

    public static void tens() {

        //Finding the digit in the tens column
        tens = (int) (number / 10) % 10;

        //OUTPUT for tens column
        if (20 < number) {
            if (tens == 2) {
                System.out.print("TWENTY ");
            } else if (tens == 3) {
                System.out.print("THIRTY ");
            } else if (tens == 4) {
                System.out.print("FORTY ");
            } else if (tens == 5) {
                System.out.print("FIFTY ");
            } else if (tens == 6) {
                System.out.print("SIXTY ");
            } else if (tens == 7) {
                System.out.print("SEVENTY ");
            } else if (tens == 8) {
                System.out.print("EIGHTY ");
            } else if (tens == 9) {
                System.out.print("NINETY ");
            }

        }

    }

    public static void ones() {

        //Finding the digit in the ones column of a 2 or 3-digit number
        int checkingHundreds;
        if (length == 2) {
            checkingHundreds = 0;
        } else {
            checkingHundreds = (int) number / 100;
            ones = (int) number % 10;
        }

        //OUTPUT that checks for the length of the number, then spells out the number in the ones column
        if (length == 2 || length == 3) {
            if (number - (checkingHundreds * 100) < 10 || (number - checkingHundreds * 100) > 19 && length == 3) {
                if (ones == 1) {
                    onesString = "ONE";
                } else if (ones == 2) {
                    onesString = "TWO";
                } else if (ones == 3) {
                    onesString = "THREE";
                } else if (ones == 4) {
                    onesString = "FOUR";
                } else if (ones == 5) {
                    onesString = "FIVE";
                } else if (ones == 6) {
                    onesString = "SIX";
                } else if (ones == 7) {
                    onesString = "SEVEN";
                } else if (ones == 8) {
                    onesString = "EIGHT";
                } else if (ones == 9) {
                    onesString = "NINE";
                }
            } else if (length == 2 && (number > 19 || number < 10)) {
                ones = (int) number % 10;
                if (ones == 1) {
                    onesString = "ONE";
                } else if (ones == 2) {
                    onesString = "TWO";
                } else if (ones == 3) {
                    onesString = "THREE";
                } else if (ones == 4) {
                    onesString = "FOUR";
                } else if (ones == 5) {
                    onesString = "FIVE";
                } else if (ones == 6) {
                    onesString = "SIX";
                } else if (ones == 7) {
                    onesString = "SEVEN";
                } else if (ones == 8) {
                    onesString = "EIGHT";
                } else if (ones == 9) {
                    onesString = "NINE";
                }
            }
        }

        //Spelling out the number if the number is < 10
        if (number == 1) {
            onesString = "ONE";
        } else if (number == 2) {
            onesString = "TWO";
        } else if (number == 3) {
            onesString = "THREE";
        } else if (number == 4) {
            onesString = "FOUR";
        } else if (number == 5) {
            onesString = "FIVE";
        } else if (number == 6) {
            onesString = "SIX";
        } else if (number == 7) {
            onesString = "SEVEN";
        } else if (number == 8) {
            onesString = "EIGHT";
        } else if (number == 9) {
            onesString = "NINE";
        }
        System.out.print(onesString);
    }

    public static void teens() {

        //Checking to see if the user's number is in the teens
        int hundredsDigit = (int) number / 100;
        teens = (int) number - (hundredsDigit * 100);

        //OUTPUT for if the digits are in the teens
        if (teens > 9 && teens < 20) {
            if (teens == 10) {
                System.out.print("TEN");
            } else if (teens == 11) {
                System.out.print("ELEVEN");
            } else if (teens == 12) {
                System.out.print("TWELVE");
            } else if (teens == 13) {
                System.out.print("THIRTEEN");
            } else if (teens == 14) {
                System.out.print("FOURTEEN");
            } else if (teens == 15) {
                System.out.print("FIFTEEN");
            } else if (teens == 16) {
                System.out.print("SIXTEEN");
            } else if (teens == 17) {
                System.out.print("SEVENTEEN");
            } else if (teens == 18) {
                System.out.print("EIGHTEEN");
            } else {
                System.out.print("NINETEEN");
            }
        }
    }
}
