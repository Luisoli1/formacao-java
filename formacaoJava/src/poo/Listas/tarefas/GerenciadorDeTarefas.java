package sistema.gestor.tarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {

    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa t){
        this.tarefas.add(t);
    }

    public void listarAtrasadas(){
        System.out.println("========= Tarefas atrasadas =========");
        for(Tarefa x: tarefas){
            if(x.isAtrasada() == true){
                System.out.println(x.toString());
            }
        }
    }
    public void listarPendentes(){
        System.out.println("========= Tarefas pendentes =========");
        for(Tarefa x: tarefas){
            if(x.isConcluida() == false){
                System.out.println(x.toString());
            }
        }
    }

    public void listarTodas(){
        System.out.println("========= Tarefas Status =========");
        for(Tarefa x: tarefas){
            x.exibirDetalhes();
        }
    }

    public void concluirTarefaPorId(int id) {
        for (Tarefa x : tarefas) {
            if (x.getId() == id) {
                x.setConcluida(true);
            }
        }}

        public void removerTarefaPorId (int id){
            for (Tarefa x : tarefas) {
                if (x.getId() == id) {
                    tarefas.remove(x);
                }
            }
        }

        public List<Tarefa> getTarefas () {
            return tarefas;
        }

        private void setTarefas (List < Tarefa > tarefas) {
            this.tarefas = tarefas;
        }

    }