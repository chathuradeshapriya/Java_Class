/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.logicaloperators.java;

/**
 *
 * @author ASUS
 */
public class LogicalOperatorsJava {

    public static void main (String [] args) {
        
        int x = 5;
        int y = 10;
        
        //AND Operator
        System.out.println(x>3 && y >5);
        System.out.println(x<3 && y<5);
        
        
        //OR Operator
        System.out.println(x>4 || y>15);
        System.out.println(x>50|| y>50);
        
        //NOT Operator
        System.out.println(!(x<8 && y<15));
    }
    
    
}
