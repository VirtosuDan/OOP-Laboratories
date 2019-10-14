package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter your string:");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        StringTransformations Text = new StringTransformations(string);


        System.out.println("Text has: "+Text.getNumberOfSenteces()+" Sentences");
        System.out.println("Text has: "+Text.getNumberOfWords()+" Words");
        System.out.println("Text has: "+Text.getNumberOfVowels()+" Vowels");
        System.out.println("Text has: "+Text.getNumberOfConsonants()+" Consonants");
        System.out.println("Text has: "+Text.getNumberOfLetters()+" Letters");
        System.out.println("The longest word is: "+Text.getLongestWord());
    }
}
