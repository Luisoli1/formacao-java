package fundamentos.condicionais.exercicioscursoudemy.expressaoternaria;

import java.util.Scanner;

public class ExpressaoTernaria {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			
			int n = 0;
			System.out.print("Digite um valor: ");
			n = sc.nextInt();
			
			String condicao =(n % 2 == 0) ? "PAR" : "IMPAR";

			System.out.println(condicao);
			
			sc.close();
	}

}
