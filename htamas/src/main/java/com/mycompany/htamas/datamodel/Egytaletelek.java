
package com.mycompany.htamas.datamodel;

/**
 *
 * @author tamas
 */
public class Egytaletelek extends EgeszsegesEtelek
{
    private String tartalmaz;

    public Egytaletelek(String tartalmaz, long ID, double zsirtartalom, String szarmazas, String neve) {
        super(ID, zsirtartalom, szarmazas, neve);
        this.tartalmaz = tartalmaz;
    }

    public String getTartalmaz() {
        return tartalmaz;
    }

    public void setTartalmaz(String tartalmaz) {
        this.tartalmaz = tartalmaz;
    }       
}
