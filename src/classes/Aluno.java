package classes;

import enumeracao.Curso;
import enumeracao.Sexo;

public class Aluno  extends Pessoa {


    private int matricula;
    private Curso curso;

    public Aluno(String cpf, String nome, int idade, Sexo sexo) {
        super(cpf, nome, idade, sexo);

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
                "Matricula: " + this.getMatricula() +
                "Curso: " + this.getCurso();
        return resposta;

    }
}
