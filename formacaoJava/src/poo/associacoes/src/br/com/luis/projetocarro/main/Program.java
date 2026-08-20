package br.com.luis.projetocarro.main;


import br.com.luis.projetocarro.entities.Carro;
import br.com.luis.projetocarro.entities.Motorista;
import br.com.luis.projetocarro.entities.Radio;

public class Program {
    public static void main(String[] args) {

        // 1. Criando um Rádio e um Motorista de forma independente
        Radio pioneer = new Radio("Pioneer");
        Motorista joao = new Motorista("João Silva", "123456789");

        // 2. Criando o Carro
        // passamos o rádio pronto (Agregação), mas passamos apenas
        // a potência "2.0" para o carro criar o próprio motor (Composição).
        Carro meuCarro = new Carro("Fiat Palio", 2.0, pioneer);

        // O carro nasce sem motorista. Vamos ver o status:
        meuCarro.exibirStatus();

        // 3. Associação Simples na prática
        meuCarro.setMotorista(joao);

        // Vendo o status após a associação:
        meuCarro.exibirStatus();
    }
}
