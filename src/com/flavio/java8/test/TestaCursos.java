package com.flavio.java8.test;

import com.flavio.java8.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class TestaCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Python", 55));
        cursos.add(new Curso("C", 38));
        cursos.add(new Curso("Java8", 61));
        cursos.add(new Curso("PHP", 31));
        cursos.add(new Curso("Rust", 15));

        cursos.sort(Comparator.comparing(Curso::getQtdeAlunos)); // classifica os cursos pela quantidade de alunos
        System.out.println(cursos);

        // Utilizando Stream

        cursos.stream().filter(c -> c.qtdeAlunos > 50).forEach(System.out::println);

        int sum = cursos.stream()
                .filter(c -> c.getQtdeAlunos() > 50)
                .mapToInt(c -> c.qtdeAlunos)
                .sum(); // Vai somar a quantidade de alunos apenas dos cursos com mais de 50 alunos

        System.out.println(sum);

        // Irá devolver um Optional que tem mais de 50 alunos
        Optional<Curso> cursoComMaisDe100 = cursos.stream().filter(curso -> curso.getQtdeAlunos() > 100).findAny();
        System.out.println(cursoComMaisDe100);

        Optional<Curso> cursoComMaisDe50 = cursos.stream().filter(curso -> curso.getQtdeAlunos() > 50).findAny();
        cursoComMaisDe50.ifPresent(curso -> System.out.println(curso.nome));

        // Nesta forma fazendo direto o .toList irá nos devolver uma unmodifiable list
        List<Curso> cursosComMenosDe20AlunosUnmodifiable = cursos.stream().filter(c -> c.getQtdeAlunos() < 20).toList();
        System.out.println(cursosComMenosDe20AlunosUnmodifiable);

        // Para ter uma lista modificável usamos o Collect
        List<Curso> novaLista = cursos.stream().filter(c -> c.getQtdeAlunos() < 20).collect(Collectors.toList());

        Curso cursoJavaScript = new Curso("JavaScript", 15);

        novaLista.add(cursoJavaScript);

        System.out.println(novaLista);

    }
}
