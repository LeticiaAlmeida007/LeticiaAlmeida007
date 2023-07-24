
package com.mycompany.contabancaria;
import java.util.Scanner;
        
public class OperCalc {
    
        
    private int valor1;
    private int valor2;
    private int resultadoAdic;
    private int resultadoSub;
    private int resultadoMul;
    private int resultadoDiv;
    
    public int Opercalc(int valor1, int valor2){
    
        
        
        
        return 0;
    }

    
    
    
    Scanner scanner = new Scanner(System.in);
   
    
    public void setvalor1(int valor1){
       
        this.valor1=valor1;
    }
    
    public int getvalor1(){
    
        return this.valor1;
    }
    
    public void setvalor2(int valor2){
        
  
        
        this.valor2=valor2;
    }
    
    public int getvalor2(){
    
       return this.valor2;
    }
    
    public void setresultadoAdic(int resultadoAdic){
    
       this.resultadoAdic=resultadoAdic;
    }
    
   
    
    public int adicao(){
    
        resultadoAdic=valor1+valor2;  
        System.out.println("O valor da adicao dos operadores eh:"+resultadoAdic);
        return this.resultadoAdic;
    
    }
    
    public int subtracao(){

        resultadoSub=valor1-valor2;
        System.out.println("O valor da subtracao dos operadores eh:"+resultadoSub);
        return this.resultadoSub;
    }
    
    public int multiplicacao(){
    
        resultadoMul=valor1*valor2;
        System.out.println("O valor da multiplicacao dos operadores eh:"+resultadoMul);
        return this.resultadoMul;
    }
    
    public int divisao(){
    
       resultadoDiv=valor1/valor2;
       System.out.println("O valor da divisao dos operadores eh:"+resultadoDiv);
       return this.resultadoDiv;
    }
}
