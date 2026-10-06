package Jogo.src;

public class main {
    public static void main(String[] args) {
        Perssonagem General = new Perssonagem("Gengis Khan");
        Perssonagem General1 = new Perssonagem("Alexandre, o Grande");
        Perssonagem General2 = new Perssonagem("Napoleão Bonaparte");
        Vilao Vilao = new Vilao("Hitler");
        Vilao vilao1 = new Vilao("Josef Stalin");


        System.out.println("Iniciar jogo");
        General.receberDano(40);
        General.receberDano(10);
        General.tomarPocaoCurativa(10);
        General.tomarPocaoCurativa(70);

    }
}
