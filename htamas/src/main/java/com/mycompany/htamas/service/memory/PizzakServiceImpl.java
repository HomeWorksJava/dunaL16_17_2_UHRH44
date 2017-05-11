
package com.mycompany.htamas.service.memory;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.EgeszsegesEtelek;
import com.mycompany.htamas.datamodel.EtelTipusLap;
import com.mycompany.htamas.datamodel.Mennyiseg;
import com.mycompany.htamas.datamodel.Pizzak;
import com.mycompany.htamas.service.api.EtellapService;
import com.mycompany.htamas.service.api.PizzakService;
import java.util.List;

/**
 *
 * @author tamas
 */
public class PizzakServiceImpl implements PizzakService{
    private static final String ETELTIPUS = "pizzak";    
    EgeszsegesEtelekServiceImpl base = new EgeszsegesEtelekServiceImpl();
    EtellapService etellapService = new EtellapServiceImpl();
            
    @Override
    public Ar getAr(Pizzak pPizzak, Mennyiseg pMennyiseg) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return base.getAr(etl.getArak(), pPizzak, pMennyiseg);
    }

    @Override
    public Pizzak getPizzakById(long id) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return (Pizzak)base.getEgeszsegesEtelekById((List<EgeszsegesEtelek>)etl.getEtelek(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        EtelTipusLap etl = etellapService.getEtelTipusLapByTitle(ETELTIPUS);
        return base.getMennyisegById(etl.getMennyisegek(), id);
    }
 
}
