package aula20220725;

import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double nota;

		do {

			System.out.print("Digite uma nota entre 0 e 10");
			nota = sc.nextDouble();

		} while (nota < 0 || nota > 10);
		System.out.println(nota + " é um número válido");

		sc.close();

	}

}
