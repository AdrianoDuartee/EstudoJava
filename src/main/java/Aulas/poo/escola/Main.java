package Aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", "calos@gmail.com", "0000000000", 7.5 );
        aluno.seApresentar();

        Professor professor = new Professor("Jose", "jose@gmail.com", "000000000", "TI");
        professor.seApresentar();

        Pessoa p1 = new Pessoa("Adriano", "adriano@gmail.com", "00000000");
        p1.seApresentar();
        // Aluno é uma Pessoa
        Pessoa p2 = new Aluno("Andre", "andre@gmail.com", "0000000000", 7.5 );
        // Professor é uma Pessoa
        Pessoa p3 = new Professor("João", "joao@gmail.com", "000000000", "TI");
        p2.seApresentar();
        p3.seApresentar();

        //Polimorfismo
        System.out.println("=====PESSOAS=====");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        for (Pessoa pessoa : pessoas) {
            pessoa.seApresentar();
        }
    }
}
