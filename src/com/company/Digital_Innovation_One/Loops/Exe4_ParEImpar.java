package com.company.Digital_Innovation_One.Loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;

public class Exe4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scanner.nextInt();

        int count = 0;
        do {
            System.out.println("Números: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade par: " + quantPares);
        System.out.println("Quantidade ímpar: " + quantImpares);

    }
}
