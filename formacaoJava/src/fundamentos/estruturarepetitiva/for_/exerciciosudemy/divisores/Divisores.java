package fundamentos.estruturarepetitiva.for_.exerciciosudemy.divisores;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número e receba todos divisores abaixo desse número: ");
		int n= sc.nextInt();
		
		for(int i =1; i<=n ; i++) {
			if(i % n == 0 || n% i ==0) {
				System.out.println("divisores: " + i);
			}
		}

	}

}
