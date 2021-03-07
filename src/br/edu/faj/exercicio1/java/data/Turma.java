package br.edu.faj.exercicio1.java.data;

import java.util.List;

public class Turma {

    private String nomeTurma;
    private List<Aluno> alunoList;

    public Turma(String nomeTurma, List<Aluno> alunoList) {
        this.nomeTurma = nomeTurma;
        this.alunoList = alunoList;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }
}
