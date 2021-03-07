package br.edu.faj.exercicio1.java.data;

public class Disciplina {
    private String nomeDisciplina;


    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Disciplina() {
        this.nomeDisciplina = "";
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
}
