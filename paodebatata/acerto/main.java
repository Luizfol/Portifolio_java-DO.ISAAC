package paodebatata.acerto;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {

       contaCorrente contaCorrente = new contaCorrente();
     
        contaCorrente.banco = "bmg";
        contaCorrente.nomeUSER = "matador de onça"; 
        contaCorrente.numCONTA = 888777;
        contaCorrente.saldo = 1000.0;
        contaCorrente.unidade = 0001;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para depósito ou 2 para saque: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            deposito deposito = new deposito();
            deposito.depositar(contaCorrente);
            System.out.println("Saldo: " + contaCorrente.saldo);
        } else {
            saque saque = new saque();
            saque.sacar(contaCorrente);
            System.out.println("Saldo: " + contaCorrente.saldo);
        }













        /*Scanner scanner = new Scanner(System.in);
        scanner.close();

        
        /*System.out.println("Digite o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        deposito.depositar(valorDeposito);

        System.out.println("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        saque.sacar(valorSaque);*/

        



    }
}
