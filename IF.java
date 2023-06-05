package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author senai -  comparação a.equals(anObject:b))
 */
public class IF {
    public static void main (String[] args){
        
        String chuva;
        Scanner scanner=new Scanner(System.in);
        
    
          System.out.println("Esta chovendo? S,N");
           chuva=scanner.next();
       
           
          if (chuva.equals( "S")){
              System.out.println("Você disse que está chovendo");
          } else {
              System.out.println("Você disse que não está chovendo");
          }
    }
}

