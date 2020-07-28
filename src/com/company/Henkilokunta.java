package com.company;

public class Henkilokunta extends Henkilo {
    private String Tyontekijanumero;
    private String Toimipaikka;
    private String Titteli;

    private void setTyontekijanumero(){
        this.Tyontekijanumero = "200831";
    }

    private void setToimipaikka(){
        this.Toimipaikka = "Takakujan Myymälä";
    }

    private void setTitteli(){
        this.Titteli = "Johtaja";
    }

    private String getTyontekijanumero(){
        return Tyontekijanumero;
    }

    private String getToimipaikka(){
        return Toimipaikka;
    }

    private String getTitteli(){
        return Titteli;
    }

    public void getHenkilokunta(){
        super.getHenkilotiedot();
        System.out.println(getHenkilotiedot() + Tyontekijanumero + Toimipaikka + Titteli);
    }
}
