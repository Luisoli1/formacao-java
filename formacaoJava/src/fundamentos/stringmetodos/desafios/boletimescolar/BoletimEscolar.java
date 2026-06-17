package fundamentos.stringmetodos.desafios.boletimescolar;

public class BoletimEscolar {

	public static void main(String[] args) {
		// Formato: Nome,Nota1,Nota2,Nota3;
		String notasTurma = "Ana,8.5,9.0,7.5;Joao,4.5,5.0,6.0;Maria,10.0,9.5,10.0;Pedro,6.5,7.0,6.0";
		String[] dados = notasTurma.split(";");

		for (int i = 0; i < dados.length; i++) {
			String[] alunos = dados[i].split(",");
			String nome = alunos[0];
			double nota1 = Double.parseDouble(alunos[1]);
			double nota2 = Double.parseDouble(alunos[2]);
			double nota3 = Double.parseDouble(alunos[3]);
			double media = (nota1 + nota2 + nota3) / 3;
			String status;
			if (media >= 7) {
				status = "Aprovado";
			} else
				status = "Reprovado";
			System.out.printf("Aluno: %s | Média: %.2f | Status: %S\n ", nome, media, status);
			//teste
		}

	}

}
