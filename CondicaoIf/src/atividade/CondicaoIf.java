package atividade;

import java.util.Locale;
import java.util.Scanner;

public class CondicaoIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int n1, n2, n3;

		// Atividade 01:

		System.out.println("Digite um número inteiro: ");
		n1 = sc.nextInt();

		System.out.println("Digite outro número inteiro: ");
		n2 = sc.nextInt();

		if (n1 > n2) {

			System.out.printf("O maior deles: %d", n1);

		} else {

			System.out.printf("O maior deles é: %d", n2);

		}

		// Atividade 02:

		System.out.print("Digite um número inteiro: ");
		n1 = sc.nextInt();

		System.out.print("Digite outro número inteiro: ");
		n2 = sc.nextInt();

		System.out.print("Digite outro número inteiro: ");
		n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3) {

			System.out.printf("%d é o maior deles.", n1);

		} else {

			System.out.println((n2 > n3) ? n2 + " é o maior dels" : n3 + " é o maior deles");

		}

		sc.close();

	}

}
