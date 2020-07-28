package com.company;

public class Main {

    public static void main(String[] args) {
        Henkilo henk = new Henkilo();
        System.out.println(henk.getHenkilotiedot());

        Henkilokunta henksu = new Henkilokunta();
        henksu.getHenkilokunta();

        Opiskelija opisk = new Opiskelija();
        opisk.tulostaOpiskelija();
    }
}
