package com.mycompany.htamas.service.api;

import com.mycompany.htamas.datamodel.EtelTipusLap;

/**
 *
 * @author tamas
 */
public interface EtellapService {
    public EtelTipusLap getEtelTipusLapByTitle(String pTitle) throws NullPointerException;   
}
