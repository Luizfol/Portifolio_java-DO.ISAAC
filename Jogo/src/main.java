package Jogo.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.personagem();
        Mago mago = new Mago(150, 1);
        Guerreiro guerreiro = new Guerreiro(200, 1);
        Inimigo inimigo = new Inimigo("Goblin", 100, 1);

        if (personagem.classe == 1) {
            mago.mago();
        }
        if (personagem.classe == 2) {
            guerreiro.guerreiro();
        }

        // ------------------------ Sistema de batalha ------------------------//

        mago.vida = personagem.vida;
        guerreiro.vida = personagem.vida;
        inimigo.vida = personagem.vida;

        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Para ir a BATALHA \n2 - Consultar status \n3 - Sair");
            int opcao = scanner2.nextInt();

            if (opcao == 1) {
                System.out.println("BATALHA INICIADA");
                System.out.println("um inimigo apareceu");
                System.out.println("Nome: " + inimigo.nome);
                System.out.println("O inimigo possui " + inimigo.vida + " de vida e está no nivel " + inimigo.nivel);
                System.out.println("Seu nome é: " + personagem.nome);
                System.out.println("Seu personagem possui " + guerreiro.vida + " de vida e está no nivel " + guerreiro.nivel);
                System.out.println("Escolha seu ataque: \n 1 - Ataque leve \n 2 - Ataque pesado");
                int ataque = scanner2.nextInt();
                    if(ataque == 1){
                            if(personagem.classe == 1){
                                if(mago.equipamento == 1){
                                    mago.atacar_Cristal_leve();
                                }
                                 if(mago.equipamento == 2){
                                    mago.atacar_Carian_leve();
                                 }
                            }
                            if(personagem.classe == 2){
                                if(guerreiro.equipamento == 1){
                                    guerreiro.atacar_Dragao_leve();
                                }
                                 if(guerreiro.equipamento == 2){
                                    guerreiro.atacar_Sangue_leve();
                                 }
                            }
                    }
                    if(ataque == 2){
                            if(personagem.classe == 1){
                                if(mago.equipamento == 1){
                                    mago.atacar_Cristal_Pessado();
                                }
                                 if(mago.equipamento == 2){
                                    mago.atacar_Carian_Pessado();
                                 }
                            }
                            if(personagem.classe == 2){
                                if(guerreiro.equipamento == 1){
                                    guerreiro.atacar_Dragao_Pessado();
                                }
                                 if(guerreiro.equipamento == 2){
                                    guerreiro.atacar_Sangue_Pessado();
                                 }
                            }               
             return;
            } 


            else if (opcao == 2) {
                System.out.println("========================");
                System.out.println("Nome: " + personagem.nome);
                System.out.println("Nivel: " + guerreiro.nivel);
                System.out.println("Vida: " + guerreiro.vida);
                System.out.println("========================");
                // sem return: o laço volta e imprime o menu de novo

            } else if (opcao == 3) {
                System.out.println("Saindo do jogo...");
                return;

            } else {
                System.out.println("Opção inválida. Digite novamente.");
                // também volta ao menu
            }
        }
    }
}
}