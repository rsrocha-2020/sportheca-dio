package br.com.dio;

import br.com.dio.projetono.No;

public class NoPrincipal {
    public static void main(String[] args) {
        No no1 = new No("Conteúdo no1");
        No no2 = new No("Conteúdo no2");
        no1.setProximoNo(no2);
        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());

    }
}
