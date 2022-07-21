package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double valorHora;
		double qtdHorasMes;
		double salario;

		System.out.print("Quanto você ganha por hora ? ");
		valorHora = sc.nextDouble();

		System.out.print("Quantas horas você tralhou no mês ? ");
		qtdHorasMes = sc.nextDouble();

		salario = (valorHora * qtdHorasMes);

		System.out.println("Seu salário este mês é de: " + salario);

		sc.close();

	}

}
