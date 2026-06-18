package fundamentos.vetores.exercicioscursoudemy.somavetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		int n;
		double soma = 0;
		double media = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];

		// loop para armazenar dados no vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		// loop para realizar soma de dados
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		System.out.print("Valores vetor: ");
		// loop para imprimir dados do vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		media = soma / vect.length;
		System.out.printf("\nSoma: %.2f\n", soma);
		System.out.printf("Média: %.2f", media);

		sc.close();
	}

}
