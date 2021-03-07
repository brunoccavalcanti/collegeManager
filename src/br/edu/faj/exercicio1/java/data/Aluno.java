package br.edu.faj.exercicio1.java.data;

public class Aluno {

    private String nomeAluno;
    private String ra;
    private Curso curso;
    private Nota nota;

    public Aluno(String nomeAluno, String ra, Curso curso, Nota nota) {
        this.nomeAluno = nomeAluno;
        this.ra = ra;
        this.curso = curso;
        this.nota = nota;
    }

    public Aluno() {
        this.nomeAluno = "";
        this.ra = "";
        this.curso = new Curso();
        this.nota = new Nota();
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public void participarAula() {
        System.out.println("O aluno " + this.getNomeAluno() + " Começou a assistir a aula");
    }

    public void sairAula(){
        System.out.println("O aluno " + this.getNomeAluno() + " parou de assistir a aula");
    }

}
