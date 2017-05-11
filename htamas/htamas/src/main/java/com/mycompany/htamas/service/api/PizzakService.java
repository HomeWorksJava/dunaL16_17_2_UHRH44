package com.mycompany.htamas.service.api;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.Mennyiseg;
import com.mycompany.htamas.datamodel.Pizzak;

/**
 *
 * @author tamas
 */
public interface PizzakService {
    
    public Ar getAr(Pizzak pPizzak, Mennyiseg pMennyiseg) throws NullPointerException;
    public Pizzak getPizzakById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;
    
}
