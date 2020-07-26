package com.company;

public class Opiskelija {
    private String Etunimi;
    private String Sukunimi;
    private String Opiskelijanumero;
    private String Osoite;

    @Override
    public String toString() {
        return "Opiskelija{" +
                "Etunimi='" + Etunimi + '\'' +
                '}';
    }

    public Opiskelija(){
        this.Etunimi = " ";
        this.Sukunimi = " ";
        this.Opiskelijanumero = null;
        this.Osoite = " ";
    }

    public void setEtunimi(String Etunimi){
        this.Etunimi= Etunimi;
    }

    public String getEtunimi(){
        return this.Etunimi;
    }

    public void setSukunimi(String Sukunimi){
        this.Sukunimi = Sukunimi;
    }

    public String getSukunimi(){
        return this.Sukunimi;
    }

    public void setOpiskelijanumero(String Opiskelijanumero){
        this.Opiskelijanumero = Opiskelijanumero;
    }

    public String getOpiskelijanumero(){
        return this.Opiskelijanumero;
    }

    public void setOsoite(String Osoite){
        this.Osoite = Osoite;
    }

    public String getOsoite(){
        return this.Osoite;
    }
}
