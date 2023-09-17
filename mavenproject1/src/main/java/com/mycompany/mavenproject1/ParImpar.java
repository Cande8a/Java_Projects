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
public class ParImpar {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Input number:");
        Integer number = inputNumber();
        
        Boolean esPar = (number % 2) == 0;
        if (esPar) {
             System.out.println("El numero es par");
        }
        else {
         System.out.println("el numero es impar");
        }
        
}
    private static Integer inputNumber() throws IOException{
        
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inputStreamReader);
        String strNumber = buffer.readLine();
        return Integer.valueOf(strNumber);
    }
}
