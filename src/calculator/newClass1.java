/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;


import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author ntali
 */
public class newClass1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
    File metTable = new File("C:\\Users\\ntali\\Documents\\NetBeansProjects\\Calculator\\src\\calculator\\METtable.txt");
        
           Scanner inputFile = new Scanner(metTable);  
         
      int i = 0;
      do{
        
           i++;
           int sleepMet = inputFile.nextInt();
           System.out.println(sleepMet );
           
           
      }while(inputFile.hasNext()); 
    }
  
    } 

      
                 
    
        
   


