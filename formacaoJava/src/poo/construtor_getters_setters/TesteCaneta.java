package poo.construtor_getters_setters;

public class TesteCaneta {

	public static void main(String[] args) {

		// Construtor já cria a caneta tampada, com modelo/cor/ponta definidos
		Caneta c1 = new Caneta("Bic Cristal", "Azul", 0.5f);
		c1.status();

		// Usando SETTERS em vez de mexer direto no atributo
		c1.setModelo("Bic Cristal Grosso");
		c1.setCor("Vermelho");
		c1.status();

		// Usando GETTERS para ler valores
		System.out.println("Modelo atual: " + c1.getModelo());
		System.out.println("Ponta atual: " + c1.getPonta());

		// O atributo "cor" é privado -> a linha abaixo NÃO compila.
		// Descomente para confirmar o erro:
		// System.out.println(c1.cor);

		// Criando uma segunda caneta, já demonstrando que o construtor
		// funciona quantas vezes eu quiser, sem repetir código:
		Caneta c2 = new Caneta("Pilot", "Preta", 1.0f);
		c2.status();
	}
}