package classes;

import enumeracao.Sexo;

public class Curso extends Aluno {
    private int idCurso;
    private String descricao;

    public Curso(String cpf, String nome, int idade, Sexo sexo, int matricula, Curso curso, String descricao, int idCurso) {
        super(cpf, nome, idade, sexo, matricula, curso);
        this.descricao = descricao;
        this.idCurso = idCurso;
    }

    public Curso(String nome, int idade, Sexo sexo, int matricula, Curso curso, String descricao, int idCurso) throws IllegalAccessException {
        super(nome, idade, sexo, matricula, curso);
        this.descricao = descricao;
        this.idCurso = idCurso;
    }

    public Curso(String nome, int idade, int matricula, Curso curso, String descricao, int idCurso) throws IllegalAccessException {
        super(nome, idade, matricula, curso);
        this.descricao = descricao;
        this.idCurso = idCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String mostrar(){
        String resposta = "Código: " + this.getIdCurso() +
                "\nDescrição do curso: " + this.getDescricao();
        return resposta;
    }
}
