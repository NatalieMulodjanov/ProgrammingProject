/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Natalie Mulodjanov 
 */
public class Calculator {

    public static void main(String[] args) {
        
        System.out.println("**------------**"+
                           "\n|              |"+
                           "\n|  Calculator  | "+
                           "\n|              |"+
                           "\n**------------**");
        System.out.println("This calculator will solve day to day calculations you might need to do. ");
        System.out.println("Press 1 to continue show the menu of options...");
        
        Scanner input = new Scanner(System.in);
        while(! input.hasNextInt()){
            input.nextLine();
            System.out.println("Please press 1 to show the menu of options");
        }
        
        while(!input.hasNext("1")){
            input.nextLine();
            System.out.println("Please press 1 to show the menu of options");
        }
        int number = input.nextInt();
        System.out.println("MENU OF OPTIONS: " +
                            "\nPress 1 for simple calculations(addition, subtraction, multiplication or division)" +
                            "\nPress 2 for Perimetre of various shapes " + 
                            "\nPress 3 for Area of various shapes " +
                            "\nPress 4 for Quebec Tax calculator" + 
                            "\nPress 5 for Currency calculator" + 
                            "\nPress 6 for Calories Burnt Calculator" );

    }
   
}//end of class 
