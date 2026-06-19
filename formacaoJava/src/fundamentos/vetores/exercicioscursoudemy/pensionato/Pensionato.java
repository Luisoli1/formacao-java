package fundamentos.vetores.exercicioscursoudemy.pensionato;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluguel[] rooms = new Aluguel[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("\nAluguel " + (i + 1) + "#\n");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			Aluguel aluguel = new Aluguel(nome, email);
			rooms[room] = aluguel;
		}
		System.out.println("Quartos alugados:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].getNome() + ", " + rooms[i].getEmail());
			}
		}
		sc.close();
	}

}
