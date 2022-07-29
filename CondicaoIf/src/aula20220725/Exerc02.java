package aula20220725;

import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		String name, password;
		
		System.out.print("Digite seu nome: ");
		name = sc.nextLine();

		System.out.print("Digite sua senha: ");
		password = sc.nextLine();

		do {
			
			System.out.println("Nome e senha iguais ! Digite novamente: ");
			System.out.print("Digite seu nome: ");
			name = sc.nextLine();

			System.out.print("Digite sua senha: ");
			password = sc.nextLine();

		} while (name.equals(password));
		
		System.out.println("Acesso liberado !");
		

		sc.close();
	}

}
