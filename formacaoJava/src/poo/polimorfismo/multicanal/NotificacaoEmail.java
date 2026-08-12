package sistema.notificacoes.multicanal;

public class NotificacaoEmail extends CanalNotificacao {

    private String provedor;

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("E-mail via " + this.getProvedor() + " Enviando para " + destinatario + ": \n" + mensagem);
        System.out.println("=====================================================");
    }

    public NotificacaoEmail(boolean ativo, String nomeCanal, String provedor) {
        super(ativo, nomeCanal);
        this.setProvedor(provedor);
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
}
