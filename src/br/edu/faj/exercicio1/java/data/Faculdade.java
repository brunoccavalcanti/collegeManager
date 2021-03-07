package br.edu.faj.exercicio1.java.data;

public class Faculdade {

    private String nome;
    private String endereco;
    private Aluno aluno;
    private Funcionario funcionario;
    private Professor professor;


    public Faculdade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Faculdade() {
        this.nome = "";
        this.endereco = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void matricularAluno(Aluno aluno) {
        System.out.println("O aluno " + aluno.getNomeAluno() + " foi matriculado com sucesso!");
    }

    public void contratarFuncionario(Funcionario funcionario) {
        System.out.println("O funcionario " + funcionario.getNomeFuncionario() + " foi contrato no setor " + funcionario.getSetor());
    }

    public void contratarProfessor(Professor professor) {
        System.out.println("O professor " + professor.getNomeFuncionario() + " foi contratado para lecionar a matéria " + professor.getDisciplina().getNomeDisciplina());
    }

    public void expulsarAluno(Aluno aluno) {
        System.out.println("O aluno " + aluno.getNomeAluno() + " foi expulso :(");
    }

    public void demitirFuncionario(Funcionario funcionario){
        System.out.println("O funcionario " + funcionario.getNomeFuncionario() + " foi demitido :(");
    }

    public void demitirProfessor(Professor professor) {
        System.out.println("O professor " + professor.getNomeFuncionario() + " foi demitido :(");
    }


}
