package aula20222807;

import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ------------------------declarar array------------------------
		/*
		 * int[] numero = new int[5]; int[] numero2 = {1,2,3,4,5};
		 * 
		 * System.out.println(numero2[2]); System.out.println(numero.length);
		 * 
		 * System.out.println("digite o tamanho do array: "); int qtd = sc.nextInt();
		 * 
		 * int[] tamanho = new int[qtd];
		 * 
		 * System.out.println("O array tem: " + tamanho.length + "posições");
		 */
		// ----------------------percorrer um array---------------------------

		// int[] array = { 1, 12, 34, 65, 34 };

		/*
		 * for (int i = 0; i < array.length; i++) {
		 * 
		 * System.out.println("posição" + i + " , valor no array: " + array[i]);
		 */

		// ----------------foreach-----------------------------------------

		/*
		 * int[] array = { 1, 12, 34, 65, 34 };
		 * 
		 * for (int i : array) { System.out.println(i); }
		 */
		// --------------------outro----------------------------------------

		System.out.print("entre com a qtd do array: ");
		int qtd = sc.nextInt();

		String[] nomes = new String[qtd];
		sc.nextLine();

		for (int i = 0; i < nomes.length; i++) {

			// for (String nome : nomes) {
			System.out.print("Entre com o nome: ");
			nomes[i] = sc.nextLine();

		}

		for (String nome : nomes) {

			System.out.println(nome);
			System.out.println("-----------");
		}

		sc.close();

	}

}
