/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ntali
 */
public class SimpleCalculations {
    
    public static void addition(){
        Scanner input = new Scanner (System.in);
        double number = 0;
        double total = 0;
        double answer = 0;
        System.out.println("Please enter the amount of numbers you want to add here or 00 to exit>>>");
        while(!input.hasNextInt()){
            input.next();
            System.out.println("This is an invalid input, the amount of numbers must be a whole number or 00 to exit >>>");
        }
        int amountOfNums = input.nextInt();
        for(int i = 1; i <= amountOfNums; i++){
            System.out.println("Please enter the " + i + " number here >>>");
            while(!input.hasNextDouble()){
            input.next();
            System.out.println("This is an invalid input, please enter the " + i + " number you would like to add >>>");
            }
            number = input.nextDouble();
            total += number;
            answer = total;
        }
        if(amountOfNums != 00)
            System.out.printf("The sum is: %.2f", answer);
    }
    
    public static void subtraction(){
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.println("Please enter the first subtracting number or 00 to exit>>> ");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the first subtracting number >>>");
        }
        answer = input.nextDouble();
        if(answer != 00){
            System.out.println("Please enter the subtracted number >>>");
                while(!input.hasNextDouble()){
                input.next();
                System.out.println("This is an invalid input, please enter the the subtracted number >>>");
                }
            double number = input.nextDouble();
            answer -= number;
            System.out.println(answer);
            System.out.println("If you would like to subtract another number, enter it here, if not, press on any letter >>>");
            while (input.hasNextDouble()){
                System.out.println("If you would like to subtract another number, enter it here, if not, press on any letter to get exit>>>");
                double num = input.nextDouble();
                answer -= num;
            }
            System.out.printf("The difference is: %.2f" , answer);
        }
    }
    
    public static void multiplication(){
        Scanner input = new Scanner(System.in);
        double answer = 1;
        System.out.println("Please enter the amount of numbers you want to multiply here or 00 to exit>>>");
        while(!input.hasNextInt()){
            input.next();
            System.out.println("This is an invalid input, the amount of numbers must be a whole number or 00 to exit>>>");
        }
        int amountOfNums = input.nextInt();
        for(int i = 1; i <= amountOfNums; i++){
            System.out.println("Please enter the " + i + " number here >>>");
            while(!input.hasNextDouble()){
                input.next();
                System.out.println("This is an invalid input, please enter the " + i + " number you would like to multiply >>>");
            }   
            double number = input.nextDouble();
            answer *= number;
        }
        if(amountOfNums != 00)
            System.out.printf("The product is: %.2f", answer);
    }
    
    public static void division(){
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.println("Please enter the dividend or 00 to exit>>> ");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the dividend >>>");
        }
        answer = input.nextDouble();
        if(answer != 00){
            System.out.println("Please enter the divisor or 00 to exit>>>");
                while(!input.hasNextDouble()){
                input.nextLine();
                System.out.println("This is an invalid input, please enter the the divisor >>>");
                }
            double number = input.nextDouble();
            if(number != 00){
                answer /= number;
                System.out.println(answer);
                System.out.println("If you would like to divid another number, enter it here, if not, press on any letter >>>");
                while (input.hasNextDouble()){
                    System.out.println("If you would like to divid another number, enter it here, if not, press on any letter >>>");
                    double num = input.nextDouble();
                    answer /= num;
                }
                System.out.printf("The qutient is: %.2f" ,answer);
            }
        }
    }
}//end of class
