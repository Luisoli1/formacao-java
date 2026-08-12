package sistema.notificacoes.multicanal;

public class Sistema {
    public static void main(String[] args){
        NotificacaoEmail ne = new NotificacaoEmail(true, "E-mail", "Outlook");
        NotificacaoSMS ns = new NotificacaoSMS(true, "SMS", "Vivo");
        NotificacaoWhatsApp nw = new NotificacaoWhatsApp(true, "Wpp", "11-963082469");
        GerenciadorDeNotificacoes gn = new GerenciadorDeNotificacoes();
        gn.disparar(nw, "Karina", "Bom dia amor!", "13/08/2026 07:30");
        gn.disparar(ns, "Mãe", "Mãe, tira o feijão do congelador por favor.");
        gn.disparar(ne, "Animâ educação", "Prezados, bom dia." +
                "\n \nminha bolsa não foi aplicada na mensalidade, poderiam verificar?" +
                "\nAtte.", 5);

    }


}
