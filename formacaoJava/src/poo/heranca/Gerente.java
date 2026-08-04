package exercicio.heranca;

public class Gerente extends Funcionario{
    private double bonificacao;

    @Override
    public double calcularSalarioFinal(){
        double salario = this.getSalarioBase() + this.getBonificacao();
        return salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
