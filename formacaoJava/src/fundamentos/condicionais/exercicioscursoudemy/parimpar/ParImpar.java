package fundamentos.condicionais.exercicioscursoudemy.parimpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao=0;
		while (opcao != 2) {
			
			System.out.println(" --- MENU ---");
			System.out.println("1 - testar se um número é par ");
			System.out.println("2 - finalizar programa ");
			System.out.print("Escolha uma opção: ");
			System.out.print("\n--------------------------------");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite um número: ");
				int n = sc.nextInt();

				if (n % 2 == 0) {
					System.out.println("O número é par!");
				} else {
					System.out.println("O número é impar");
				}
				break;
			case 2:
				System.out.println("Programa finalizado. Até logo!");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}
		sc.close();
	}

}
