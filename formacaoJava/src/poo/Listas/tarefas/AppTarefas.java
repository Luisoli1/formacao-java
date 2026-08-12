package sistema.gestor.tarefas;

import java.time.LocalDateTime;

public class AppTarefas {
    public static void main(String[] args){
        GerenciadorDeTarefas gt = new GerenciadorDeTarefas();
        gt.adicionarTarefa(new Tarefa(21, "Aula 02", "Estudar arrays, revisar, exercicios", LocalDateTime.now().plusDays(3)));
        gt.adicionarTarefa(new Tarefa(12, "Aula 03", "Estudar listas, revisar, exercicios", LocalDateTime.now().plusDays(1)));
        gt.adicionarTarefa(new Tarefa(22, "Aula 03", "Estudar listas, revisar, exercicios", LocalDateTime.now().minusDays(2)));
        gt.concluirTarefaPorId(21);
        gt.listarTodas();
        gt.listarAtrasadas();
        gt.listarPendentes();
        gt.removerTarefaPorId(12);
        gt.listarTodas();
        gt.listarPendentes();
    }

}
