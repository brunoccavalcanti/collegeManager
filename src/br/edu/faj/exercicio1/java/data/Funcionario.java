package br.edu.faj.exercicio1.java.data;

public class Funcionario {

    private String nomeFuncionario;
    private String setor;

    public Funcionario(String nomeFuncionario, String setor) {
        this.nomeFuncionario = nomeFuncionario;
        this.setor = setor;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void comecarTrabalhar(){
        System.out.println("O funcionario " + this.getNomeFuncionario() + " começou a trabalhar!");
    }

    public void paraTrabalhar() {
        System.out.println("O " + this.getNomeFuncionario() + " parou de trabalhar");
    }

}
