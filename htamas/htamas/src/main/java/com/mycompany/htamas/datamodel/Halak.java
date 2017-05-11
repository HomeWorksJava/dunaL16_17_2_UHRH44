package com.mycompany.htamas.datamodel;

/**
 *
 * @author tamas
 */
public class Halak  extends EgeszsegesEtelek
{
    private String fajta;

    public Halak(String fajta, long ID, double zsirtartalom, String szarmazas, String neve) {
        super(ID, zsirtartalom, szarmazas, neve);
        this.fajta = fajta;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }    
}
