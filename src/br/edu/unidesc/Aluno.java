package br.edu.unidesc;

public interface Aluno {

    Aluno criarAluno(Aluno aluno);
    Aluno RecuperarAluno (String cpf);
    void atualizarAluno (Aluno aluno);
    void deletarAluno (String cpf);


}

