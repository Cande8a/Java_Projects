/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @Cande
 */
public class NumberCompares {
    public static void main(String[] args) throws IOException {
        
        System.out.println("First number:");
        Integer number1 = inputNumber();
        
        System.out.println("Second number:");
        Integer number2 = inputNumber();
        
        System.out.println("Third number:");
        Integer number3 = inputNumber();
        
        calculateHighest(number1, number2, number3);
        calculateLowest(number1, number2, number3);
}
    private static Integer inputNumber() throws IOException{
        
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String strNumber = buffer.readLine();
        return Integer.valueOf(strNumber);
    }
    
    private static void calculateHighest(Integer number1, Integer number2, Integer number3) {
        
        Integer highest = number1;
        if (number2 > highest){
            highest = number2;
        }
        if (number3 > highest){
            highest = number3;
        }
        System.out.println("The highest number is: " + highest);
    }
    
    /**
     * This function calculates the lowest number 
     * @param number1 The first number
     * @param number2 The second number
     * @param number3 The third number
     */
    private static void calculateLowest(Integer number1, Integer number2, Integer number3) {
        Integer lowest = number1;
        if (number2 < lowest){
            lowest = number2;
        }
        if (number3 < lowest){
            lowest = number3;
        }
        
        System.out.println("The lowest number is: " + lowest);
    
    } 
}
