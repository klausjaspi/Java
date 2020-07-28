package com.company;

public class Henkilo {

    private String Nimi;
    private String Osoite;
    private String Syntymaaika;


    private void setNimi(){
        this.Nimi = "Mikko Mallikas";
    }
    private void setOsoite(){
        this.Osoite = "Esimerkkikatu 12";
    }
    private void setSyntymaaika(){
        this.Syntymaaika = "12.34.5678";
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


    public String getHenkilotiedot(){
        String tiedot = this.Nimi + ", " + this.Osoite + ", " + this.Syntymaaika;
        return tiedot;
    }

}
