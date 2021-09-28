/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex26;

import java.util.Scanner;

public class ex26 {

    public static void main(String[] arg){
        double balance, apr, monthly;

        Scanner x = new Scanner(System.in);

        System.out.printf("What is your balance? ");
        balance = x.nextDouble();

        System.out.printf("What is the APR on the card (as a percent)? ");
        apr = x.nextDouble();
        apr = apr/100;

        System.out.printf("What is the monthly payment you can make? ");
        monthly = x.nextDouble();

        double n = PaymentCalculator.calculateMonthsUntilPaidOff(balance,apr, monthly);
        System.out.printf("It will take you %.0f months to pay off this card.", n);
    }

}
