package com.mycompany.htamas.service.memory;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.EgeszsegesEtelek;
import com.mycompany.htamas.datamodel.EtelTipusLap;
import com.mycompany.htamas.datamodel.Halak;
import com.mycompany.htamas.datamodel.Mennyiseg;
import com.mycompany.htamas.service.api.EtellapService;
import com.mycompany.htamas.service.api.HalakService;
import java.util.List;

/**
 *
 * @author tamas
 */
public class HalakServiceImpl implements HalakService{
    
    private static final String ETELTIPUS = "halak";    
    EgeszsegesEtelekServiceImpl base = new EgeszsegesEtelekServiceImpl();
    EtellapService etellapService = new EtellapServiceImpl();
            
    @Override
    public Ar getAr(Halak pHalak, Mennyiseg pMennyiseg) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return base.getAr(etl.getArak(), pHalak, pMennyiseg);
    }

    @Override
    public Halak getHalakById(long id) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return (Halak)base.getEgeszsegesEtelekById((List<EgeszsegesEtelek>)etl.getEtelek(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return base.getMennyisegById(etl.getMennyisegek(), id);
    }
    
}
