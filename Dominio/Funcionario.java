package Heranca.Dominio;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String cargo, double salario) {
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void imprimeFuncionario() {
        super.imprime();
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario);
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
