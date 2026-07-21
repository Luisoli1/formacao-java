package poo.modificadores_acesso_02;

public class TesteCaneta {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        // PÚBLICO -> pode ser acessado de qualquer classe
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";

        // PROTEGIDO -> no Java, dentro do MESMO PACOTE também é permitido
        c1.carga = 80;

        // PRIVADO -> NÃO pode ser acessado fora da própria classe
        // Descomente a linha abaixo para ver o erro de compilação:
        // c1.ponta = 0.5;

        c1.status();

        // PRIVADO (método) -> rabiscar() é público, então funciona
        c1.destampar();
        c1.rabiscar();

        c1.tampar();
        c1.rabiscar(); // agora deve mostrar o erro de "está tampada"

        c1.status();
    }
}