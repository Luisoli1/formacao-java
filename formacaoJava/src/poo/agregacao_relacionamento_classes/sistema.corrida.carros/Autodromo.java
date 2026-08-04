package sistema.corrida.carros;

public class Autodromo {

    public static void main(String[] args) {

        Piloto[] piloto = new Piloto[5];
        piloto[0] = new Piloto("Lewis hamilton" , "Britânica", 9);
        piloto[1] = new Piloto("Max Verstappen", "Holandesa", 10);
        piloto[2] = new Piloto("Charles Leclerc", "Monegasca", 8);
        piloto[3] = new Piloto("Lando Norris", "Britânica", 7);
        piloto[4] = new Piloto("Fernando leal", "Brasil", 5);
        piloto[0].ativarCadastro();
        piloto[1].ativarCadastro();
        piloto[2].ativarCadastro();
        piloto[3].ativarCadastro();

        Carro[] carro = new Carro[5];
        carro[0] = new Carro("W15", "Mercedes", 1020, piloto[0]);
        carro[1] = new Carro("RB20", "Red Bull", 1030, piloto[1]);
        carro[2] = new Carro("SF-24", "Ferrari", 1025, piloto[2]);
        carro[3] = new Carro("MCL38", "McLaren", 1015, piloto[3]);
        carro[4] = new Carro("RB12", "Mercedes", 1028, piloto[4]);

        Corrida corrida1 = new Corrida();
        corrida1.marcarCorrida(carro [1], carro [4], "Autódromo interlagos");
        boolean aprovada = corrida1.isAprovada();

    }
}
