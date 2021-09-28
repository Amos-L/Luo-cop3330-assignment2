/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex26;

class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff(double balance, double apr, double monthly){
        double n;
        apr = apr/365;

        n = -(1.0/30.0) * Math.log(1 + balance / monthly * (1 - Math.pow((1 + apr),30))) / Math.log(1 + apr);
        n = Math.ceil(n);
        return n;
    }
}
