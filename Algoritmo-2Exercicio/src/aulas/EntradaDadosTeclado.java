package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		String nome;
		int numero = 0;
		char sexo;
		double x = 10.25;
		
		//Entrada de dados

		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();

		System.out.print("Digite M para Masculino ou F para Feminino: ");
		sexo = leia.next().charAt(0);
		
		//impressão

		System.out.println("O valor de x é: " + x);
		System.out.println("O nome é: " + nome);
		System.out.println("O número é: " + numero);
		System.out.println("O sexo é: " + sexo);

		leia.close();

	}

}
