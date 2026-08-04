package exercicio.heranca;

public class Desenvolvedor extends Funcionario{

    private String nivel;
    private int horasExtras;

    @Override
    public double calcularSalarioFinal(){
        double salario = this.getSalarioBase() + (this.getHorasExtras() * 50.0);
        return salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}
