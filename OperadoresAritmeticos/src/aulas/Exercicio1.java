package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double num1, num2;
		double soma = 0.0;

		System.out.println("Digite um numero: ");
		num1 = sc.nextDouble();

		System.out.println("Digite outro numero: ");
		num2 = sc.nextDouble();

		soma = num1 + num2;

		System.out.println("A soma é: " + soma);

		sc.close();

	}

}
