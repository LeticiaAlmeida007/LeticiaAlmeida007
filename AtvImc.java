
package com.mycompany.exercicio;
import java.util.Scanner;


public class AtvImc {


    public static void main(String[] args) {
        
     Scanner scanner=new Scanner(System.in);

     ImcClasse IMC = new ImcClasse();       
     System.out.println("Digite seu peso em kg (ex: 110,20)");
     System.out.println("Digite sua altura em metros (ex 1,50)");
     IMC.Getpeso();
     IMC.Getaltura();
     IMC.Getimc();
             
     
     
    }
    
    
}
