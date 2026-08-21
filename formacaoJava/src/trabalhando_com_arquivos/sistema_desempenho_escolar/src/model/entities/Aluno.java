package model.entities;

import model.enums.ResultadoFInal;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private Notas notas;
    private ResultadoFInal resultado;


    public Aluno(String nome, Notas notas) {
        this.setNome(nome);
        this.setNotas(notas);
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double calcularMedia(){
           return this.notas.media();
        }
    public ResultadoFInal resultadoFinal(){
        if(calcularMedia() >= 7.0){
            return ResultadoFInal.APROVADO;
        }else{
            return ResultadoFInal.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + this.getNome() + '\'' +
                ", notas=" + this.notas +
                ", resultado=" + this.resultado +
                '}';
    }
}

