package Metodos;

public class main {
    public static void main(String[] args) {
        
        luffy luffy = new luffy();
        luffy.nome = "luffy";
        luffy.recompensa = 3000000000L;
        luffy.Tesouro = "Thounsand_Sunny";
        luffy.sonho = "Ser o Rei dos Piratas";

        sanji sanji = new sanji();
        sanji.nome = "sanji";
        sanji.recompensa = 1032000000L;
        sanji.Tesouro  = "Nami";
        sanji.sonho = "Encontrar o all blue";

        zoro zoro = new zoro();
        zoro.nome = "zoro";
        zoro.recompensa = 1111000000L;
        zoro.Tesouro = "Ema";
        zoro.sonho = "Ser o maior espadachin";

        pirata pirata = new pirata();

        brook brook = new brook();
        brook.nome = "Brook";
        brook.Tesouro = "cabelo afro";
        brook.recompensa = 383000000L;
        brook.sonho = "reunir-se com seu velho amigo, Laboon";


        System.out.println("Nome: " + luffy.nome );


        luffy.atacar();
        sanji.atacar();
        zoro.atacar();
        pirata.atacar();
        brook.atacar();



    }
}
