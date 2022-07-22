package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double nota1, nota2, nota3, nota4;
		double media;

		System.out.println("Digite a nota 1: ");
		nota1 = sc.nextDouble();

		System.out.println("Digite a nota 2: ");
		nota2 = sc.nextDouble();

		System.out.println("Digite a nota 3: ");
		nota3 = sc.nextDouble();

		System.out.println("Digite a nota 4: ");
		nota4 = sc.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4)/4;

		System.out.println("A média é: " + media);

		sc.close();

	}

}
