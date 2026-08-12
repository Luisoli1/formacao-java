package sistema.notificacoes.multicanal;

public class NotificacaoSMS  extends CanalNotificacao{
    private String operadora;

    public NotificacaoSMS(boolean ativo, String nomeCanal, String operadora) {
        super(ativo, nomeCanal);
        this.setOperadora(operadora);
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("SMS: " + this.getOperadora() + " Enviando torpedo para " + destinatario+ ": " + mensagem + "\n");
    }
}
