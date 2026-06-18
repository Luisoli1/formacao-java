package fundamentos.vetores.exercicioscursoudemy.maiorposicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, posicao=0;
		double maiorNumero=0;
		System.out.print("Quantos números vai digitar? ");
		n = sc.nextInt();
		double [] numeros = new double [n];
		
		//loop para adicionar dados ao vetor
		for(int i=0; i< numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
			}
		//loop para encontrar maior número do vetor e posição
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posicao = i;
			}
		}
		System.out.printf("Maior valor: %.1f \n", maiorNumero);
		System.out.print("Posição do maior valor: "+ posicao);
	}

}
