package sistema.notificacoes.multicanal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciadorDeNotificacoes {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public void disparar(CanalNotificacao canal, String destinatario, String mensagem){
        canal.enviarMensagem(destinatario,mensagem);
    }
    public void disparar(CanalNotificacao canal, String destinatario, String mensagem, int urgenteNivel){
        System.out.println("[ALERTA URGÊNCIA NÍVEL " + urgenteNivel + "]");
        canal.enviarMensagem(destinatario,mensagem);
    }
    public void disparar(CanalNotificacao canal, String destinatario, String mensagem, String horarioAgendado) {
        LocalDateTime ld = LocalDateTime.parse("11/08/2026 07:30", dtf);
        System.out.println("[AGENDADO PARA: " + ld + "]");
        canal.enviarMensagem(destinatario, mensagem);
    }
}
