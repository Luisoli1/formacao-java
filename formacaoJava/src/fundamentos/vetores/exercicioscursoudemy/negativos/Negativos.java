package fundamentos.vetores.exercicioscursoudemy.negativos;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int [] vect = new int [n];
		
		//loop para armazenar números digitados
		for(int i=0; i<vect.length; i++) {
		System.out.print("Digite um número: ");
		vect[i] = sc.nextInt();
		System.out.println("Número armazenado com sucesso");
		System.out.println("-----------------------------");
		}
		System.out.println("Números negativos: ");
		//loop para printar números negativos 
		for (int i=0; i<vect.length; i++) {
			if(vect[i] <0) {
				System.out.println(vect[i]);
			}
			//
			sc.close();
		}
	}

}
