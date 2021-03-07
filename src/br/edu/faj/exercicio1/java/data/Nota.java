package br.edu.faj.exercicio1.java.data;

public class Nota {

    private float nota1;
    private float nota2;
    private float totalSemestre;
    private float media;

    public Nota(int nota, int totalSemestre) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.totalSemestre = totalSemestre;
        this.media = media;
    }

    public Nota() {
        this.nota1 = 0f;
        this.nota2 = 0f;
        this.totalSemestre = 0f;
        this.media = 0f;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getTotalSemestre() {
        return nota1+nota2;
    }

    public void setTotalSemestre(int totalSemestre) {
        this.totalSemestre = totalSemestre;
    }

    public float getMedia() {
        return this.getTotalSemestre()/2;
    }

    public void aprovacao() {
        if (getMedia() >= 6){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado :(");
        }
    }

}
