package com.company;

public class Henkilo {

    private String Nimi;
    private String Osoite;
    private String Syntymaaika;


    private void setNimi(){
        this.Nimi = Nimi;
    }
    private void setOsoite(){
        this.Osoite = Osoite;
    }
    private void setSyntymaaika(){
        this.Syntymaaika = Syntymaaika;
    }

    private String getNimi(){
        return Nimi;
    }
    private String getOsoite(){
        return Osoite;
    }
    private String getSyntymaaika(){
        return Syntymaaika;
    }

    private String getHenkilotiedot(){
        String tiedot = Nimi + ", " + Osoite + ", " + Syntymaaika;
        return tiedot;
    }

}
