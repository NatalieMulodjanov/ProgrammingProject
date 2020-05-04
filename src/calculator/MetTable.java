/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ntali
 */
public class MetTable {
    
   
    public static void readFile()throws FileNotFoundException{
        File metTable = new File("C:\\Users\\ntali\\Documents\\NetBeansProjects\\Calculator\\src\\calculator\\METtable.txt");
        Scanner fileMET = new Scanner(metTable);  
        
        while(fileMET.hasNext()){
            double metSleep = fileMET.nextDouble();
            double metWalk = fileMET.nextDouble();
            double metJog = fileMET.nextDouble();
            double metJump = fileMET.nextDouble();
            double metCalisthMod = fileMET.nextDouble();
            double metCalisthInts = fileMET.nextDouble();
            double metChores = fileMET.nextDouble();
            
        }
       
    }
}


