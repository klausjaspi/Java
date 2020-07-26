package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Opiskelija opisk = new Opiskelija();
	    opisk.setEtunimi("Matti");
	    opisk.setSukunimi("Meikäläinen");
	    opisk.setOpiskelijanumero("100819");
	    opisk.setOsoite("Esimerkkikatu 12, 202020 Mallikaupunki");

	    //System.out.println("Etunimi on: " + opisk.getEtunimi());
	    //System.out.println("Sukunimi on: " + opisk.getSukunimi());
	    //System.out.println("Opiskelijanumero on: " + opisk.getOpiskelijanumero());
	    //System.out.println("Osoite on: "+ opisk.getOsoite());

		OpiskelijaUtils jep = new OpiskelijaUtils();
		jep.Tarkastatiedot();

    }
}
