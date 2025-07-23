package com.example;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = scanner.nextInt();

        System.out.print("Digite 'par' ou 'ímpar': ");
        String escolha = scanner.next();

        for (int i = segundo; i >= primeiro; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("ímpar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}