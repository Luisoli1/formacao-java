package poo.modificadores_acesso_02;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();

		// Estas linhas DEVEM compilar (visibilidade pública):
		f1.nome = "Carlos";
		f1.cargo = "Analista";
		f1.exibirDados();
		f1.ativar();
		f1.desativar();

		// Esta linha DEVE compilar, pois estamos no mesmo pacote (protegido no Java
		// também libera acesso para classes do mesmo pacote):
		f1.matricula = 1234;

		// Esta linha NÃO DEVE compilar (é privada) - descomente para confirmar o erro:
		//f1.salario = 3000;

		// Esta linha também NÃO DEVE compilar (método privado) - descomente para
		// testar:
		// f1.calcularBonus();

		f1.exibirDados();

	}

}
