/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Imc {

   
    public static void main(String[] args) {
        
        
        Scanner scanner=new Scanner(System.in);
        double peso=0;
        double altura=0;
        double imc=0;
         System.out.println("Digite seu peso em kg (ex: 110,20");
         peso=scanner.nextDouble();
         System.out.println("Digite sua altura em metros (ex 1,50:");
         altura=scanner.nextDouble();
         imc=peso/(altura*altura);
         
         if(imc<18.5){
             System.out.println("Abaixo do peso");
         } else if(imc>18.5 && imc<=24.9){
             System.out.println("Peso normal");
         } else if(imc>=25 && imc<=29.9){
             System.out.println("Exesso de Peso");
         } else if(imc<=34.9){
             System.out.println("obesidade 1");
         }  else if(imc<=35 && imc<=39.9){
             System.out.println("Obesidade 2");
         } else if(imc>=40){
             System.out.println("obesidade 3");
         }          
                
    }    
  
}