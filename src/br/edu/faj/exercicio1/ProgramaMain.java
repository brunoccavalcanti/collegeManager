package br.edu.faj.exercicio1;

import br.edu.faj.exercicio1.java.data.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaMain {
    public static void main(String[] args) {

       ProgramaMain gerenciadorFacul = new ProgramaMain();
       gerenciadorFacul.FaculSimulator();

    }

    public void FaculSimulator() {
        String nomeFacul;
        String enderecoFaul;

        Faculdade faculdade = new Faculdade();
        Nota nota = new Nota();


        Disciplina disciplina = new Disciplina();
        List<Disciplina> disciplinaList = new ArrayList<Disciplina>();

        Professor professor = new Professor();
        List<Professor> professorList = new ArrayList<Professor>();

        Curso curso = new Curso();
        List<Curso> cursoList = new ArrayList<Curso>();

        Aluno aluno = new Aluno();
        List<Aluno> alunoList = new ArrayList<Aluno>();

        Scanner sc = new Scanner(System.in);


        System.out.println("\n Gerenciador de Faculdade \n");



        int opcao;

        do{
            System.out.println("1 - Cadastrar Faculdade" +
                    "\n2 - Listar Faculdade" +
                    "\n3 - Professores" +
                    "\n4 - Cursos" +
                    "\n5 - Cadastrar" +
                    "\n6 - Gerenciar" +
                    "\n7 - Faculdade Simulator" +
                    "\n0 - Sair\n");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    iniciarFaculdade(faculdade, sc);
                    break;

                case 2:
                    mostrarFaculdade(faculdade, cursoList);
                    break;

                case 3:
                    mostrarProfessor(professorList);
                    break;

                case 4:
                    mostrarMaisCuros(cursoList, sc);
                    System.out.println("\n\n");
                    break;
                case 5:
                    System.out.println("Cadastrar: ");
                    System.out.println("1 - Cadastrar Aluno"+
                                        "\n2 - Cadastrar Professor" +
                                        "\n3 - Cadastrar Matéria" +
                                        "\n4 - Cadastrar Curso");

                    int option2 = sc.nextInt();
                    sc.nextLine();

                    switch (option2){
                        case 1:
                            cadastrarAluno(alunoList, sc);
                            break;
                        case 2:
                            cadastrarProfessor(disciplinaList, professorList, sc);
                            break;
                        case 3:
                            cadastrarDisciplina(disciplina, disciplinaList, sc);
                            break;
                        case 4:
                            cadastrarCurso(professorList, curso, cursoList, sc);
                            break;

                    }
                    break;

                case 6:
                    System.out.println("Gerenciar");
                    System.out.println("1 - Inserir notas do aluno");

                    int option3 = sc.nextInt();
                    sc.nextLine();

                    switch (option3){
                        case 1:
                            System.out.println("Insira a nota 1 do Aluno: ");
                            float alunoNota1 = sc.nextFloat();
                            sc.nextLine();

                            System.out.println("Insira a nota 2 do Aluno: ");
                            float alunoNota2 = sc.nextFloat();
                            sc.nextLine();

                            aluno.getNota().setNota1(alunoNota1);
                            aluno.getNota().setNota2(alunoNota2);
                    }
                    break;

                case 7:
                    for (int i = 0; i < 20; ++i) System.out.println();

                    System.out.println("Simulador de Faculdade");
                    professor = professorList.get(0);
                    aluno = alunoList.get(0);

                    faculdade.matricularAluno(aluno);
                    faculdade.contratarProfessor(professor);

                    System.out.println("19:00: ");

                    professor.darAula();
                    aluno.participarAula();

                    System.out.println("22:30: ");
                    aluno.sairAula();
                    professor.pararAula();

                    System.out.println("A média do " + aluno.getNomeAluno() + " é : " + aluno.getNota().getMedia());
                    aluno.getNota().aprovacao();
                    break;

                case 0:
                    break;
            }
        }while(opcao != 0);


    }

    private void cadastrarDisciplina(Disciplina disciplina, List<Disciplina> disciplinaList, Scanner sc) {
        System.out.println("Quantos matérias você deseja inserir? ");
        int qtdMaterias = sc.nextInt();

        for(int i = 0; i < qtdMaterias; i++){

            Disciplina disciplinaAux = new Disciplina();

            System.out.println("Insira o nome da Matéria: ");
            String nomeMat = sc.next();
            sc.nextLine();

            disciplinaAux.setNomeDisciplina(nomeMat);

            disciplinaList.add(disciplinaAux);

        }
    }

    private void cadastrarCurso(List<Professor> professorList, Curso curso, List<Curso> cursoList, Scanner sc) {
        System.out.println("Quantos cursos você deseja inserir? ");
        int qtdCurso = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdCurso; i++){

            Curso cursoAux = new Curso();

            System.out.println("Insira o nome do curso: ");
            String nomeCurso = sc.next();
            sc.nextLine();
            cursoAux.setNomeCurso(nomeCurso);

            System.out.println("Quantos professores você deseja inserir?");
            int qtdProfessoresHere = sc.nextInt();
            sc.nextLine();

            for(int j = 0; j < qtdProfessoresHere; j++){
                System.out.println("Insira o nome do professor: ");
                String nomeProf = sc.next();
                sc.nextLine();

                for (Professor item : professorList){
                    if (item.getNomeFuncionario().equals(nomeProf)){
                        cursoAux.getProfessorList().add(item);
                    }
                }
            }
            cursoList.add(cursoAux);
            System.out.println("Curso cadastrado com sucesso!");

        }
    }

    private void cadastrarAluno(List<Aluno> alunoList, Scanner sc) {

        Aluno aluno = new Aluno();

        System.out.println("Cadastrar Aluno: ");
        System.out.println("Insira o nome: ");
        String nomeAluno = sc.next();
        sc.nextLine();

        System.out.println("Insira o RA: ");
        String alunoRa = sc.next();
        sc.nextLine();


        aluno.setNomeAluno(nomeAluno);
        aluno.setRa(alunoRa);

        alunoList.add(aluno);
    }

    private void cadastrarProfessor(List<Disciplina> disciplinaList, List<Professor> professorList, Scanner sc) {
        System.out.println("Quantos Professores você deseja inserir? ");
        int qtdProfessores = sc.nextInt();

        for(int i = 0; i < qtdProfessores; i++){

            Professor professorAux = new Professor();

            System.out.println("Insira o nome do professor: ");
            String nomeProf = sc.next();
            professorAux.setNomeFuncionario(nomeProf);
            sc.nextLine();


            System.out.println("Insira o setor em que ele trabalha: ");
            String setorProf = sc.next();
            professorAux.setSetor(setorProf);
            sc.nextLine();

            System.out.println("Insira a matéria que ele leciona: ");

            String nomeMat = sc.next();
            sc.nextLine();

            for (Disciplina item : disciplinaList){
                if (item.getNomeDisciplina().equals(nomeMat)){
                    professorAux.setDisciplina(item);
                }
            }


            professorList.add(professorAux);

            for (Professor item1 : professorList) {
                System.out.println("Professor: " + item1.getNomeFuncionario());
                System.out.println("Trabalha em: " + item1.getSetor());
                System.out.println("Leciona: " + item1.getDisciplina().getNomeDisciplina());
            }


            System.out.println("Professor cadastrado com sucesso!");
        }
    }

    private void mostrarProfessor(List<Professor> professorList) {
        for (int i = 0; i < 20; ++i) System.out.println();
        System.out.println("Professores: ");
        for (Professor item : professorList) {
            System.out.println("Professor: " + item.getNomeFuncionario());
            System.out.println("Trabalha em: " + item.getSetor());
            System.out.println("Leciona: " + item.getDisciplina().getNomeDisciplina());
        }
        System.out.println("\n\n\n");
    }

    private void mostrarFaculdade(Faculdade faculdade, List<Curso> cursoList) {
        System.out.println("Faculdade: " + faculdade.getNome());
        System.out.println("Cursos: " );
        for (Curso item1 : cursoList) {
            System.out.println("- " + item1.getNomeCurso());
        }
        System.out.println("\n\n\n");
    }

    private void mostrarMaisCuros(List<Curso> cursoList, Scanner sc) {
        String cursoEscolhido;
        System.out.println("Insira o curso que você deseja saber mais: ");

        for (Curso item : cursoList) {
            System.out.println("- " + item.getNomeCurso());
        }

        cursoEscolhido = sc.next();
        sc.nextLine();

        for (Curso item : cursoList){
            if (item.getNomeCurso().equals(cursoEscolhido)){
                System.out.println("Nome: " + item.getNomeCurso());
                System.out.println("Professores: ");

                StringBuffer sb = new StringBuffer();

                for (Professor professor1 : item.getProfessorList()) {
                    sb.append(professor1.getNomeFuncionario());
                    sb.append(", ");
                }
                System.out.println(sb.toString());

            }
        }
    }

    private void iniciarFaculdade(Faculdade faculdade, Scanner sc) {

        String enderecoFaul;
        String nomeFacul;
        System.out.println("\nInsira o nome da faculdade: ");
        nomeFacul = sc.next();
        System.out.println("\nInsira o endereco da faculdade: ");
        enderecoFaul = sc.next();
        sc.nextLine();

        faculdade.setNome(nomeFacul);
        faculdade.setEndereco(enderecoFaul);

        System.out.println("Faculdade Cadastrada com sucesso!");

        System.out.println("\n\n\n");
    }

}
