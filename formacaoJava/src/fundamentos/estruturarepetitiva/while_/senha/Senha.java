package fundamentos.estruturarepetitiva.while_.senha;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senhaCadastrada, senhaDigitada;

		System.out.print("Cadastre sua senha: ");
		senhaCadastrada = sc.nextInt();

		System.out.print("Digite sua senha para acessar: ");
		senhaDigitada = sc.nextInt();

		while (senhaDigitada != senhaCadastrada) {
			System.out.println("Senha inválida!");
			System.out.print("Digite sua senha para acessar: ");
			senhaDigitada = sc.nextInt();
		}
		System.out.println("Acesso Permitido!");

		sc.close();
	}

}
