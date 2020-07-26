package com.company;


import java.util.Scanner;

public class Osake {

    private String Nimi;
    private Integer Ostohinta;
    private Float kasvu;
    private Integer ajanjakso;
    private float Tuotto;


    public void setNimi(String Nimi) {
        this.Nimi = Nimi;
    }

    public String getNimi() {
        return this.Nimi;
    }

    public void setOstohinta(Integer Ostohinta) {
        this.Ostohinta = Ostohinta;
    }

    public Integer getOstohinta() {
        return this.Ostohinta;
    }

    public Osake(String Nimi, Integer Ostohinta) {
        this.Nimi = Nimi;
        this.Ostohinta = Ostohinta;
    }

    public void setKasvu(Float kasvu) {
        this.kasvu = kasvu;
    }

    public Float getKasvu() {
        return this.kasvu;
    }

    public void setAjanjakso(Integer ajanjakso) {
        this.ajanjakso = ajanjakso;
    }

    public Integer getAjanjakso() {
        return this.ajanjakso;
    }

    private Float LaskeTuottoYhdelleVuodelle(Float kasvu, Integer Ostohinta) {
        if(ajanjakso<=1) {
            Float Tuotto = Ostohinta * kasvu;
            System.out.println("Osakkeen " + Nimi + " tuotto on = " + Tuotto + "€");
        } else if (ajanjakso>1){
            System.out.println("Syötä osakkeiden aikaisempien tuotojen määrä: ");
            Scanner mär = new Scanner(System.in);
            Integer määrä = mär.nextInt();
            Float Tuotto = (Ostohinta * kasvu) + määrä;
            System.out.println("Osakkeen " + Nimi + " tuotto on = " + Tuotto + "€");
        }
        return Tuotto;
    }

        public void TulostaArvo (Float kasvu, Integer ajanjakso){
            this.kasvu = kasvu;
            this.ajanjakso = ajanjakso;

            LaskeTuottoYhdelleVuodelle(kasvu,Ostohinta);
        }

}



