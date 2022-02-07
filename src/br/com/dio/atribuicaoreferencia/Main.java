package br.com.dio.atribuicaoreferencia;

import br.com.dio.MeuObj;

public class Main {
    public static void main(String[] args) {
        int A = 1;
        int B = A;

        //Atribuição de tipos primitivos
        System.out.println("A = " + A + ", B = " + B);
        A = 2;
        System.out.println("A = " + A + ", B = " + B);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        //Atribuição de Objetos
        System.out.println("objA = "+ objA +", objB = "+ objB);
        objA.setNum(2);
        System.out.println("objA = "+ objA +", objB = "+ objB);
    }
}
