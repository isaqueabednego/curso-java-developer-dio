package com.dio.desafios.desafios_de_codigo;

import java.util.Scanner;

// Estudo de identação, organizando o código //
public class BoletimEstudantil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Cria um objeto Scanner para receber entrada do usuário.

        // Posso declarar a variável int ou double //

        System.out.println("Informa a nota do 1° Bimestre:");
        int primeiroBimestre = scanner.nextInt();

        System.out.println("Informa a nota do 2° Bimestre:");
        int segundoBimestre = scanner.nextInt();

        System.out.println("Informa a nota do 3° Bimestre:");
        int terceiroBimestre = scanner.nextInt();

        System.out.println("Informa a nota do 4° Bimestre:");
        int quartoBimestre = scanner.nextInt();

        int mediaFinal = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre)/ 4;
        System.out.println(mediaFinal);

        if (mediaFinal < 7)
            // Estudo de condicionais if = se //

            System.out.println("Reprovado, você terá que repetir a disciplina");

            // else if = "senão se" adiciona mais uma condição afirmativa //

        else if (mediaFinal == 7)

            System.out.println("Prova Minerva");

            // else = senão, condição de negação, caso todas as anteriores forem falsas print a informação abaixo //

        else
            System.out.println("Aprovado, apto para a próxima disciplina");

    }

}
