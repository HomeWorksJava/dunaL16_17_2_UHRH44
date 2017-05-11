package com.mycompany.htamas.service.memory;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.EgeszsegesEtelek;
import com.mycompany.htamas.datamodel.Mennyiseg;
import java.util.List;

/**
 *
 * @author tamas
 */
public class EgeszsegesEtelekServiceImpl {

    public Ar getAr(List<Ar> pSource, EgeszsegesEtelek pEtel, Mennyiseg pMennyiseg) throws NullPointerException{
        for(Ar item:pSource)
            if(
                item.getEtel().equals(pEtel) &&
                item.getMe().equals(pMennyiseg)
            )
                return item;
        throw new NullPointerException();
    
    }
    
    public EgeszsegesEtelek getEgeszsegesEtelekById(List<EgeszsegesEtelek > pSource, long id) throws NullPointerException{
        for(EgeszsegesEtelek item:pSource)
            if(item.getID() == id)
                return item;
        throw new NullPointerException();
    }
    
    public Mennyiseg getMennyisegById(List<Mennyiseg> pSource,long id) throws NullPointerException{
        for(Mennyiseg item:pSource)
            if(item.getID() == id)
                return item;
        throw new NullPointerException();
    }    
}
