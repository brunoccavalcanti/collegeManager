package br.edu.faj.exercicio1.java.data;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private List<Professor> professorList;

    public Curso(String nomeCurso, List<Professor> professorList) {
        this.nomeCurso = nomeCurso;
        this.professorList = professorList;
    }

    public Curso() {
        this.nomeCurso = "";
        this.professorList = new ArrayList<Professor>();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }
}
