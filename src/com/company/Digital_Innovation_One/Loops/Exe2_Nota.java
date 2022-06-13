package com.company.Digital_Innovation_One.Loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Exe2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.print("Digite sua nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scanner.nextInt();
        }
    }
}
