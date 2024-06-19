package aplicativos;

import classes.Aluno;
import classes.Curso;
import classes.Funcionario;
import classes.Pessoa;
import enumeracao.Cargo;
import enumeracao.Sexo;

import java.util.ArrayList;
import java.util.List;

public class AppList04 {
    public static void main(String[] args) {
        // Lista de pessoas
        Pessoa pessoass = new Aluno("12345678972","Wilson", 62, Sexo.MASCULINO, 1234, new Curso( 1,"Java"));
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Aluno("12345678972","Wilson", 62, Sexo.MASCULINO, 1234, new Curso( 2,"Python")));
        pessoas.add(new Aluno("12345678972","Jaciara", 62, Sexo.FEMININO, 1234, new Curso( 3,"C##")));
        pessoas.add(new Aluno("12345678972","Daiana", 62, Sexo.FEMININO, 1234, new Curso( 4,"Java")));
        pessoas.add(new Aluno("12345678972","Danilo", 62, Sexo.MASCULINO, 1234, new Curso( 1,"Java")));
        pessoas.add(new Aluno("12345678972","Pedro", 62, Sexo.MASCULINO, 1234, new Curso( 5,"JavaScript")));
        pessoas.add(new Aluno("12345678972","Maria", 62, Sexo.FEMININO, 1234, new Curso( 1,"Java")));
        pessoas.add(new Aluno("12345678972","Caê", 62, Sexo.MASCULINO, 1234, new Curso( 2,"Python")));
        pessoas.add(new Funcionario("12345678972","Wilson", 62, Sexo.MASCULINO, Cargo.PROFESSOR, 5000.00));



        System.out.println("_____Usando o For aprimorado______");
        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa.mostrar());
        }


    }

}
