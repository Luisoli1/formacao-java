package fundamentos.tiposdedados;
import fundamentos.variaveis.Pessoa;

public class TiposReferenciaExemplo {

	public static void main(String[] args) {
		
		/*Pessoa1 é uma variavel de referência.
		  ela não armazena o objeto Pessoa diretamente
		  mas uma referência para a instância criada com new Pessoa("Luis")
		*/
		  
		Pessoa pessoa1 = new Pessoa("Luis"); 
		Pessoa pessoa2 = new Pessoa("Maria");
		
		/* Agora pessoa2 passa a referenciar o mesmo objeto de pessoa1.
           A referência anterior para Pessoa("Maria") é perdida.
		*/
		
		pessoa2 = pessoa1;
		
		/* aqui usamos o == que compara o endereço de memória de duas variaveis e não os valores
		   Neste caso, verifica se pessoa1 e pessoa2 apontam para a mesma instância de Pessoa na memória.
		   */
		
		System.out.println(pessoa1 == pessoa2);
		/* o resultado é true, que mostra que pessoa1 aponta para o mesmo objeto/instância na memória que pessoa2*/
		
	}

}
