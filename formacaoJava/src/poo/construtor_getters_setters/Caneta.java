package poo.construtor_getters_setters;

public class Caneta {

    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    // MÉTODO CONSTRUTOR - roda automaticamente quando o objeto é criado
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        tampar();
    }

    // GETTERS E SETTERS
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println(
            "Modelo: " + this.modelo +
            " | Cor: " + this.cor +
            " | Ponta: " + this.ponta +
            " | Tampada: " + this.tampada
        );
    }
}