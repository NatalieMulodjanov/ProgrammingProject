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
    
    public static double addition(){
        Scanner input = new Scanner (System.in);
        double total = 0;
        double answer = 0;
        System.out.println("Please enter the amount of numbers you want to add here >>>");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the amount of numbers you would like to add >>>");
        }
        int amountOfNums = input.nextInt();
        for(int i = 1; i <= amountOfNums; i++){
            System.out.println("Please enter the " + i + " number here >>>");
            while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the " + i + " number you would like to add >>>");
            }
            double number = input.nextDouble();
            total += number;
            answer = total;
        }
        return answer;
        
    }
    
    public static double subtraction(){
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.println("Please enter the first subtracting number >>> ");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the first subtracting number >>>");
            }
        answer = input.nextDouble();
        System.out.println("Please enter the subtracted number >>>");
            while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the the subtracted number >>>");
            }
        double number = input.nextDouble();
        answer -= number;
        System.out.println(answer);
        System.out.println("If you would like to subtract another number, enter it here, if not, press on any letter >>>");
        while (input.hasNextDouble()){
            System.out.println("If you would like to subtract another number, enter it here, if not, press on any letter >>>");
            double num = input.nextDouble();
            answer -= num;
        }
        return answer;
    }
    
    public static double multiplication(){
        Scanner input = new Scanner(System.in);
        double answer = 1;
        System.out.println("Please enter the amount of numbers you want to multiply here >>>");
        while(!input.hasNextDouble()){
            input.next();
            System.out.println("This is an invalid input, please enter the amount of numbers you would like to multiply >>>");
        }
        int amountOfNums = input.nextInt();
        for(int i = 1; i <= amountOfNums; i++){
            System.out.println("Please enter the " + i + " number here >>>");
            while(!input.hasNextDouble()){
                input.nextLine();
                System.out.println("This is an invalid input, please enter the " + i + " number you would like to multiply >>>");
            }   
            double number = input.nextDouble();
            answer *= number;
            }
        return answer;
        
    }
    
    public static double division(){
        Scanner input = new Scanner(System.in);
        double answer = 0;
        System.out.println("Please enter the dividend >>> ");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the dividend >>>");
            }
        answer = input.nextDouble();
        System.out.println("Please enter the divisor  >>>");
            while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is an invalid input, please enter the the divisor >>>");
            }
        double number = input.nextDouble();
        answer /= number;
        System.out.println(answer);
        System.out.println("If you would like to divid another number, enter it here, if not, press on any letter >>>");
        while (input.hasNextDouble()){
            System.out.println("If you would like to divid another number, enter it here, if not, press on any letter >>>");
            double num = input.nextDouble();
            answer /= num;
        }
        return answer;
    }
}//end of class
