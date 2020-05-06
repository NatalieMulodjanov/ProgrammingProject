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
                            "\nPress 4 for Tax calculator" + 
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
                            System.out.printf("The product is: %.2f", SimpleCalculations.multiplication());
                            break;
                        case 4: 
                            System.out.printf("The qoutient is: %.2f", SimpleCalculations.division());
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
                            System.out.printf("The perimeter of the rectangle is:  %.2f", Perimeters.rectangleP() );
                            System.out.print(" units");
                            break;
                        case 2 : 
                            System.out.printf("The perimeter of the parallelogram is: %.2f" + Perimeters.parallelogramP());
                            System.out.print( " units");
                            break;
                        case 3 : 
                            System.out.printf("The perimeter of the triangle is: %.2f" + Perimeters.triangleP() );
                            System.out.print( " units");
                            break;
                        case 4 : 
                            System.out.printf("The perimeter of the circle is:  %.2f", Perimeters.circleP() );
                            System.out.print(" units");
                            break;
                        case 5 : 
                            System.out.printf("The perimeter of the hexagon is: %.2f" + Perimeters.hexagonP());
                            System.out.print( " units");
                            break;
                        case 6: 
                            System.out.printf("The perimeter of the trapazoid is: %.2f" + Perimeters.trapezoidP());
                            System.out.print( " units");
                            break;
                        default : 
                            System.out.println("No such option");
                            break;
                    }
                        
                }while(option > 6);
                break;
            case 4 : 
                 do{
                    System.out.println("Welscome to the Tax Calculator ");
                    System.out.println("Please enter your province: " + 
                                       "\nPress 1 for Quebec" + 
                                       "\nPress 2 for Ontario" + 
                                       "\nPress 3 for British Colombia" + 
                                       "\nPress 4 for Saskatchewan" + 
                                       "\nPress 5 for Manitoba" + 
                                       "\nPress 6 for Alberta");
                    option = input.nextInt();

                    switch(option){

                            case 1: 
                                System.out.println("The Province Of Quebec: \n");
                                double price = Tax.getPrice();
                                double national = Tax.getNational();
                                Tax.setProvincial(0.09975);
                                double provincial = Tax.getProvincial();
                                double tax = price * (provincial + national);
                                double priceAfterTax = price + tax;

                                System.out.println("================================");
                                System.out.println("         SUBTOTAL:" + price + "$");
                                System.out.println("     TPS:" + national + "   TVQ:" + provincial);
                                System.out.println("         TOTAL:" + priceAfterTax + " $");
                                System.out.println("         ************");
                                System.out.println("================================");
                                break;
                            case 2: 
                                System.out.println("The Province Of Ontario:\n");
                                price = Tax.getPrice();
                                Tax.setProvincial(0.13);
                                provincial = Tax.getProvincial();
                                tax = price * provincial;
                                priceAfterTax = price + tax;

                                System.out.println("================================");
                                System.out.println("         SUBTOTAL:" + price + " $");
                                System.out.println("         HST:" + provincial);
                                System.out.println("         TOTAL:" + priceAfterTax + " $");
                                System.out.println("         ************");
                                System.out.println("================================");
                                break;
                            case 3:
                                System.out.println("The Province of British Colombia: \n");
                                price = Tax.getPrice();
                                national = Tax.getNational();
                                Tax.setProvincial(0.07);
                                provincial = Tax.getProvincial();
                                tax = price * (provincial + national);
                                priceAfterTax = price + tax;

                                System.out.println("================================");
                                System.out.println("         SUBTOTAL:" + price + " $");
                                System.out.println("     GST:" + national + "     PST:" + provincial);
                                System.out.println("         TOTAL:" + priceAfterTax + " $");
                                System.out.println("         ************");
                                System.out.println("================================");
                                break;
                            case 4: 
                                System.out.println("The Province of Saskatchewan: \n");
                                price = Tax.getPrice();
                                national = Tax.getNational();
                                Tax.setProvincial(0.06);
                                provincial = Tax.getProvincial();
                                tax = price * (provincial + national);
                                priceAfterTax = price + tax;

                                System.out.println("================================");
                                System.out.println("         SUBTOTAL:" + price + " $");
                                System.out.println("     GST:" + national + "     PST:" + provincial);
                                System.out.println("         TOTAL:" + priceAfterTax + " $");
                                System.out.println("         ************");
                                System.out.println("================================");
                                break;
                            case 5:
                                System.out.println("The Province of Manitoba \n");
                                price = Tax.getPrice();
                                national = Tax.getNational();
                                Tax.setProvincial(0.07);
                                provincial = Tax.getProvincial();
                                tax = price * (provincial + national);
                                priceAfterTax = price + tax;

                                System.out.println("================================");
                                System.out.println("         SUBTOTAL:" + price + " $");
                                System.out.println("     GST:" + national + "     PST:" + provincial);
                                System.out.println("         TOTAL:" + priceAfterTax + " $");
                                System.out.println("         ************");
                                System.out.println("================================");
                                break;
                            case 6: 
                                System.out.println("The Province of Alberta: \n");
                                price = Tax.getPrice();
                                national = Tax.getNational();
                                tax = price * national;
                                priceAfterTax = price + tax;

                                System.out.println("================================");
                                System.out.println("         SUBTOTAL:" + price + " $");
                                System.out.println("            GST:" + national);    
                                System.out.println("         TOTAL:" + priceAfterTax + " $");
                                System.out.println("         ************");
                                System.out.println("================================");
                                break;
                            default : 
                                System.out.println("No such option");
                                break;
                    }   
               
            }while(option > 6);
            break;
            
            
        }
        
    }//end main method
   
}//end of class 
