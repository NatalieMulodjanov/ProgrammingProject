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
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("**------------**"+
                           "\n|              |"+
                           "\n|  Calculator  | "+
                           "\n|              |"+
                           "\n**------------**");
        System.out.println("This calculator will solve day to day calculations you might need to do. ");
        System.out.println("Press 1 to continue to show the menu of options or 0 to exit");
        
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
                            "\nPress 2 for the Perimeter of various shapes " + 
                            "\nPress 3 for the Area of various shapes " +
                            "\nPress 4 for Quebec Tax calculator" + 
                            "\nPress 5 for Currency calculator" + 
                            "\nPress 6 for Calories Burnt Calculator" );
    
        int option = input.nextInt();
        
        switch(option){
            case 1:
                do{
                    System.out.println("Welcome to the simple calculations calculator, what operation would you like to do? ");
                    System.out.println("Press 1 for addition " + 
                                       "\nPress 2 for subtraction" + 
                                       "\nPress 3 for multiplication" + 
                                       "\nPress 4 for division");
                    
                    option = input.nextInt();

                    switch(option){
                        case 1: 
                            System.out.println("The sum is: " + SimpleCalculations.addition());
                            break;
                        case 2:
                            System.out.println("The difference is " + SimpleCalculations.subtraction());
                            break;
                        case 3: 
                            System.out.println("The product is: " + SimpleCalculations.multiplication());
                            break;
                        case 4: 
                            System.out.println("The qoutient is: " + SimpleCalculations.division());
                            break;
                        default: 
                            System.out.println("No such option");
                            input.nextLine();
                    }
                }while(option > 4);
                break;
            case 2: 
                do{
                    System.out.println("Welcome to the Perimeter calculator, what shape would you like to calculate the perimeter for? ");
                    System.out.println("Press 1 for rectangle" + 
                                       "\nPress 2 for parallelogram" + 
                                       "\nPress 3 for triangle " + 
                                       "\nPress 4 for circle " + 
                                       "\nPress 5 for hexagon" + 
                                       "\nPress 6 for trapezoid");
                    option = input.nextInt();
                    
                    switch(option){
                        case 1: 
                            System.out.println("The perimeter of the rectangle is: " + Perimeters.rectangleP() + " units");
                            break;
                        case 2 : 
                            System.out.println("The perimeter of the parallelogram is: " + Perimeters.parallelogramP() + " units");
                            break;
                        case 3 : 
                            System.out.println("The perimeter of the triangle is: " + Perimeters.triangleP() + " units");
                            break;
                        case 4 : 
                            System.out.println("The perimeter of the circle is: " + Perimeters.circleP() + " units");
                            break;
                        case 5 : 
                            System.out.println("The perimeter of the hexagon is: " + Perimeters.hexagonP() + " units");
                            break;
                        case 6: 
                            System.out.println("The perimeter of the trapazoid is: " + Perimeters.trapezoidP() + " units");
                            break;
                        default : 
                            System.out.println("No such option");
                            break;
                    }
                        
                }while(option > 6);
                break;
            case 4 : 
                System.out.println("Welscome to Québec Tax Calculator ");
                System.out.println("");
        }
        
    }//end main method
   
}//end of class 
