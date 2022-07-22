package atividade;

import java.util.Locale;
import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		// Faça um programa que peça ao usuário para digitar um numero entre 1 e 7 não
		// podendo ser maior e nem menor.
		// O numero que a pessoa escolher representará um dia da semana (a semana começa
		// no domingo).

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int dia;

		System.out.println("Digite um número de 1 a 7: ");
		dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			
			break;
		case 2:
			System.out.println("Segunda-feira");

			break;
		case 3:
			System.out.println("Terça-feira");

			break;
		case 4:
			System.out.println("Quarta-feira");

			break;
		case 5:
			System.out.println("Quinta-feira");

			break;
		case 6:
			System.out.println("Sexta-feira");

			break;
		case 7:
			System.out.println("Sábado");

			break;

		default:
			System.out.println("Número digitado fora da faixa.");
			break;
		}

		sc.close();

	}

}
