package com.flavio.java8.model;

public class Pessoa {
        private String nome;

        public Pessoa(String nome) {
            this.nome = nome;
        }

        public void dizOla(){
            System.out.println(this.nome + " dizendo olá!");
        }
    }
