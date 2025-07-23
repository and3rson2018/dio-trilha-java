package com.example;

import java.util.Scanner;

public class DivisaoCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int inicial = scanner.nextInt();

        while (true) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            if (numero < inicial) {
                System.out.println("Número ignorado (menor que o inicial)");
                continue;
            }

            if (numero % inicial != 0) {
                System.out.println("Execução encerrada: " + numero + " não é divisível por " + inicial);
                break;
            } else {
                System.out.println(numero + " é divisível por " + inicial);
            }
        }
        scanner.close();
    }
}
