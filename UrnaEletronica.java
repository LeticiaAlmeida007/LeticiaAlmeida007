
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class UrnaEletronica {

   
    public static void main(String[] args) {
        // a urna apresenta tres possiveis candidatos com um numero correspondente a cada candidato
        
        final int Candidato1 = 77123; //Pedro
        final int Candidato2 = 90321; //Maria
        final int Candidato3 = 12345; //João
        
        int votosCandidato1=0;
        int votosCandidato2=0;
        int votosCandidato3=0;
        
        int voto=0;
        
        
            
     do{ //rodar novamente
         //O programa apresenta um campo de entrada de dados para que digite a escolha do seu candidato
        
         System.out.println("***************** ELEIÇÕES 2023 ********************** \nDigite o número do seu Candidato:\n77123-Pedro\n90321-Maria\n12345-João");
         Scanner scanner=new Scanner(System.in);
         voto=scanner.nextInt(); //novo voto
        
         //ao digitar o numero escolhido, o programa ira somar um voto para o candidato escolhido pelo usuario
         //o programa deve exibir ao usuario uma mensagem que o voto foi computado com sucesso após, deve solicitar um novo voto

          if(voto==77123){
            votosCandidato1=votosCandidato1+1;
            System.out.println("Você votou no Pedro.Seu voto foi computado com sucesso");
          } else if (voto==90321){
            votosCandidato2=votosCandidato2+1;
            System.out.println("Você votou na Maria.Seu voto foi computado com sucesso");
          } else if (voto==12345){
            votosCandidato3=votosCandidato3+1;
            System.out.println("Você votou no João. Seu voto foi computado com sucesso");
          } else {
            if (voto!=00000){ //e se for diferente dos anteriores e esse
            System.out.println("Você não digitou um número válido!");
          }
          }
          
         //quando o mesário digitar a senha secreta, o programa vai parar de disponibilizar votos

        }while(voto!=00000); //mesario
       
        //o programa deve exibir a quantidade de votos para cada candidato
        
        System.out.println("A votação encerrou. \nVotos:\nPedro: "+votosCandidato1+"\nMaria: "+votosCandidato2+"\nJoao: "+votosCandidato3);
        
        
    }
    
}
