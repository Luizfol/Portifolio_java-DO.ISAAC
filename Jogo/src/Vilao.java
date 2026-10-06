package Jogo.src;

public class Vilao {
       String nome;
    private int vida;

    public Vilao(String nomeEscolhido) {
        this.nome = nomeEscolhido;
        this.vida = 100;
        System.out.println("Aqui nasce o Vilao");
    }

    

    void tomarPocaoCurativa(int cura){
        vida = vida + cura;
        if (vida > 100){
            vida = 100;
        }
        System.out.println("vida " + cura);
        
    }
    void receberDano(int dano){
        vida = vida - dano;
        if (vida <= 0){
            vida = 0;
        
        System.out.println("voce foi derrotado");
        }else {
        System.out.println("voce sofreu dano " + dano);
        } 


    }         
}
