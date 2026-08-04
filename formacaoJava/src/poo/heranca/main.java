package exercicio.heranca;

public class main {

    public static void main (String[] args){

        //Funcionario f1 = new Funcionario(); classe abstrata, da erro ao instância-lá (criada apenas para ser molde para as demais)

        Gerente ge1 = new Gerente();
        ge1.setNome("Fernando augusto");
        ge1.setIdade(45);
        ge1.setCpf("105.428.692-x");
        ge1.setSalarioBase(5800.00);
        ge1.setBonificacao(500);

        Desenvolvedor dev1 = new Desenvolvedor();
        dev1.setNome("Luis Henrique de oliveira");
        dev1.setNivel("Sênior");
        dev1.setCpf("545.229.445-80");
        dev1.setIdade(28);
        dev1.setSalarioBase(9000.00);
        dev1.setHorasExtras(10);

        Estagiario estag1 = new Estagiario();
        estag1.setNome("Lucas");
        estag1.setCpf("580.298.645.70");
        estag1.setIdade(22);
        estag1.setSalarioBase(2000);
        estag1.setBolsaAuxilio(800);

        ge1.exibirHolerite();
        dev1.exibirHolerite();
        estag1.exibirHolerite();
    }
}
