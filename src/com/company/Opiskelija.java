package com.company;

public class Opiskelija extends Henkilo {

    private  Integer Opiskelijanumero;
    private String Aloituspaiva;

    private void setOpiskelijanumero(){
        this.Opiskelijanumero = 888432;
    }
    private void setAloituspaiva(){
        this.Aloituspaiva = "28.8.2019";
    }

    private Integer getOpiskelijanumero(){
        return Opiskelijanumero;
    }
    private String getAloituspaiva(){
        return Aloituspaiva;
    }



    public void tulostaOpiskelija(){
        String opisk = getAloituspaiva() + getOpiskelijanumero();
        super.getHenkilotiedot();
        System.out.println(getHenkilotiedot() + opisk);
    }
}
