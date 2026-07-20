package poo.classes_e_objetos_01;

public class TesteCarro {

	public static void main(String[] args) {

		Carro gol = new Carro();
		gol.marca = "Volkswagen";
		gol.modelo = "Gol";
		gol.ano = 2015;

		// TESTE 1: Tentar acelerar com ele desligado (Não vai aceitar os 120 km/h)
		gol.acelerar(120);
		gol.exibirStatus(); // Vai mostrar: Desligado | 0.0 km/h

		// TESTE 2: Ligar e acelerar
		gol.ligar();
		gol.acelerar(120);
		gol.exibirStatus(); // Vai mostrar: Ligado | 120.0 km/h

		// TESTE 3: Desligar em alta velocidade
		gol.desligar(); // O método desliga E zera a velocidade para 0
		gol.exibirStatus(); // Vai mostrar: Desligado | 0.0 km/h
		
		Carro civic = new Carro();
		civic.marca = "Honda";
		civic.modelo = "Civic";
		civic.ano = 2018;
		
		civic.acelerar(140);
		civic.exibirStatus();
		
		civic.ligar();
		civic.acelerar(150);
		civic.exibirStatus();
		civic.frear(20);
		civic.frear(20);
		civic.frear(50);
		civic.frear(50);
		civic.frear(10);
		civic.desligar();
		
	}
}