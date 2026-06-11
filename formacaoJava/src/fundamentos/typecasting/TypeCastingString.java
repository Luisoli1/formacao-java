package fundamentos.typecasting;

public class TypeCastingString {

	public static void main(String[] args) {
		
		//declara uma variavel do tipo int
		int inteiro = 15;
		System.out.println("o valor inteiro é: " + inteiro);

		// Conversão de int para String
		// Utiliza o método valueOf da classe String
		String inteiroTexto = String.valueOf(inteiro);
		System.out.println("o valor da string x é :" + inteiroTexto);
		
		// Conversão de String para int
		// Utiliza o método parseInt da classe Integer
		int novoInteiro = Integer.parseInt(inteiroTexto);
		System.out.println("O valor inteiro agora é: " + novoInteiro);
		
		// Execute em modo Debug para observar a mudança
		// dos tipos das variáveis durante a execução.
	}

}
