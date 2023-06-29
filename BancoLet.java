
package com.mycompany.contabancaria;

public class BancoLet {
    
    
     public static void main(String[] args) {

    Conta contaBradesco = new Conta();
    contaBradesco.mostrarSaldo();
    contaBradesco.deposito(100);
    contaBradesco.mostrarSaldo();
    contaBradesco.saque(100);

    }
}
