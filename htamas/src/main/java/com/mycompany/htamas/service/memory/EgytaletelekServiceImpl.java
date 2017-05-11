package com.mycompany.htamas.service.memory;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.EgeszsegesEtelek;
import com.mycompany.htamas.datamodel.Egytaletelek;
import com.mycompany.htamas.datamodel.EtelTipusLap;
import com.mycompany.htamas.datamodel.Mennyiseg;
import com.mycompany.htamas.service.api.EgytaletelekService;
import com.mycompany.htamas.service.api.EtellapService;
import java.util.List;

/**
 *
 * @author tamas
 */
public class EgytaletelekServiceImpl implements EgytaletelekService {
    
    private static final String ETELTIPUS = "egytaletelek";    
    EgeszsegesEtelekServiceImpl base = new EgeszsegesEtelekServiceImpl();
    EtellapService etellapService = new EtellapServiceImpl();
            
    @Override
    public Ar getAr(Egytaletelek pEgytaletelek, Mennyiseg pMennyiseg) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return base.getAr(etl.getArak(), pEgytaletelek, pMennyiseg);
    }

    @Override
    public Egytaletelek getEgytaletelekById(long id) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return (Egytaletelek)base.getEgeszsegesEtelekById((List<EgeszsegesEtelek>)etl.getEtelek(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return base.getMennyisegById(etl.getMennyisegek(), id);
    }
 
}
