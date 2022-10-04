package com.flavio.java8.test;

import java.util.ArrayList;
import java.util.List;

public class TesteStream {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(5);
        numbers.add(6);
        numbers.add(80);
        numbers.add(100);
        numbers.add(150);
        numbers.add(2);
        numbers.add(8);
        numbers.add(25);
        numbers.add(39);
        numbers.add(78);
        numbers.add(1);
        numbers.add(200);

        System.out.println(numbers);
        System.out.println("*-----------------------------*");


        //Collections.sort(numbers);
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);
        System.out.println("*-----------------------------*");


        // Multiplicando os elementos por 1.5
        numbers.stream().mapToDouble(n -> n * 1.5).forEach(n -> System.out.printf("%s x 1.5 = %s %n", (n / 1.5), n));
        System.out.println("*-----------------------------*");


        // Filtrando apenas os valores maiores que 150
        numbers.stream().filter(n -> n > 150).forEach(System.out::println);
        System.out.println("*-----------------------------*");


    }
}
