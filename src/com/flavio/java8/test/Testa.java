package com.flavio.java8.test;

import com.flavio.java8.model.ComparadorDeStringPorTamanho;
import com.flavio.java8.model.ConsumidorDeString;
import com.flavio.java8.model.Pessoa;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Testa {
    public static void main(String[] args) {

        List<String> times = new ArrayList<>();

        times.add("Grêmio Football Porto-Alegrense");
        times.add("Real Madrid");
        times.add("Machester United");
        times.add("Barcelona");

        Collections.sort(times); // vai classificar a lista apartir do método de comparação implementado na classe String
        // o método sort precisa de um objeto que implemente a interface Comparable
        // nesse caso estamos passando uma lista de times que é uma lista de Strings
        // String implementa a interface Comparable

        System.out.println(times);

        // E se quisermos classificar os times pela quantidade de caracteres?

        ComparadorDeStringPorTamanho comparador = new ComparadorDeStringPorTamanho();

        //Collections.sort(times, comparador); // Podemos utilizar uma instância de Collections e utilizar o método sort

        times.sort(comparador); // Podemos também utilizar o próprio método de List


        // Imprimindo elementos da nossa lista

        System.out.println(times); // Utilizando o próprio método toString

        System.out.println("----------------");

        times.forEach((time) -> {
            System.out.println(time); // Utilizando Lambdas
        });

        // Simplificando o Lambda
        //times.forEach(time -> System.out.println(time));

        System.out.println("----------------");
        ConsumidorDeString consumidor = new ConsumidorDeString(); // Utilizando uma classe que implemente Consumer
        times.forEach(consumidor);

        System.out.println("----------------");
        // Utilizando classes anônimas
        times.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Time: " + s);
            }
        });


        Function<String, Integer> funcao = s -> s.length(); // usando lambda
        //Function<String, Integer> funcao = String::length; // usando method reference
        Comparator<String> comparator = Comparator.comparing(funcao);
        times.sort(comparator);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ricardo"));
        pessoas.add(new Pessoa("Alex"));
        pessoas.add(new Pessoa("Jair"));

        pessoas.forEach(Pessoa::dizOla); // usando method reference
        pessoas.forEach(pessoa -> {
            pessoa.dizOla();
        }); // usando lambda

    }
}
