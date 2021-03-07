package br.edu.faj.exercicio1.java.data;

public class Professor extends Funcionario{

    private Disciplina disciplina;

    public Professor(String nomeFuncionario, String setor, Disciplina disciplina) {
        super(nomeFuncionario, setor);
        this.disciplina = disciplina;
    }

    public Professor() {
        super("", "");
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void darAula(){
        System.out.println("O professor " + this.getNomeFuncionario() + " começou a dar aulas de " + this.getDisciplina().getNomeDisciplina());
    }

    public void pararAula(){
        System.out.println("O professor " + this.getNomeFuncionario() + " parou a aula de " + this.getDisciplina().getNomeDisciplina());
    }
}
