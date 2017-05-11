package com.mycompany.htamas.datamodel;

/**
 *
 * @author tamas
 */
public class Ar {
    private EgeszsegesEtelek etel;
    private Mennyiseg me;
    private long ar;
    
    public Ar(EgeszsegesEtelek etel, Mennyiseg me, long ar) {
        this.etel = etel;
        this.me = me;
        this.ar = ar;
    }
    
    public EgeszsegesEtelek getEtel() {
        return etel;
    }

    public void setEtel(EgeszsegesEtelek etel) {
        this.etel = etel;
    }

    public Mennyiseg getMe() {
        return me;
    }

    public void setMe(Mennyiseg me) {
        this.me = me;
    }

    public long getAr() {
        return ar;
    }

    public void setAr(long ar) {
        this.ar = ar;
    }
 
}
