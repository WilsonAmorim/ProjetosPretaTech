package classes;

import enumeracao.Sexo;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    private Sexo sexo;

    public Pessoa(String cpf, String nome, int idade, Sexo sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String nome) {
        super();
        this.setNome(nome);
    }

    public Pessoa(String nome, int idade) throws IllegalAccessException {
        this(nome);
        this.setIdade(idade);
    }

    public Pessoa(String nome, int idade, Sexo sexo) throws IllegalAccessException {
        this(nome, idade);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IllegalAccessException {
        if(idade <= 0) {
            throw new IllegalAccessException("A carga horária deve ser positiva");
        }
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String mostrar() {
        String resposta = "CPF: " + this.getCpf() +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexo();
        return resposta;
    }



}
