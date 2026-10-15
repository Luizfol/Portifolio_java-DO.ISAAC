package Jogo.src;

import java.util.Random;
import java.util.Scanner;

public class main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha sua classe:");
        System.out.println("1 - Mago");
        System.out.println("2 - Guerreiro");
        int classe = lerOpcao(scanner, "Opção: ", 1, 2);

        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine().trim();
        if (nome.isEmpty()) {
            nome = "Aventureiro";
        }

        Personagem jogador;
        int arma;
        if (classe == 1) {
            Mago mago = new Mago(150, 1);
            mago.atacar = "Cajado";
            jogador = mago;
            System.out.println("Escolha seu cajado:");
            System.out.println("1 - Cajado de Cristal");
            System.out.println("2 - Cajado Carian Glintblade");
            arma = lerOpcao(scanner, "Opção: ", 1, 2);
        } else {
            Guerreiro guerreiro = new Guerreiro(200, 1);
            guerreiro.atacar = "Espada";
            jogador = guerreiro;
            System.out.println("Escolha sua espada:");
            System.out.println("1 - Lâmina de Escama de Dragão");
            System.out.println("2 - Rios de Sangue");
            arma = lerOpcao(scanner, "Opção: ", 1, 2);
        }

        jogador.nome = nome;
        jogador.equipamento = arma;

        System.out.println("Bem-vindo ao mundo de Warcraft, " + jogador.nome + "!");
        while (jogador.vida > 0) {
            System.out.println("\n1 - Ir para a batalha");
            System.out.println("2 - Consultar status");
            System.out.println("3 - Sair");
            int opcao = lerOpcao(scanner, "Opção: ", 1, 3);

            if (opcao == 1) {
                batalhar(scanner, jogador, arma);
            } else if (opcao == 2) {
                mostrarStatus(jogador);
            } else {
                System.out.println("Até a próxima aventura, " + jogador.nome + "!");
                break;
            }
        }

        if (jogador.vida <= 0) {
            System.out.println("Você foi derrotado. Fim de jogo!");
        }
    }

    private static void batalhar(Scanner scanner, Personagem jogador, int arma) {
        Inimigo inimigo = new Inimigo(100 + (jogador.nivel - 1) * 20, jogador.nivel);
        inimigo.nome = "Goblin";

        System.out.println("\nBATALHA INICIADA!");
        System.out.println(inimigo.nome + " apareceu! Vida: " + inimigo.vida);

        while (jogador.vida > 0 && inimigo.vida > 0) {
            System.out.println("\nSua vida: " + jogador.vida + " | Vida do " + inimigo.nome + ": " + inimigo.vida);
            System.out.println("1 - Ataque comum");
            System.out.println("2 - Habilidade especial");
            int ataque = lerOpcao(scanner, "Escolha seu ataque: ", 1, 2);

            int dano;
            if (ataque == 1) {
                dano = jogador instanceof Mago ? 18 : 25;
                System.out.println(jogador.nome + " ataca com " + jogador.atacar + "!");
            } else if (jogador instanceof Mago) {
                Mago mago = (Mago) jogador;
                if (arma == 1) {
                    mago.atacar_Cristal();
                } else {
                    mago.atacar_Carian();
                }
                dano = 40;
            } else {
                Guerreiro guerreiro = (Guerreiro) jogador;
                if (arma == 1) {
                    guerreiro.atacar_Dragao();
                } else {
                    guerreiro.atacar_Sangue();
                }
                dano = 35;
            }

            inimigo.vida = Math.max(0, inimigo.vida - dano);
            System.out.println("Você causou " + dano + " de dano!");

            if (inimigo.vida > 0) {
                int danoInimigo = 12 + RANDOM.nextInt(9) + (inimigo.nivel - 1) * 2;
                jogador.vida = Math.max(0, jogador.vida - danoInimigo);
                System.out.println(inimigo.nome + " contra-ataca e causa " + danoInimigo + " de dano.");
            }
        }

        if (jogador.vida > 0) {
            System.out.println("\nVocê derrotou o " + inimigo.nome + "!");
            jogador.nivel++;
            System.out.println("Você avançou para o nível " + jogador.nivel + ".");
        }
    }

    private static void mostrarStatus(Personagem jogador) {
        System.out.println("\n========================");
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Classe: " + (jogador instanceof Mago ? "Mago" : "Guerreiro"));
        System.out.println("Nível: " + jogador.nivel);
        System.out.println("Vida: " + jogador.vida);
        System.out.println("========================");
    }

    private static int lerOpcao(Scanner scanner, String mensagem, int minimo, int maximo) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao >= minimo && opcao <= maximo) {
                    return opcao;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
