package fundamentos.tiposdedados;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Tipos primitivos armazenam diretamente um valor, diferente dos tipos referência.
		
		// Tipos inteiros
		byte idadeByte = 25;
        short idadeShort = 250;
        int idadeInt = 25000;
        long idadeLong = 250000L;

        // Tipos decimais
        float alturaFloat = 1.75f;
        double alturaDouble = 1.75;
        // Caractere único
        char sexo = 'M';
        // Tipo valor lógica (Verdadeiro ou Falso)
        boolean ativo = true;

        System.out.println("byte: " + idadeByte);
        System.out.println("short: " + idadeShort);
        System.out.println("int: " + idadeInt);
        System.out.println("long: " + idadeLong);

        System.out.println("float: " + alturaFloat);
        System.out.println("double: " + alturaDouble);

        System.out.println("char: " + sexo);
        System.out.println("boolean: " + ativo);

	}

}
