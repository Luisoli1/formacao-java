package sistema.notificacoes.multicanal;

public abstract class CanalNotificacao {

    private String nomeCanal;
    private boolean ativo;

    public CanalNotificacao(boolean ativo, String nomeCanal) {
        this.ativo = ativo;
        this.nomeCanal = nomeCanal;
    }

    public abstract void enviarMensagem(String destinatario, String mensagem);

    public String getNomeCanal() {
        return nomeCanal;
    }

    public void setNomeCanal(String nomeCanal) {
        this.nomeCanal = nomeCanal;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
