package sistema.corrida.carros;

import java.util.Random;

public class Corrida {
    private Carro carro1;
    private Carro carro2;
    private String pista;
    private boolean aprovada;

    public void marcarCorrida(Carro carro1, Carro carro2, String pista){
            if(!carro1.getEquipe().equalsIgnoreCase(carro2.getEquipe())){
                if(Math.abs(carro1.getPiloto().getExperiencia() - carro2.getPiloto().getExperiencia()) <= 3){
                    if(carro1.getPiloto().isCadastroAtivo()  == true && carro2.getPiloto().isCadastroAtivo()== true){
                        this.setCarro1(carro1);
                        this.setCarro2(carro2);
                        this.setPista(pista);
                        this.setAprovada(true);
                        System.out.println("Corrida marcada!");
                    }else{
                        System.out.println("Cadastro de ambos pilotos deve estar ativo!");
                    }
                }else{
                    System.out.println("Corrida não aprovada, diferença de experiência dos pilotos é maior que 3!");
                }
            }else{
                System.out.println("Corrida não aprovada, os carros devem ser de equipes difeentes!");
            }
    }
    public void iniciarCorrida(){
        if(this.isAprovada() == true){
            Random aleatorio = new Random();
            double pontuação1 = carro1.getPotenciaHp() + (carro1.getPiloto().getExperiencia() * 15) + aleatorio.nextInt(30);
            double pontuação2 = carro2.getPotenciaHp() + (carro2.getPiloto().getExperiencia() * 15) + aleatorio.nextInt(30);
            if(pontuação1 > pontuação2){
                System.out.println("================ RESULTADO DA CORRIDA ==================");
                System.out.println("O vencedor da corrida é: " + this.getCarro1().getPiloto().getNome());
                carro1.getPiloto().ganharCorrida();
                carro2.getPiloto().perderCorrida();
            }if (pontuação2 > pontuação1){
                System.out.println("================ RESULTADO DA CORRIDA ==================");
                System.out.println("O vencedor da corrida é: " + this.getCarro2().getPiloto().getNome());
                carro1.getPiloto().perderCorrida();
                carro2.getPiloto().ganharCorrida();
            }else{
                System.out.println("================ RESULTADO DA CORRIDA ==================");
                System.out.println("hoje tivemos um empate entre " + this.getCarro1().getPiloto().getNome() + " e " + this.getCarro2().getPiloto().getNome());
            }
        }
    }


    public Carro getCarro2() {
        return carro2;
    }

    public void setCarro2(Carro carro2) {
        this.carro2 = carro2;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Carro getCarro1() {
        return carro1;
    }

    public void setCarro1(Carro carro1) {
        this.carro1 = carro1;
    }
}
