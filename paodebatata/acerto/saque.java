package paodebatata.acerto;

import java.util.Scanner;

public class saque extends contaCorrente {
  
    void sacar(contaCorrente contaAlvo){

        System.out.println("saldo: " + contaAlvo.saldo);
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = scanner.nextDouble();
       
       
        if(valor > contaAlvo.saldo){
             System.out.println(" não realizado, saldo insuficiente ou valor inválido");       
        } else {
           contaAlvo.saldo = contaAlvo.saldo - valor;
           System.out.println("Saldo atual: R$" + contaAlvo.saldo);
        }

     scanner.close();
    }
}
