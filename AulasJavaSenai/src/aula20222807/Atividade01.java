package aula20222807;

import java.util.Locale;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int j = 0;
		Double media = 0.0;
		Double[] notas = new Double[4];

		for (int i = 0; i < notas.length; i++) {
			j++;
			System.out.print("Digite a " + j + "a nota: ");
			notas[i] = sc.nextDouble();
			media += notas[i];
		}

		j = 0;
		for (Double nota : notas) {
			j++;
			System.out.println("Nota " + j + " - " + nota);
		}

		media = media / 4;
		System.out.println("A média das notas é: " + media);
		sc.close();

	}

}
