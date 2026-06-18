package fundamentos.vetores.exercicioscursoudemy.altura;

import java.util.Locale;
import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdPessoas;
		double alturaTotal = 0, porcentagemIdade = 0, pessoasIdadeAbaixo = 0;
		String nomeIdadeAbaixo;

		System.out.println("Quantas pessoas serão digitadas? ");
		qtdPessoas = sc.nextInt();
		String[] pessoas = new String[qtdPessoas];
		double[] idade = new double[qtdPessoas];
		double[] altura = new double[qtdPessoas];

		// loop para preencher dados
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %d pessoa: \n", i + 1);
			System.out.print("Nome:");
			sc.nextLine();
			pessoas[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextDouble();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		// loop para acumular soma das alturas
		for (int i = 0; i < pessoas.length; i++) {
			alturaTotal += altura[i];
		}
		// loop para verificar quantas pessoas tem mais de 16 anos
		for (int i = 0; i < pessoas.length; i++) {
			if (idade[i] < 16) {
				pessoasIdadeAbaixo++;
			}
		}
		// calcular altura média e porcentagem
		double media = alturaTotal / altura.length;
		double porcentagem = pessoasIdadeAbaixo / idade.length * 100;

		System.out.printf("\nAltura média: %.2f \n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
		// loop para imprimir nome das pessoas com menos de 16 anos
		for (int i = 0; i < pessoas.length; i++) {
			if (idade[i] < 16) {
				System.out.println(pessoas[i]);
			}
		}
		sc.close();
	}

}
