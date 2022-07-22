package atividade;

import java.util.Locale;
import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça ao usuário para escolher o item de um menu e a
		 * quantidade: (apenas 1 item)
		 * 
		 * 1 - sanduiche natureba 2 - Sanduba Bomba 3 - Coxinha de Jaca 4 - Feijoada
		 * vegetariana
		 * 
		 */

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int num, qtd;

		System.out.println("-------------MENU-------------");
		System.out.println("1 - sanduiche natureba");
		System.out.println("2 - Sanduba Bomba");
		System.out.println("3 - Coxinha de Jaca");
		System.out.println("4 - Feijoada vegetariana ");
		System.out.println("---------------------------");

		System.out.print("Digite o item pelo número: ");
		num = sc.nextInt();

		System.out.print("Digite a quantidade: ");
		qtd = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("---------------------------");
			System.out.println("Seu pedido é: ");
			if (qtd > 1) {
				System.out.println(qtd + " unidades de sanduiche natureba");
			} else
				System.out.println(qtd + " unidade de sanduiche natureba");

			break;
		case 2:
			System.out.println("---------------------------");
			System.out.println("Seu pedido é: ");
			if (qtd > 1) {
				System.out.println(qtd + " unidades de Sanduba Bomba");
			} else
				System.out.println(qtd + " unidade de Sanduba Bomba");

			break;
		case 3:
			System.out.println("---------------------------");
			System.out.println("Seu pedido é: ");
			if (qtd > 1) {
				System.out.println(qtd + " unidades de Coxinha de Jaca");
			} else
				System.out.println(qtd + " unidade de Coxinha de Jaca");

			break;
		case 4:
			System.out.println("---------------------------");
			System.out.println("Seu pedido é: ");
			if (qtd > 1) {
				System.out.println(qtd + " unidades de Feijoada vegetariana");
			} else
				System.out.println(qtd + " unidade de Feijoada vegetariana");

			break;

		default:

			System.out.println("Número inválido !");
			break;
		}

		sc.close();

	}

}
