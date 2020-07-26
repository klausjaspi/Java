package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Osake> osakkeet = new ArrayList<>();

        System.out.println("Lisätäänkö uusi osake? (k/e): ");
        Scanner v = new Scanner(System.in);
        String vastaus = v.nextLine();

        while (true) {


            if (vastaus.equals("k")) {
                System.out.println("Osakkeiden nimi: "); // Osakkeiden nimi ja hinta tietoon ja tehdään niistä uusi Osake
                Scanner n = new Scanner(System.in);
                String nimi = n.nextLine();

                System.out.println("Osakkeiden ostohinta:  ");
                Scanner o = new Scanner(System.in);
                Integer hinta = o.nextInt();

                System.out.println("Osakkeiden kasvuprosentti: "); //määritetään kasvuprosentti ja ajanjakso
                Scanner kas = new Scanner(System.in);
                Float kasvupro = kas.nextFloat();

                System.out.println("Ajanjakso (vuosina): ");
                Scanner aj = new Scanner(System.in);
                Integer ajanjak = aj.nextInt();


                Osake esim = new Osake(nimi, hinta);
                esim.TulostaArvo(kasvupro,ajanjak);
                osakkeet.add(esim);

                System.out.println("Lisätäänkö uusi osake? (k/e): ");
                Scanner vv = new Scanner(System.in);
                String vas = vv.nextLine();

                if(vas.equals("k")){
                    continue;
                } else if(vas.equals("e")){
                    break;
                }

            } else if (vastaus.equals("e")) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            }
        }
    }
}
