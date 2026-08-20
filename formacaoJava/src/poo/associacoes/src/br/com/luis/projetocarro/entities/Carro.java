package br.com.luis.projetocarro.entities;

public class Carro {
    private String modelo;

    // Relacionamentos
    private Motor motor;             // Composição
    private Radio radio;             // Agregação
    private Motorista motoristaAtual; // Associação Simples

    // O Construtor
    public Carro(String modelo, double potenciaMotor, Radio radio) {
        this.modelo = modelo;

        // COMPOSIÇÃO: A dependência é forte. O todo instancia a parte usando new.
        this.motor = new Motor(potenciaMotor);

        // AGREGAÇÃO: Injeção de dependência. O Rádio vem de fora, pronto.
        this.radio = radio;
    }

    // ASSOCIAÇÃO SIMPLES: Feita através de um método, conectando de forma flexível.
    public void setMotorista(Motorista motorista) {
        this.motoristaAtual = motorista;
        System.out.println("-> " + motorista.getNome() + " assumiu a direção do " + this.modelo);
    }

    public void exibirStatus() {
        System.out.println("=== Status do " + this.modelo + " ===");
        System.out.println("Motor: " + this.motor.getPotencia() + " cavalos");
        if (this.radio != null) {
            System.out.println("Rádio instalado: " + this.radio.getMarca());
        }
        if (this.motoristaAtual != null) {
            System.out.println("Motorista atual: " + this.motoristaAtual.getNome());
        } else {
            System.out.println("O carro está estacionado e sem motorista.");
        }
        System.out.println("==============================\n");
    }
}
