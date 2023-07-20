

package com.mycompany.random;
import java.util.Scanner;
import java.util.Random;

public class Jokeipo {

    public static void main(String[] args) {
        

        int numeroJogador=0;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************** VAMOS JOGAR JOKEIPO? ***********************");
        System.out.println("Digite o numero de acordo com o objeto escolhido: \t");
        System.out.println("0-Pedra \t 1-Papel \t 2-Tesoura");
        numeroJogador=scanner.nextInt();

        
        //random
        Random random = new Random();
        int numeroAleatorio = random.nextInt(2);
        System.out.println("A Maquina escolheu o numero: " +numeroAleatorio);
        
        
        //se a jogada do usuario for igual a da maquina, system out empate
        if(numeroJogador==numeroAleatorio){
            System.out.println("Empate!");
        }else if ((numeroJogador==0)&&(numeroAleatorio==1)){
            System.out.println("O Jogador ganhou (Pedra)");
        }else if ((numeroJogador==1)&&(numeroAleatorio==2)){
            System.out.println("O Jogador ganhou (Papel)");
        }else if ((numeroJogador==1)&&(numeroAleatorio==0)){
            System.out.println("A Maquina ganhou (Papel)");
        }else if ((numeroJogador==1)&&(numeroAleatorio==2)){
            System.out.println("A Maquina ganhou (Papel)");   
        }   
        
        
    
        
    }
}
