package sistema.notificacoes.multicanal;

public class NotificacaoWhatsApp extends CanalNotificacao{
    private String numeroRemetente;

    public NotificacaoWhatsApp(boolean ativo, String nomeCanal, String numeroRemetente) {
        super(ativo, nomeCanal);
        this.setNumeroRemetente(numeroRemetente);
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("[WHATSAPP " + this.getNumeroRemetente() + "] Enviando zap para " + destinatario + ": " + mensagem + "\n");
    }

    public String getNumeroRemetente() {
        return numeroRemetente;
    }

    public void setNumeroRemetente(String numeroRemetente) {
        this.numeroRemetente = numeroRemetente;
    }
}
