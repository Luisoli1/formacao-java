package exercicio.heranca;

public final class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    @Override
    public double calcularSalarioFinal() {
        double salario = this.getBolsaAuxilio() + this.getSalarioBase();
        return salario;
    }

    public final void renovarContrato(){
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }
}
