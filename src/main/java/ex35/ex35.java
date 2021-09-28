/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package ex35;

import java.lang.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex35 {

    //Picking the winner by randomly generating a number and selecting it
    public static ArrayList<String> pickWinner(ArrayList<String> people){

        ArrayList<String> contest = people;
        int sizeOf = contest.size();
        int ranNum;
        Random numGen = new Random();

        //Generate random number from size of arraylist
        ranNum = numGen.nextInt(contest.size());
        System.out.println("The winner is... " + contest.get(ranNum-1) + ".");
        return contest;
    }

    //Ask for user input and adds to arraylist, when "" is entered, return arraylist
    public static ArrayList<String> createList() {

        ArrayList<String> people = new ArrayList<String>();
        boolean status = false;

        while (status == false) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Enter a name: ");
            String contestants = input.nextLine();
            people.add(contestants);

            if (contestants.equals("")) {
                status = true;
            }
        }
        return pickWinner(people);
    }

    public static void main(String arg[]){
        createList();
    }
}
