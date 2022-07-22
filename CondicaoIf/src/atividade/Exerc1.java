package atividade;

import java.util.Locale;
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		// Faça um programa que peça o nome e a senha e faça a verificação de uma variável que obtenha a senha e o usuário
		// (como se fosse cadastrado) e retorne erro caso a senha ou o usuário esteja errado.
		// A mensagem a ser mostrada deve ser de acordo com o respectivo erro!

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		String name, pass, verifiedPass = "senha", verifiedName = "weslei";

		System.out.print("Digite o nome: (weslei) ");
		name = sc.nextLine();

		System.out.print("Digite a senha: (senha)");
		pass = sc.nextLine();

		if (name.equals(verifiedName)) {

		} else {
			System.out.println("Você não digitou o nome corretamente.");
		}
		

		if (pass.equals(verifiedPass)) {

		} else {
			System.out.println("Você não digitou a senha corretamente.");
		}

		sc.close();

	}

}