package com.dio.desafios.desafios_de_codigo;

// 1. Importa a classe Scanner para ler dados inseridos pelo usuário
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        // 2. Cria um objeto Scanner para receber entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // 3. Solicita e lê o primeiro número.
        System.out.println("Por favor, digite o primeiro numero:");
        int primeiroNumero = scanner.nextInt();

        // 4. Solicita e lê o segundo número.
        System.out.println("Por favor, digite o segundo numero:");
        int segundoNumero = scanner.nextInt();

        // 5. Calcula a subtração.
        int resultado = primeiroNumero - segundoNumero;

        /* 6. Exibe o resultado. */
        System.out.println("O resultado da subtracao de " + primeiroNumero + " menos " + segundoNumero + " é: " + resultado);

        // 7. Fecha o objeto Scanner.
        scanner.close();
    }
}
