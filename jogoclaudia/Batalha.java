import java.util.Scanner;

public class Batalha {
    private Personagem lutador1;
    private Personagem lutador2;

    public Batalha(Personagem lutador1, Personagem lutador2) {
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
    }

    // Simulação automática (RF11)
    public void simular() {
        System.out.println("=== BATALHA: " + lutador1.getNome() + " vs " + lutador2.getNome() + " ===");
        int rodada = 1;
        while (lutador1.estaVivo() && lutador2.estaVivo()) {
            System.out.println("\n-- Rodada " + rodada++ + " --");
            if (lutador1.estaVivo()) lutador1.atacar(lutador2);
            if (lutador2.estaVivo()) lutador2.atacar(lutador1);
        }
        anunciarVencedor();
    }

    // Batalha interativa: o jogador escolhe a ação de cada turno (RN14)
    public void jogar(Scanner sc) {
        System.out.println("=== BATALHA: " + lutador1.getNome() + " vs " + lutador2.getNome() + " ===");
        int rodada = 1;
        boolean desistiu = false;

        while (lutador1.estaVivo() && lutador2.estaVivo() && !desistiu) {
            System.out.println("\n-- Rodada " + rodada++ + " --");
            Personagem[] ordem = { lutador1, lutador2 };
            for (int i = 0; i < 2 && !desistiu; i++) {
                Personagem atual = ordem[i];
                Personagem alvo = ordem[1 - i];
                if (!atual.estaVivo() || !alvo.estaVivo()) break;
                desistiu = turno(sc, atual, alvo);
            }
        }
        if (desistiu) System.out.println("\nA batalha foi encerrada por desistência.");
        else anunciarVencedor();
    }

    // Retorna true se o jogador desistiu
    private boolean turno(Scanner sc, Personagem atual, Personagem alvo) {
        while (true) {
            System.out.println("\nTurno de " + atual.getNome() + " (vida " + atual.getVida()
                    + ") | Inimigo: " + alvo.getNome() + " (vida " + alvo.getVida() + ")");
            System.out.println("1 - Atacar");
            System.out.println("2 - Ver status dos dois");
            System.out.println("3 - Desistir");
            System.out.print("Escolha: ");
            String opcao = sc.nextLine().trim();

            switch (opcao) {
                case "1":
                    atual.atacar(alvo);
                    return false;
                case "2":
                    atual.exibirInformacoes();
                    alvo.exibirInformacoes();
                    break; // não gasta o turno
                case "3":
                    return true;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void anunciarVencedor() {
        Personagem vencedor = lutador1.estaVivo() ? lutador1 : lutador2;
        System.out.println("\n=== Vencedor: " + vencedor.getNome() + " ===");
    }
}