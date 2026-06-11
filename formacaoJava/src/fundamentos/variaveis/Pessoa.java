package fundamentos.variaveis;

public class Pessoa {

	 private String nome; // variavel de instância/ cada instância um valor diferente
	
	 private static int quantidadePessoas = 0; // variável estática - pertence a classe e possui o mesmo valor para todas instâncias
	 
	 public Pessoa (String nome) {
		 this.nome = nome;
		 quantidadePessoas ++;
	 }
	                        // variavel de parametro
	 public void apresentar(String saudacao) {
		 String mensagem = saudacao + " o meu nome é " + nome; //variavel local
		 
		 System.out.println(mensagem); //comando de saida de dados com a variavel dentro do seu escopo, fora deste metodo ela não existe
	 }
	 
	 public static int getQuantidadePessoas() {
		 return quantidadePessoas;
	 }
}
