package com.company.Digital_Innovation_One.Loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Exe3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count += 1;
        } while(count < 5);

        System.out.print("Maior: " + maior);
        System.out.print("Média: " + soma / 5);
    }
}
