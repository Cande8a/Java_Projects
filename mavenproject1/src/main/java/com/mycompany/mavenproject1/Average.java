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
 * @author PC
 */
public class Average {
    public static void main(String[] args) throws IOException {
        
        System.out.println("First number:");
        Integer number1 = inputNumber();
        
        System.out.println("Second number:");
        Integer number2 = inputNumber();
        
        System.out.println("Third number:");
        Integer number3 = inputNumber();
        
        Integer sum = number1 + number2 + number3;
        Double avgNumber = Double.valueOf(sum) / 3;
        System.out.println("The average number is: " + avgNumber);
                
}
    private static Integer inputNumber() throws IOException{
        
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String strNumber = buffer.readLine();
        return Integer.valueOf(strNumber);
    }
}
