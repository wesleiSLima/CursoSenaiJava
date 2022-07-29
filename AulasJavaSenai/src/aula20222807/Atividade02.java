package aula20222807;

import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int k = 0;
		int j = 0;
		int[] idades = new int[5];
		Double[] alturas = new Double[5];

		for (int i = 0; i < alturas.length; i++) {
			k++;
			System.out.println("Digite sua idade pessoa " + k + ": ");
			idades[i] = sc.nextInt();

			System.out.println("Digite sua altura pessoa " + k + ": ");
			alturas[i] = sc.nextDouble();
		}

		for (int i = 0; i <= 4; i++) {
			j++;
			System.out.println("A pessoa " + j + " tem " + idades[i] + " anos, e tem " + alturas[i] + " de altura.");
		}

		sc.close();

	}

}
