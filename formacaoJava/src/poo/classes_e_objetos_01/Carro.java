package poo.classes_e_objetos_01;

public class Carro {

	// ATRIBUTOS (Características do objeto)
	String marca;
	String modelo;
	int ano;
	double velocidadeAtual;
	boolean ligado;

	// MÉTODOS (Comportamentos e ações que o objeto pode realizar)

	// Método para ligar o carro
	void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("O " + modelo + " foi ligado.");
		} else {
			System.out.println("O " + modelo + " já está ligado.");
		}
	}

	// 2. Desligar (Garante que zera a velocidade)
	void desligar() {
		if (ligado) {
			ligado = false;
			velocidadeAtual = 0; // REGRA: Ao desligar, zera a velocidade obrigatoriamente
			System.out.println("O " + modelo + " foi desligado e parou.");
		} else {
			velocidadeAtual = 0;
			System.out.println("O " + modelo + " já está desligado.");
		}
	}

	// 3. Acelerar (Só aceita aumentar velocidade se estiver LIGADO)
	void acelerar(double incremento) {
		if (ligado) {
			velocidadeAtual += incremento;
			System.out.println("Acelerando! Velocidade atual: " + velocidadeAtual + " km/h");
		} else {
			velocidadeAtual = 0; // REGRA: Desligado não aceita velocidade
			System.out.println("Impossível acelerar! O carro está desligado.");
		}
	}

	// 4. Frear
	void frear(double decremento) {
		if (velocidadeAtual - decremento >= 0) {
			velocidadeAtual -= decremento;
			System.out.println("Freando! Velocidade atual: " + velocidadeAtual + " km/h");
		} else {
			velocidadeAtual = 0;
			System.out.println("O carro parou completamente.");
		}
	}

	// 5. Exibir Status (Trava final de segurança para o relatório)
	void exibirStatus() {
		// Se por algum motivo o carro estiver desligado, força a velocidade a ser 0
		if (!ligado) {
			velocidadeAtual = 0;
		}

		System.out.println("\n--- STATUS DO VEÍCULO ---");
		System.out.println("Marca/Modelo: " + marca + " " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
		System.out.println("Velocidade: " + velocidadeAtual + " km/h");
		System.out.println("-------------------------\n");
	}
}