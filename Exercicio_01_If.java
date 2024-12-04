package exercicio01_If;

import java.util.Scanner;

public class Exercicio_01_If {

	public static void main(String[] args) {
		// Variaveis
		int A, B, C, soma;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite o número A:");
		A = leia.nextInt();

		System.out.println("Digite o número B:");
		B = leia.nextInt();

		System.out.println("Digite o número C:");
		C = leia.nextInt();

		// Processamento
		soma = A + B;

		if (A + B > C) {
			// Saida
			System.out.println(A + " + " + B + " = " + soma + " > " + C);
			System.out.println("A Soma de A + B é maior que C");
		} else if (A + B == C) {
			System.out.println(A + " + " + B + " = " + soma + " = " + C);
			System.out.println("A Soma de A + B é Igual a C");
		} else if (A + B < C) {
			System.out.println(A + " + " + B + " = " + soma + " < " + C);
			System.out.println("A Soma de A + B é Menor do que C");
		}

		leia.close();

	}

}
