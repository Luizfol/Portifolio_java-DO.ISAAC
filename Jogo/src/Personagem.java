package Jogo.src; 

import java.util.Scanner;

public class Personagem {   
    String nome;
    String atacar;
    int vida;
    int nivel;
    int classe;

  

 public Personagem(int vida, int nivel) {
        this.vida = vida;
        this.nivel = nivel;
    }
    public Personagem() {
    }



 void personagem(){    
    Scanner sc = new Scanner(System.in);
    System.out.println("escolha sua classe 1 para MAGO e 2 para GUERREIRO: ");
    int opcao = sc.nextInt();
    classe = opcao;
    Guerreiro guerreiro = new Guerreiro();
    Mago mago = new Mago();
    
     if(classe == 1){
        mago.Mago();
        System.out.println("Vc esclheu a classe mago");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        nome = sc2.nextLine();
        System.out.println("Bem vindo ao mundo de Warcraft! Esperamos que esse mundo seja uma aventura para vc " + nome);
        mago.vida = 150;
        mago.nivel = 1;
    }
    else if(classe == 2){
        guerreiro.Guerreiro();
        System.out.println("Vc ecolheu a classe guerreiro");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        nome = sc2.nextLine();
        System.out.println("Bem vindo ao mundo de Warcraft! Esperamos que esse mundo seja uma aventura para vc " + nome);
        guerreiro.nivel = 1;
        guerreiro.vida = 200;

    }
    else{
       System.err.println("ESSA OPÇÃO NÃO EXISTE ANTA");
    }

    classe = opcao;


    






    }
  }

