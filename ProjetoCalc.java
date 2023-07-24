
package com.mycompany.contabancaria;
import java.util.Scanner;



public class ProjetoCalc {

 
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
        
            OperCalc resolucao = new OperCalc();
            System.out.println("************CALCULADORA DOS OPERADORES***********************");
            
            System.out.println("Digite o primeiro numero: ");
            resolucao.setvalor1(scanner.nextInt());
            System.out.println("Digite o segundo numero: ");
            resolucao.setvalor2(scanner.nextInt());
            
            resolucao.adicao();
            resolucao.subtracao();
            resolucao.multiplicacao();
            resolucao.divisao();
    }
    
}
