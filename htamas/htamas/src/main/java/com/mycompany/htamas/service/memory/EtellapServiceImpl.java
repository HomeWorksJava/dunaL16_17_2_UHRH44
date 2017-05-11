package com.mycompany.htamas.service.memory;

import com.mycompany.htamas.datamodel.EtelTipusLap;
import com.mycompany.htamas.service.api.EtellapService;

/**
 *
 * @author tamas
 */
public class EtellapServiceImpl implements EtellapService {
    
    @Override
    public EtelTipusLap getEtelTipusLapByTitle(String pTitle) throws NullPointerException{
        for(EtelTipusLap item:DataStore.etellap.getEteltipusok())
            if(item.getTitle().equals(pTitle))
                return item;
        throw new NullPointerException();
    }
}
