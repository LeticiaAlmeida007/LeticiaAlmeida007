
package com.mycompany.exercicio;
import java.util.Scanner;


public class ImcClasse {
    
    private double peso=0;
    private double altura=0;
    private double imc=0;
    
    Scanner scanner=new Scanner(System.in);

    
    public void Setpeso(double peso){
      this.peso=peso;
    }
    public double Getpeso(){
     peso=scanner.nextDouble();
        return this.peso;
    }
    public void Setaltura(double altura){
        this.altura=altura;
    }
    public double Getaltura(){
      altura=scanner.nextDouble();
        return this.altura;
    }
    public void Setimc(double imc){
        this.imc=imc;
    }
    public double Getimc(){
       imc=peso/(altura*altura);
       if(imc<18.5){
             System.out.println("Abaixo do peso");
         } else if(imc>18.5 && imc<=24.9){
             System.out.println("Peso normal");
         } else if(imc>=25 && imc<=29.9){
             System.out.println("Excesso de Peso");
         } else if(imc<=34.9){
             System.out.println("obesidade 1");
         }  else if(imc<=35 && imc<=39.9){
             System.out.println("Obesidade 2");
         } else if(imc>=40){
             System.out.println("obesidade 3");
         }
       
       
        return this.imc;
    }
    
   
    
    
    
    
    
}
