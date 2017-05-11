package com.mycompany.htamas.service.api;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.Halak;
import com.mycompany.htamas.datamodel.Mennyiseg;

/**
 *
 * @author tamas
 */
public interface HalakService {
    
    public Ar getAr(Halak pHalak, Mennyiseg pMennyiseg) throws NullPointerException;
    public Halak getHalakById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;
      
}
