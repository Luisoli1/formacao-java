package fundamentos.estruturarepetitiva.for_.exerciciosudemy.impares;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número e receba todos impares até esse número: ");
		int n= sc.nextInt();
		
		for(int i =0; i<=n ; i++) {
			if(i % 2 !=0) {
				System.out.println("Impares: " + i);
			}
		}
	}

}
