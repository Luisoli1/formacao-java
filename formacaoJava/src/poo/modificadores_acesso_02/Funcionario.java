package poo.modificadores_acesso_02;

public class Funcionario {

	public String nome;
	public String cargo;
	private double salario;
	protected int matricula;
	protected boolean ativo;

	public void exibirDados() {
		System.out
				.println("Nome: " + nome + " | Cargo: " + cargo + " | Matrícula: " + matricula + " | Ativo: " + ativo);
	}

	private double calcularBonus() {
		return salario * 0.1;
	}

	public void ativar() {
		ativo = true;
		System.out.println(nome + " foi ativado.");
	}

	public void desativar() {
		ativo = false;
		System.out.println(nome + " foi desativado.");
	}
}
