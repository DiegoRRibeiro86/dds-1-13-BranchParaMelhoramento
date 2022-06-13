package com.company.Digital_Innovation_One.Arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Exe1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5,-6,15,50,8,4};

        System.out.print("Vetor: ");
        int c = 0;
        while(c < (vetor.length)) {
            System.out.print(vetor[c] + " ");
            c++;
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i-- ) {
            System.out.print(vetor[i] + " ");
        }
    }

}
