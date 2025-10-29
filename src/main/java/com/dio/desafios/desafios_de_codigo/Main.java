package com.dio.desafios.desafios_de_codigo;

// praticando fundamentos Java //

// Anatomia da Classes em Java // Em Java sempre será necessário a declaração de uma classe

public class Main {

    public static void main(String[] args) {

        // Posso ter duas variáveis //

        String primeiroNome = "Isaque Abednego";

        String segundoNome = "de Souza Freitas";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        // Printando algo na tela para o usuário //

        System.out.println("Hello World");
        System.out.println("Isaque developer Java Junior in 2026");

    }
    // Declarando um segundo metodo //

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado método " + primeiroNome.concat(" ").concat(segundoNome);


    }

}









