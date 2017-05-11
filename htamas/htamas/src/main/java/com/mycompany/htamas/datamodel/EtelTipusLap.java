package com.mycompany.htamas.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tamas
 */
public class EtelTipusLap {
    private String title ="";
    private List<? super EgeszsegesEtelek> etelek = new ArrayList();    
    private List<Mennyiseg> mennyisegek = new ArrayList();
    private List<Ar> arak = new ArrayList();

    public EtelTipusLap() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<? super EgeszsegesEtelek> getEtelek() {
        return etelek;
    }

    public void setEtelek(List<? super EgeszsegesEtelek> etelek) {
        this.etelek = etelek;
    }

    public void addEtel(EgeszsegesEtelek etel) {
        this.etelek.add(etel);
    }

    public List<Mennyiseg> getMennyisegek() {
        return mennyisegek;
    }

    public void setMennyisegek(List<Mennyiseg> mennyisegek) {
        this.mennyisegek = mennyisegek;
    }

    public void addMennyiseg(Mennyiseg mennyiseg) {
        this.mennyisegek.add(mennyiseg);
    }

    
    public List<Ar> getArak() {
        return arak;
    }

    public void setArak(List<Ar> arak) {
        this.arak = arak;
    }
    
    public void addAr(Ar ar) {
        this.arak.add(ar);
    }
    
  
}
