package com.flavio.java8.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteDate {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter todayFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(todayFormatter));

        LocalDate newYears = LocalDate.of(2022, Month.DECEMBER, 31);

        Period todayNewYears = Period.between(today, newYears);
        System.out.println("Estão faltando para o Ano Novo -> Meses: " + todayNewYears.getMonths() + " | Dias: " + todayNewYears.getDays());

    }
}
