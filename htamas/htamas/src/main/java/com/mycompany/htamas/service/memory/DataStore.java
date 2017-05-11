package com.mycompany.htamas.service.memory;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.EgeszsegesEtelek;
import com.mycompany.htamas.datamodel.Egytaletelek;
import com.mycompany.htamas.datamodel.EtelTipusLap;
import com.mycompany.htamas.datamodel.Etellap;
import com.mycompany.htamas.datamodel.Halak;
import com.mycompany.htamas.datamodel.Mennyiseg;
import com.mycompany.htamas.datamodel.Pizzak;
import java.util.List;

/**
 *
 * @author tamas
 */
public class DataStore {
    public static final Etellap etellap = new Etellap();

    static {
        EtelTipusLap etl = new EtelTipusLap();
        etl.setTitle("Halak");
        
        List<? super EgeszsegesEtelek> halak = etl.getEtelek();
        halak.add(new Halak("folyami", 0, 2.8, "Duna", "Harcsa"));
        halak.add(new Halak("tavi", 1, 5.6, "Balaton", "Ponty"));
        halak.add(new Halak("folyami", 2, 0.7, "Tisza", "Csuka"));

        List<Mennyiseg> mennyiseg = etl.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 30, "dkg", "normál adag"));
        mennyiseg.add(new Mennyiseg(1, 15, "dkg", "fél adag"));
        mennyiseg.add(new Mennyiseg(2, 120, "dkg", "családi adag"));

        List<Ar> arak = etl.getArak();
        arak.add(new Ar((Halak)halak.get(0), mennyiseg.get(0), 400));
        arak.add(new Ar((Halak)halak.get(1), mennyiseg.get(1), 200));
        arak.add(new Ar((Halak)halak.get(2), mennyiseg.get(2), 1500));

        etellap.addEteltipus(etl);
        
        
        etl = new EtelTipusLap();
        etl.setTitle("pizzák");        
        List<? super EgeszsegesEtelek> pizzak = etl.getEtelek();
        pizzak.add(new Pizzak("gomba", 0, 5, "külföldi", "Gombás"));
        pizzak.add(new Pizzak("sonka", 1, 6.2, "hazai", "Sonkás"));
        pizzak.add(new Pizzak("szalámi", 2, 6.8, "hazai", "Szalámis"));

        mennyiseg = etl.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 32, "cm", "kicsi"));
        mennyiseg.add(new Mennyiseg(1, 40, "cm", "közepes"));
        mennyiseg.add(new Mennyiseg(2, 51, "cm", "nagy"));

        arak = etl.getArak();
        arak.add(new Ar((Pizzak)pizzak.get(0), mennyiseg.get(0), 1600));
        arak.add(new Ar((Pizzak)pizzak.get(1), mennyiseg.get(1), 2000));
        arak.add(new Ar((Pizzak)pizzak.get(2), mennyiseg.get(2), 2400));
        etellap.addEteltipus(etl);
        
        
        etl = new EtelTipusLap();
        etl.setTitle("Egytálételek");        
        
        List<? super EgeszsegesEtelek> egytaletelek = etl.getEtelek();
        egytaletelek.add(new Egytaletelek("világos", 0, 37.6, "Magyarország", "Töltött káposzta"));
        egytaletelek.add(new Egytaletelek("világos", 1, 32, "Görögország", "Musaka"));
        egytaletelek.add(new Egytaletelek("világos", 2, 24, "Magyarország", "Paprikás krumpli"));

        mennyiseg = etl.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 400, "dkg", "teljes adag"));
        mennyiseg.add(new Mennyiseg(1, 250, "dkg", "kis adag"));
        mennyiseg.add(new Mennyiseg(2, 600, "dkg", "tutijóllaksz adag"));

        arak = etl.getArak();
        arak.add(new Ar((Egytaletelek)egytaletelek.get(0), mennyiseg.get(0), 1200));
        arak.add(new Ar((Egytaletelek)egytaletelek.get(1), mennyiseg.get(1), 700));
        arak.add(new Ar((Egytaletelek)egytaletelek.get(2), mennyiseg.get(2), 1500));
        etellap.addEteltipus(etl);

    }    
}
