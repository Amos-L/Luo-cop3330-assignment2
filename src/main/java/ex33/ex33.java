/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex33;

import java.lang.*;
import java.util.Scanner;
import java.util.Random;

public class ex33 {
    public static void prompt(){
        System.out.printf("What's your question?\n");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        System.out.printf("> %s\n", question);
        generateAnswer();
    }

    public static int generateAnswer(){
        //Creating random number from 0-3 and has the print statement print a random number from the array
        int ranNum;
        Random numGen = new Random();
        ranNum = numGen.nextInt(3);
        String [] answer = {"Yes", "No", "Maybe", "Ask again later."};
        System.out.println(answer[ranNum]);
        return 0;
        }

    public static void main(String[] args){
        prompt();
    }
}
