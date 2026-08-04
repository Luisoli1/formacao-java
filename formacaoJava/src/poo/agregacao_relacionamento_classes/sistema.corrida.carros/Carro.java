package sistema.corrida.carros;

public class Carro {
    private String modelo;
    private String equipe;
    private int potenciaHp;
    private Piloto piloto;

    public Carro(String modelo, String equipe, int potenciaHp, Piloto piloto){
        this.setModelo(modelo);
        this.setEquipe(equipe);
        this.setPotenciaHp(potenciaHp);
        this.setPiloto(piloto);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getPotenciaHp() {
        return potenciaHp;
    }

    public void setPotenciaHp(int potenciaHp) {
        this.potenciaHp = potenciaHp;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
