package classes;

import enumeracao.Sexo;

public class Aluno  extends Pessoa {


    private int matricula;
    private Curso curso;

    public Aluno(String cpf, String nome, int idade, Sexo sexo, int matricula, Curso curso) {
        super(cpf, nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, int matricula, Curso curso) throws IllegalAccessException {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso) throws IllegalAccessException {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override

    public String mostrar() {
        String resposta = super.mostrar() +
                "\nMatricula: " + this.getMatricula() +
                "\nCurso: " + this.getCurso();
        return resposta;

    }
}
