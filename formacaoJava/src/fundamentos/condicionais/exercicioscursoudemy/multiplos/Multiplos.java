package fundamentos.condicionais.exercicioscursoudemy.multiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		int numero1 = 0, numero2 = 0;

		while (opcao != 2) {
			System.out.println("--- MENU ---");
			System.out.println("1- Testar se dois números sãom multiplos");
			System.out.println("2- finalizar programa");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			System.out.println("------------------------");

			switch (opcao) {
			case 1:
				System.out.print("Digite o primeiro número:");
				numero1 = sc.nextInt();
				System.out.print("Digite o segundo número: ");
				numero2 = sc.nextInt();
				System.out.println("-----------------------");
				if (numero1 % numero2 == 0 || numero2 % numero1 ==0) {
					System.out.println("São multiplos!");
				} else {
					System.out.println("Não são multiplos!");
				}
				System.out.println("-----------------------");
				break;
			case 2:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida! digite novamente");
				break;
			}

		}
		sc.close();
	}

}
