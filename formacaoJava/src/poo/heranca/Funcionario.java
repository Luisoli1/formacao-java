package exercicio.heranca;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    private int idade;

    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    public void exibirHolerite() {
        System.out.println("================== HOLERITE ==================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Função: " +this.getClass().getSimpleName());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("Salário final: " + this.calcularSalarioFinal());
        System.out.println("Holerite referênte ao mês de: " + (LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM", new Locale("pt", "br")))));
    }

    public abstract double calcularSalarioFinal();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
