package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Jogodaadivinhacao {

    public static void main(String[] args) {

        
     try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int vitorias = 0;
            int derrotas = 0;
            
            
            System.out.print("Qual é o seu nome? ");
            String nomedojogador= scanner.nextLine();
            
            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            
            boolean jogarNovamente = true;
            while (jogarNovamente) {
                int numeroSecreto = random.nextInt(10) + 1;
                int tentativas = 0;
                boolean acertou = false;
                
                System.out.println("Um número entre 1 e 10 foi sorteado. Tente adivinhar!");
                
                while (!acertou) {
                    System.out.print("Digite seu palpite: ");
                    int palpite = scanner.nextInt();
                    tentativas++;
                    
                    if (palpite == numeroSecreto) {
                        acertou = true;
                        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                        vitorias++;
                    } else if (palpite < numeroSecreto) {
                        System.out.println("O número secreto é maior que o seu palpite.");
                    } else {
                        System.out.println("O número secreto é menor que o seu palpite.");
                    }
                }
                
                System.out.print("Deseja jogar novamente? (s/n): ");
                String resposta = scanner.next();
                if (!resposta.equalsIgnoreCase("s")) {
                    jogarNovamente = false;
                    System.out.println("Fim do jogo. Você venceu " + vitorias + " vezes e errou " + derrotas + " vezes.");
                } else {
                    System.out.println("Nova rodada!");
                }
            }
        }
    }
}
