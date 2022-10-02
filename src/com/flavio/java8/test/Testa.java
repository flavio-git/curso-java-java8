package com.flavio.java8.test;

import com.flavio.java8.model.ComparadorDeStringPorTamanho;
import com.flavio.java8.model.ConsumidorDeString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Testa {
    public static void main(String[] args) {

        List<String> times = new ArrayList<>();

        times.add("Grêmio Football Porto-Alegrense");
        times.add("Real Madrid");
        times.add("Machester United");
        times.add("Barcelona");

        Collections.sort(times); // vai classificar a lista apartir do método de comparação implementado na classe String

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

    }

}
