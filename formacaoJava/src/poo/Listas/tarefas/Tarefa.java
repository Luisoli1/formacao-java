package sistema.gestor.tarefas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime prazoLimite;
    private boolean concluida;


    public Tarefa(int id, String titulo, String descricao, LocalDateTime prazoLimite){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime now = LocalDateTime.now();
        now.format(dtf);
        this.setId(id);
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setDataCriacao(now);
        this.setPrazoLimite(prazoLimite);
        this.setConcluida(false);
    }

    public boolean isAtrasada(){
        if(this.isConcluida() == false && this.getPrazoLimite().isBefore(LocalDateTime.now())){
            return true;
        }
        return false;
    }

    public void alterarPrazoLimite(LocalDateTime prazoLimite){
        this.setPrazoLimite(prazoLimite);
    }

    public void alterarDataCriacao(LocalDateTime dataCriacao){
        this.setDataCriacao(dataCriacao);
    }

    public void concluirTarefa(int id){
        if(this.getId() == id) {
            this.setConcluida(true);
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    private void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getPrazoLimite() {
        return this.prazoLimite;
    }

    private void setPrazoLimite(LocalDateTime prazoLimite) {
        this.prazoLimite = prazoLimite;
    }

    public boolean isConcluida() {
        return concluida;
    }

    protected void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    public String getDataHoraFormatada() {
        return this.getPrazoLimite().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
    public String getDataCriacaoFormatada(){
        return this.getDataCriacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id: " + this.getId() +
                ", titulo: '" + this.getTitulo() + '\'' +
                ", descricao: '" + this.getDescricao() + '\'' +
                ", data de Criacão: " + this.getDataCriacaoFormatada() +
                ", Prazo Limite: " + this.getDataHoraFormatada() +
                ", Concluida: " + this.isConcluida() +
                '}';
    }

    public void exibirDetalhes(){
        System.out.println("================ Dados tarefa ================");
        System.out.println("Id: " + this.getId() + "|Tarefa: " + this.getTitulo());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Data criação:" +this.getDataCriacaoFormatada());
        System.out.println("Prazo limite: " + this.getDataHoraFormatada());
        System.out.println("Está concluida? " +this.isConcluida());
        System.out.println("Está atrasada? " + this.isAtrasada());
    }
}

