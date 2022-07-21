package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double f = 0;
		double c = 5 * ((f - 32) / 9);

		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		f = sc.nextDouble();

		System.out.println("A temperatura em graus Celsius é: " + c);

		sc.close();

	}

}
