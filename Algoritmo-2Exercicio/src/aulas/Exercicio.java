package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		String nome;
		int idade;
		char sexo;
		double saldo;

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Digite o nome do usuário: ");
		nome = sc.nextLine();

		System.out.print("Digite a idade: ");
		idade = sc.nextInt();

		System.out.print("Digite o sexo M ou F: ");
		sexo = sc.next().charAt(0);

		System.out.print("Digite o saldo: ");
		saldo = sc.nextDouble();

		System.out.println(nome + " tem " + idade + " anos, seu sexo é " + sexo + " e possui a fortuna de R$ " + saldo
				+ " reais no banco.");

		sc.close();

	}

}
