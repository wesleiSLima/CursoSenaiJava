package atividade;

import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		// Peça para o usuário inserir
		// o valor do seu salario bruto e faça o desconto de 5% do IRPF, e 11 % do INSS e mostre o salario liquido.
		// Se o salario liquido for menor que 1200,00 o profissional receberá 5% a mais de bônus,
		// se o salario liquido ultrapassar 3500,00 o funcionario recebera 2% a mais de bônus.

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double salarioB = 10000;
		double irpf = ((salarioB/100)*5);
		double inss = ((salarioB/100)*11);
		double salarioL = salarioB - irpf - inss;
		double bonus =0;
		
		System.out.println("Salário bruto: " + salarioB);
		System.out.println("INSS de 11%: " + inss);
		System.out.println("IRPF de 5%: " + irpf);
		
		if (salarioL < 1200) {
			System.out.println("Salário líquido sem bonificação: " + salarioL);
			bonus = ((salarioL/100)*5);
			salarioL = salarioL + bonus;
			System.out.println("Bonificação de 5% a mais no salário");
			System.out.println("Salário Líquido com bonificação " + salarioL);
		} else if (salarioL > 3500) {
			System.out.println("Salário líquido sem bonificação: " + salarioL);
			bonus = ((salarioL/100)*2);
			salarioL = salarioL + bonus;
			System.out.println("Bonificação de 2% a mais no salário");
			System.out.println("Salário Líquido com bonificação " + salarioL);
		}
		
		sc.close();
		
	}

}
