
package com.mycompany.htamas.service.api;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.Egytaletelek;
import com.mycompany.htamas.datamodel.Mennyiseg;

/**
 *
 * @author tamas
 */
public interface EgytaletelekService {
    
    public Ar getAr(Egytaletelek pEgytaletelek, Mennyiseg pMennyiseg) throws NullPointerException;
    public Egytaletelek getEgytaletelekById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;  
}
