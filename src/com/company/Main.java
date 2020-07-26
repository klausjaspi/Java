package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lottorivi on: ");
        ArrayList<Integer> lottorivi = new ArrayList<Integer>();
        ArrayList<Integer> omarivi = new ArrayList<Integer>();
        ArrayList<Integer> equalsi = new ArrayList<Integer>();

        for(int i= 0; i<=6; i++){
            Random r = new Random();
            int arvot = r.nextInt(100);
            String rivi = Integer.toString(arvot);

            lottorivi.add(arvot);
            System.out.print(" " + rivi);

        }

        System.out.println(" ");


        while(true){
            System.out.println("Haluatko arpoa rivin? (k = kyllä, e = ei) ");
            Scanner mika = new Scanner(System.in);
            String vastaus = mika.nextLine();

            if(vastaus.equals("k")) {
                System.out.println("Lottorivisi on:");

                for (int ii = 0; ii <= 6; ii++) {

                    Random k = new Random();
                    int onnea = k.nextInt(100);
                    String lauantai_lotto = Integer.toString(onnea);
                    omarivi.add(onnea);


                    System.out.print(" " + lauantai_lotto);

            }

                    omarivi.retainAll(lottorivi);
                    int maara = omarivi.size();

                    System.out.println(" ");
                    System.out.println("Oikein oli " + maara + " kpl, jotka olivat: " + omarivi);
                    continue;

        }   else if(vastaus.equals("e")) {
                System.out.print("Kiitos ja hei hei!");
                break;
            }
        }
    }
}
