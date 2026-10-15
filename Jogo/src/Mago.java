package Jogo.src;

import java.util.Scanner;

public class Mago extends Personagem {


  int equipamento;

  public Mago(int vida, int nivel) {
        super(vida, nivel);
    }

    public Mago() {
    }
    
 



  void Mago(){
    System.out.println("Contemplem o mago");
    }

  void atacar_Cristal_leve(){
      System.out.println("Míssil Gravitacional ");
   }
   
   void atacar_Cristal_Pessado(){
      System.out.println("Meteoro de Cristal");
   }
  
  void atacar_Carian_leve(){
      System.out.println("Lâmina de Carian ");
   }
  
   void atacar_Carian_Pessado(){
      System.out.println("Lâmina de Carian Glintblade");
   }
  

    void mago(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("ESCOLHA SEU CAJADO: \n 1 - Cajado de Cristal \n 2 - Cajado Carian Glintblade");
      int opcao = scanner.nextInt();
      equipamento = opcao;

      if (equipamento == 1) {
        System.out.println("Vc possui o CAJADO DE CRISTAL ");
      }
      if (equipamento  == 2) {
        System.out.println("Vc possui o CAJADO CARIAN GLINTBLADE");
      }
      else{
        System.out.println("ESSA OPÇÂO CONTINUA NÂO EXISTINDO");
      }
    }

    int getEquipamento() {
        return equipamento;
    }
}
