package com.mycompany.htamas.datamodel;

/**
 *
 * @author tamas
 */
public class EgeszsegesEtelek {
    protected long ID;
    protected double zsirtartalom;
    private String szarmazas;
    private String neve;

    public EgeszsegesEtelek(long ID, double zsirtartalom, String szarmazas, String neve) {
        this.ID = ID;
        this.zsirtartalom = zsirtartalom;
        this.szarmazas = szarmazas;
        this.neve = neve;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getZsirtartalom() {
        return zsirtartalom;
    }

    public void setZsirtartalom(double zsirtartalom) {
        this.zsirtartalom = zsirtartalom;
    }

    public String getSzarmazas() {
        return szarmazas;
    }

    public void setSzarmazas(String szarmazas) {
        this.szarmazas = szarmazas;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }
   
}
