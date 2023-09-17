/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;

/**
 *
 * @author PC
 */
public class NumerosPrimos {
    public static void main(String[] args) throws IOException {
        String resultado = "";
        
        int contador = 0;
        int numero = 1;
        while(contador < 100){
            if (esPrimo(numero)){
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 numeros primos son: " + resultado);
    }
    private static Boolean esPrimo(Integer number){
        
        Boolean esNumeroPrimo = true;
        
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                esNumeroPrimo = false;
            }      
                
        }
        return esNumeroPrimo;
    }

}
