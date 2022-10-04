package com.flavio.java8.model;

public class Curso {
    public String nome;
    public int qtdeAlunos;

    public Curso(String nome, int qtdeAlunos) {
        this.nome = nome;
        this.qtdeAlunos = qtdeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdeAlunos() {
        return qtdeAlunos;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", qtdeAlunos=" + qtdeAlunos +
                '}';
    }
}
