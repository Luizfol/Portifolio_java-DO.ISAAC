package Jogo.src;

import java.util.Scanner;

public class Guerreiro extends Personagem   {
   int equipamento;

   public Guerreiro(int vida, int nivel) {
        super(vida, nivel);
    }

    public Guerreiro() {
    }
   public String arma = "Espada";

   void Guerreiro(){
      System.out.println("pelos poderes de grayskull eu tenho a força");
   }


   void atacar_Dragao_leve(){
      System.out.println("Espada de Relâmpago de Gelo");
   }
   void atacar_Dragao_Pessado(){
      System.out.println("Espada de Dragão");
   }


   void atacar_Sangue_leve(){
      System.out.println("Empilhador de Cadáveres");
   }
   void atacar_Sangue_Pessado(){
      System.out.println("Rios de Sangue");
   }
   

   void guerreiro(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("ESCOLHA SUA ESPADA: \n 1 - Lâmina de Escama de Dragão \n 2 - Rios de Sangue");
      int opcao = scanner.nextInt();
      int equipamento = opcao;

      if (equipamento == 1) {
         System.out.println("Vc possui a LAMINA DE ESCAMA DE DRAGÂO ");
      }
      if(equipamento == 2){
         System.out.println("Vc possui a lamina RIOS DE SAGUE ");
      }
      else{
         System.out.println("PARA DE TENTAR");
      }
   }
   int getEquipamento() {
        return equipamento;
    }
}         


