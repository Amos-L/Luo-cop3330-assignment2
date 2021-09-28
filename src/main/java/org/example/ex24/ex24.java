/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example.ex24;
import java.util.Scanner;
import java.util.Arrays;

public class ex24 {

    public static boolean AnagramTest(String word1, String word2) {

        //If not the same length return false
        if (word1.length() != word2.length()) {
            return false;
        } else {
            //Convert string to array
            char[] ArrayW1 = word1.toCharArray();
            char[] ArrayW2 = word2.toCharArray();

            Arrays.sort(ArrayW1); //Sorting array to see if they are the same
            Arrays.sort(ArrayW2);

            for (int i = 0; i < word1.length(); i++) { //Running through array and if they aren't the same return false
                if (ArrayW1[i] != ArrayW2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.printf("Enter two strings and I'll tell you if they are anagrams: \n");
        System.out.printf("Enter the first string: ");
            String str1 = x.nextLine();
        System.out.printf("Enter the second string: ");
            String str2 = x.nextLine();

        if (AnagramTest(str1, str2) == true) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", str1, str2);
        }
        else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", str1, str2);
        }
    }
}