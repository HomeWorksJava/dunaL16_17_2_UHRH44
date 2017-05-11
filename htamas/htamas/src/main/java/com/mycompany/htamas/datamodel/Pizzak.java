
package com.mycompany.htamas.datamodel;

/**
 *
 * @author tamas
 */
public class Pizzak extends EgeszsegesEtelek
{
    private String feltet;

    public Pizzak(String feltet, long ID, double zsirtartalom, String szarmazas, String neve) {
        super(ID, zsirtartalom, szarmazas, neve);
        this.feltet = feltet;
    }

    public String getFeltet() {
        return feltet;
    }

    public void setFeltet(String feltet) {
        this.feltet = feltet;
    }  
    
}
