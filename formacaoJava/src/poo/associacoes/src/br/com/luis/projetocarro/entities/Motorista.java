package br.com.luis.projetocarro.entities;

// HERANÇA: Motorista "é uma" Pessoa
public class Motorista extends Pessoa {
    private String cnh;

    public Motorista(String nome, String cnh) {
        super(nome); // Chama o construtor da classe mãe (Pessoa)
        this.cnh = cnh;
    }
}