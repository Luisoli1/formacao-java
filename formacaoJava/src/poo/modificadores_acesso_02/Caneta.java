package poo.modificadores_acesso_02;

public class Caneta {

    // ATRIBUTOS com visibilidade definida conforme o diagrama de classes da aula
    public String modelo;
    public String cor;
    private double ponta;
    protected double carga;
    private boolean tampada;

    // MÉTODOS
    public void status() {
        System.out.println(
            "Modelo: " + modelo +
            " | Cor: " + cor +
            " | Ponta: " + ponta +
            " | Carga: " + carga +
            " | Tampada: " + tampada
        );
    }

    public void rabiscar() {
        if (!tampada) {
            System.out.println("Rabiscando...");
        } else {
            System.out.println("Erro! Não posso rabiscar porque a caneta está tampada.");
        }
    }

    public void tampar() {
        tampada = true;
    }

    public void destampar() {
        tampada = false;
    }
}