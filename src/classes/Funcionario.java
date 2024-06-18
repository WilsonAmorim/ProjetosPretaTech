package classes;

import enumeracao.Cargo;
import enumeracao.Sexo;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    private double salario;


    public Funcionario(String cpf, String nome, int idade, Sexo sexo) {
        super(cpf, nome, idade, sexo);
        cpf = cpf;
        nome = nome;
        idade = idade;
        sexo =sexo;

    }

    public Funcionario(String cpf, String nome, int idade, Sexo sexo, Cargo cargo, double salario) {
        super(cpf, nome, idade, sexo);
        cpf = cpf;
        nome = nome;
        idade = idade;
        sexo =sexo;
        this.cargo = cargo;
        this.salario = salario;

    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String mostrar() {
        String resposta = super.mostrar() +
                "Cargo: " + this.getCargo() +
                "Salário: " + this.getSalario();
        return resposta;

    }

}

