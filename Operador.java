
package com.mycompany.contabancaria;
import java.util.Scanner;


public class Operador {


    public static void main(String[] args) {
        
    }
    //propriedades
    float num1=0;
    float num2=0;
    float result=0;
    float tipo=0;
    int opcao;
            
    //condicao    


    //metodo construtor
    public Operador(){
      
    }
    
    public float tipo(float soma, float subtracao, float multiplicacao){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("************CALCULADORA***********************");
        System.out.println("Selecione o numero de acordo com o calculo que deseja: 1-Soma, 2-Subtracao, 3-Multiplicacao ou 4-divisao");
        opcao = scanner.nextInt();
        System.out.println("Digite o primeiro numero:\t");
        System.out.println("Digite o segundo numero:\t");

      
        if(opcao == 1){
        result=num1+num2;   
        System.out.println("O resultado da operacao eh:"+result);
    
        }else if (opcao == 2){
        result=num1-num2;   
        System.out.println("O resultado da operacao eh:"+result);
        }else if (opcao == 3){
        result=num1*num2;   
        System.out.println("O resultado da operacao eh:"+result);
        }else if (opcao == 4){
        result=num1/num2; 
        
        
         
        }           
        return 0;
    }
    //metodos
    public float soma(float num1, float num2){ 
        result=num1+num2;   
        return 0;
    }
    
    public float subtracao(float num1,float num2){
        result=num1-num2;   
        return 0;
    }
    
    public float multiplicacao(float num1,float num2){
        result=num1*num2;   
        return 0;
    }
    public float divisao(float num1,float num2){
        result=num1/num2;   
        return 0;
    }
 
}
