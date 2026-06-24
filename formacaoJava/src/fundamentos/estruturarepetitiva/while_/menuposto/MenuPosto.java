package fundamentos.estruturarepetitiva.while_.menuposto;

import java.util.Scanner;

public class MenuPosto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int gasolina = 0, alcool = 0, diesel = 0;
		int n;

		do {
			System.out.println("-------- POSTO KANOME --------");
			System.out.println("Olá, bem vindo ao posto Kanome");
			System.out.println("1. Álcool");
			System.out.println("2. Gasolina");
			System.out.println("3. Diesel");
			System.out.println("4. Fim/Sair");
			System.out.println("Digite a opção desejada");
			n = sc.nextInt();
			System.out.println("------------------------------");
			if (n < 1 || n > 4) {
				System.out.println("Opção inválida, digite novamente!");
			} else if (n == 1) {
				alcool++;
			} else if (n == 2) {
				gasolina++;
			} else if (n == 3) {
				diesel++;
			}
		} while (n != 4);

		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
