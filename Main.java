package com.company;
import java.io.File;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter
        File text= new File("C:\\Users\\Virtosu Dan\\Desktop\\POO\\Lab4\\text.txt");
        Scanner sc = new Scanner(text);
        System.out.println("The expressions from text file are:");
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String inputWithoutSpaces = input.replaceAll("\\s+","");
            System.out.println("\n");
            System.out.println(input);
            if (VerifyParanthesis .balancedParenthesis(inputWithoutSpaces)) {
                System.out.println("The expression is balanced");
            }
            else {
                System.out.println("The expression is not balanced");
            }
        }
        sc.close();
    }
}