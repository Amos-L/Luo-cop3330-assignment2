/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex28;

import java.util.Scanner;

public class ex28 {
    public static int main(){

        Scanner x = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<5;i++){
            System.out.printf("Enter a number: ");
            sum += x.nextInt();
        }
        System.out.printf("The total is %d.",sum);
        return sum;
    }

}
