package com.flavio.java8.model;

import java.util.function.Consumer;

public class ConsumidorDeString implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
