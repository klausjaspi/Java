package com.company;

import java.util.Scanner;

public class OpiskelijaUtils {
    public static void Tarkastatiedot(){
        boolean error = false;

        System.out.println("Etunimi: ");
        Scanner etu = new Scanner(System.in);
        String etunimi = etu.nextLine();

        System.out.println("Sukunimi: ");
        Scanner suk = new Scanner(System.in);
        String sukunimi = suk.nextLine();

        System.out.println("Opiskelijanumero: ");
        Scanner opi = new Scanner(System.in);
        Integer numero = opi.nextInt();

        System.out.println("Osoite: ");
        Scanner oso = new Scanner(System.in);
        String osoite = oso.nextLine();

        if(etunimi == null){
            System.out.println("null");
        } else if(sukunimi == null){
            System.out.println("null");
        } else if(osoite == null){
            System.out.println("null");
        } else if(numero == null){
            System.out.println("null");
        }

        if(Character.isLowerCase(etunimi.codePointAt(0))){
            String Etunimi = etunimi.substring(0,1).toUpperCase() + etunimi.substring(1);
            etunimi = Etunimi;
        }
        if(Character.isLowerCase(sukunimi.codePointAt(0))){
            String Sukunimi = sukunimi.substring(0,1).toUpperCase() + sukunimi.substring(1);
            sukunimi = Sukunimi;
        }

        try{
            Integer.parseInt(String.valueOf(opi));
        } catch (NumberFormatException ex){

        }


        System.out.println("Etunimi: " + etunimi);
        System.out.println("Sukunimi: " + sukunimi);
        System.out.println("Opiskelijanumero: " + numero);
        System.out.println("Osoite: " + osoite);
    }
}
