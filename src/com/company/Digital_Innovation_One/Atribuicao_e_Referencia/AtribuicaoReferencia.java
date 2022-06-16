package com.company.Digital_Innovation_One.Atribuicao_e_Referencia;

public class AtribuicaoReferencia {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;
        System.out.println("intA = " + intA + " intB = " + intB);

        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("obja = " + objA + " objB = " + objB);
        objA.setNum(2);
        System.out.println("obja = " + objA + " objB = " + objB);
    }
}
