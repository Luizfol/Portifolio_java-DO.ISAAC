package paodebatata.acerto;

import java.util.Scanner;

public class deposito extends contaCorrente{
 
    void depositar(contaCorrente contaAlvo){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        double valor = scanner.nextDouble(); 


        if( valor > 0){
            contaAlvo.saldo = contaAlvo.saldo + valor;
            System.out.println("depósito de R$" + valor + " realizado com sucesso!");
        }
        else {
            System.out.println(" não realizado, valor inválido");
        }
          System.out.println("Saldo atual: R$" + contaAlvo.saldo);
       
       scanner.close();
    }
    
}
