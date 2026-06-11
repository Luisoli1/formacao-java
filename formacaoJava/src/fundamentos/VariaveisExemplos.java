package fundamentos;
import fundamentos.Pessoa;

public class VariaveisExemplos {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Luis"); // instância 1 da classe
		Pessoa pessoa2 = new Pessoa("Karina"); //instância 2 da classe
		
		pessoa1.apresentar("olá,");
		pessoa2.apresentar("oi,");
		
		System.out.println("Quantidade de pessoas: " +Pessoa.getQuantidadePessoas());
		

	}

}
