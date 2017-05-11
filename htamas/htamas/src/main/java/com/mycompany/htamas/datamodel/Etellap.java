package com.mycompany.htamas.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tamas
 */
public class Etellap {
    private List<EtelTipusLap> eteltipusok = new ArrayList<>();

    public List<EtelTipusLap> getEteltipusok() {
        return eteltipusok;
    }

    public void setEteltipusok(List<EtelTipusLap> eteltipusok) {
        this.eteltipusok = eteltipusok;
    }
    
    public void addEteltipus(EtelTipusLap eteltipus) {
        this.eteltipusok.add(eteltipus);
    }
       
}
