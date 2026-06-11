package fundamentos.typecasting;

public class TypecastingPrimitivos {

	public static void main(String[] args) {
		
		int a, b, c; 
		double resultado, d, valorDecimal;
		// Narrowing (cast explícito)
		// O valor decimal é truncado durante a conversão.
	    valorDecimal = 10.99;
	    System.out.println("Valor decimal: " + valorDecimal);

	    int valorInteiro = (int)valorDecimal;
	    System.out.println("Valor inteiro: " + valorInteiro);
	    
	    // Widening (conversão automática)
	    // Não ocorre perda de dados ao converter int para double.
		c = 2;
		d = 1.5;
		d = c;
		System.out.println(d);
		
		//Divisão entre inteiros
		a = 5;
		b = 2;
		// O resultado é truncado porque ambos os operandos são int.
		resultado = a / b; 
		System.out.println(resultado);
		// Casting para double antes da divisão.
		// O resultado passa a considerar as casas decimais.
		resultado = (double) a / b;
		System.out.println(resultado);
		
	}

}
