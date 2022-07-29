package aula20222707;

import java.util.Locale;
import java.util.Scanner;

public class PesquisaIntencaoDeVotos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int lulaMolusco = 0;
		int bolsoNelson = 0;
		int ciloucaGomes = 0;
		int bolosBolinho = 0;
		int voto = 0;

		System.out.println("Jornal da meia noite ao meio dia, segunda edição");
		System.out.println("---------Pesquisa de intenção de votos----------\n");
		System.out.println("Vote no seu candidato:");
		System.out.println("1 - Lula Molusco");
		System.out.println("2 - Bolso Nelson");
		System.out.println("3 - Cilouca Gomes");
		System.out.println("4 - Bolos Bolinho");
		System.out.println("5 - SAIR");

		do {

			System.out.print("\nDIGITE UMA OPÇÃO: \n");
			voto = sc.nextInt();

			System.out.println("Você digitou a opção: " + voto);

			switch (voto) {
			case 1:

				lulaMolusco++;
				break;

			case 2:
				bolsoNelson++;
				break;

			case 3:
				ciloucaGomes++;
				break;

			case 4:
				bolosBolinho++;
				break;

			case 5:
				System.out.println("OBRIGADO POR PARTICIPAR");
				break;

			default:
				System.out.println("---------- NÚMERO INVÁLIDO ! ----------");
				break;
			}

			if (voto >= 1 && voto < 6) {
				System.out.println("\nLula Molusco tem: " + lulaMolusco + " votos.");
				System.out.println("Bolso Nelson tem: " + bolsoNelson + " votos.");
				System.out.println("Cilouca Gomes: " + ciloucaGomes + " votos.");
				System.out.println("Bolos Bolinho: " + bolosBolinho + " votos.");
			}

		} while (voto != 5);

		System.out.println("\n---------- PESQUISA ENCERRADA ----------");

		sc.close();

	}

}
