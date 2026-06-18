package fundamentos.vetores.exercicioscursoudemy.numerospares;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, numerosPares=0;

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		int[] numeros = new int[n];
		// loop para armazenar os dados digitados
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Números pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2==0) {
				System.out.print(numeros[i]+ " ");
				numerosPares++;
				}
			}System.out.print("\nQuantidade de números pares:" +numerosPares);

	}

}
