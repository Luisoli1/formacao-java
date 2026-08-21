package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Turma {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();


    public Turma(String nome, List<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String mediaTurma(){
        Double total =0.0;
        for(Aluno a: this.alunos){
            total += a.calcularMedia();
            }
        return "\n" +"=====Média total da turma ===== " +"\n"
                + "Média: " + String.format(Locale.US, "%.2f", total/alunos.size());
        }
    public String maiorNotaTurma(){
        Double resultado = 0.0;
        Double mediaAtual = 0.0;
        String nome ="";
        for (Aluno a: this.alunos){
            mediaAtual = a.calcularMedia();
            if(mediaAtual > resultado){
                resultado = a.calcularMedia();
                nome = a.getNome();
            }
        }
        return "\n"
                +"=== Aluno com maior média =====" + "\n"
        + nome + "| média:" + mediaAtual;
    }

    }


