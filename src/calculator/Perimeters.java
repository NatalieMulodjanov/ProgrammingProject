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
public class Perimeters {
    public static double rectangleP(){
        System.out.println(" --------------");
        System.out.println("|              |");
        System.out.println("|  Rectangle   |");
        System.out.println("|              |");
        System.out.println(" --------------");
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
 
        for(int i = 1; i <= 2; i++){       
            System.out.println("Please enter the "  + i + " side here >>>");
            while(!input.hasNextDouble()){
                input.next();
                System.out.println("This is not a valid value, please enter the side value in numbers  >>>");
            }
            double side = input.nextDouble();
            while(!Perimeters.isPositive(side)){
               System.out.println("This is an invalid input, the side has to be a positive greater than zero number >>>");
               side = input.nextDouble();
            }
            perimeter = perimeter + (2 * side); 
             
        }
        return perimeter;
    }
    
    public static double parallelogramP(){
        System.out.println("   --------------");
        System.out.println("  /             /");
        System.out.println(" /Parallelogram/");
        System.out.println("/             /");
        System.out.println("--------------");
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        
        for(int i = 1; i <= 2; i++){
            System.out.println("Please enter the " + i + " side of the parallelogram here >>>");
            while(!input.hasNextDouble()){
                input.nextLine();
                System.out.println("This is not a valid value, please enter the side values in numbers >>>");
            }
            double side = input.nextDouble();
            while(!Perimeters.isPositive(side)){
                System.out.println("This is an invalid input, the side has to be a positive greater than zero number >>>");
                side = input.nextDouble();
            }
            perimeter = perimeter + (2 * side); 
        }
        return perimeter;
    }
    
    public static double triangleP(){
        System.out.println("        / \\");
        System.out.println("       /   \\");
        System.out.println("      /     \\");
        System.out.println("     /       \\");
        System.out.println("    /         \\");
        System.out.println("   / triangle  \\");
        System.out.println("  ---------------");
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        
        for(int i = 1; i <= 3; i++){
            System.out.println("Please enter the " + i + " side of the triangle >>>");
            while(!input.hasNextDouble()){
                input.next();
                System.out.println("This is not a valid value, please enter the side values in numbers >>>");
            } 
            double side = input.nextDouble();
            while(!Perimeters.isPositive(side)){
                System.out.println("This is an invalid input, the side has to be a positive greater than zero number >>>");
                side = input.nextDouble();
            }
            perimeter += side;
        }
        return perimeter;
    }
    
    public static double circleP(){
        System.out.println("     ****");
        System.out.println("  *        *");
        System.out.println(" *  Circle  *");
        System.out.println(" *          *");
        System.out.println("  *        *");
        System.out.println("     ****");
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        System.out.println("Please enter the radius >>>");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is not a valid value, please enter the radius in numbers >>>");
        }
        double radius = input.nextDouble();
        while(!Perimeters.isPositive(radius)){
            System.out.println("This is an invalid input, the side has to be a positive greater than zero number >>>");
            radius = input.nextDouble();
        }
        perimeter = 2 * (Math.PI) * radius;
        return perimeter;
    }
    
    public static double hexagonP(){
         System.out.println("   ______");
        System.out.println("  /      \\");
        System.out.println(" /        \\");
        System.out.println(" \\Hexagon /");
        System.out.println("  \\      /");
        System.out.println("   -----");
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        System.out.println("Please enter the side >>> ");
        while(!input.hasNextDouble()){
            input.nextLine();
            System.out.println("This is not a valid value, please enter the side in numbers >>>");
        }
        double side = input.nextDouble();
        while(!Perimeters.isPositive(side)){
                System.out.println("This is an invalid input, the side has to be a positive greater than zero number >>>");
                side = input.nextDouble();
        }
        perimeter = 6 * side;
        return perimeter;
    }
    
    public static double trapezoidP(){
        System.out.println("   _______ ");
        System.out.println("  /       \\");
        System.out.println(" /         \\");
        System.out.println("/ Trapazoid \\");
        System.out.println("-------------");
        Scanner input = new Scanner(System.in);
        double perimeter = 0;
        for (int i = 1; i <= 4; i ++){
            System.out.println("Enter the " + i + " side here >>>");
            while(!input.hasNextDouble()){
                input.nextLine();
                System.out.println("This is not a valid value, please enter the side in numbers >>>");
            }
            double side = input.nextDouble();
            while(!Perimeters.isPositive(side)){
                System.out.println("This is an invalid input, the side has to be a positive greater than zero number >>>");
                side = input.nextDouble();
            }
            perimeter += side;
        }
        return perimeter;
    }
    
    public static boolean isPositive(double value){
        if(value > 0){
            return true;
        }else return false;
    }
}
