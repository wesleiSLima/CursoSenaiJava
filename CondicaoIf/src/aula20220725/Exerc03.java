package aula20220725;

import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		String nome; // maior que 3 letras ok
		int idade; // entre 0 e 150 ok
		double salario; // maior que 0 ok
		char sexo; // M ou F
		char estadoCivil; // s, c, v, d

		// Escolhe do nome

		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();

		while (nome.length() < 3) {
			
				System.out.println("O nome deve conter pelo menos 3 letras.");
				System.out.print("Digite seu nome novamente: ");
				nome = sc.nextLine();
		}

		// Escolhe da idade

		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();

		if (idade < 0 || idade > 150) {

			do {

				System.out.println("A idade deve ser entre 0 e 150.");
				System.out.print("Digite a idade novamente: ");
				idade = sc.nextInt();

			} while (idade < 0 || idade > 150);
		}

		// escolhe salario

		System.out.print("Digite seu salário: ");
		salario = sc.nextDouble();

		if (salario <= 0) {

			do {

				System.out.println("O salário tem que ser maior que 0.");
				System.out.print("Digite o salário novamente: ");
				salario = sc.nextDouble();

			} while (salario <= 0);
		}

		// escolhe sexo

		System.out.print("Digite seu sexo M ou F: ");
		sexo = sc.next().charAt(0);

		while (Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'F') {

			System.out.println("Só pode digitar m ou f");

			System.out.print("Digite seu sexo M ou F: ");
			sexo = sc.next().charAt(0);
		}

		// estado civil

		System.out.print("Digite o estado civil:  s, c, v, d");
		estadoCivil = sc.next().charAt(0);

		while (Character.toUpperCase(estadoCivil) != 'S' && Character.toUpperCase(estadoCivil) != 'C'
				&& Character.toUpperCase(estadoCivil) != 'V' && Character.toUpperCase(estadoCivil) != 'D') {

			System.out.println("Estado civil inválido. ");
			System.out.print("Digite o estado civil:  s, c, v, d");
			estadoCivil = sc.next().charAt(0);

		}
		sc.close();

	}
}
