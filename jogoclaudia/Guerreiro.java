public class Guerreiro extends Personagem {
    private String arma;

    public Guerreiro(String nome, int nivel, int vida, String arma) {
        super(nome, nivel, vida);
        if (arma == null || arma.isBlank())
            throw new IllegalArgumentException("O guerreiro deve possuir uma arma."); // RN05
        this.arma = arma;
    }

    public String getArma() { return arma; }

    @Override
    protected int calcularDano() { return getNivel() * 5; }

    @Override
    public void atacar(Personagem alvo) {
        if (!podeAtacar()) return;
        System.out.println("O guerreiro " + getNome() + " ataca " + alvo.getNome()
                + " com " + arma + "!");
        alvo.receberDano(calcularDano());
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("   Tipo: Guerreiro | Arma: " + arma);
    }
}
