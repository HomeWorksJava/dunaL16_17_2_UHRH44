package com.mycompany.htamas.alkalmazas;

import com.mycompany.htamas.datamodel.Ar;
import com.mycompany.htamas.datamodel.Mennyiseg;
import com.mycompany.htamas.service.memory.DataStore;

/**
 *
 * @author tamas
 */
public class Etterem {
   public static void main(String[] argvs)
   {    
Mennyiseg adat = DataStore.etellap.getEteltipusok().get(0).getMennyisegek().get(1);
       for (int i = 0; i < DataStore.etellap.getEteltipusok().get(0).getArak().size(); i++) {
          Ar ar = DataStore.etellap.getEteltipusok().get(0).getArak().get(i);
          System.out.println(ar.getEtel().getNeve());
           if (adat.equals(ar.getMe())) {
               System.out.println(ar.getEtel().getNeve()+":"+ar.getAr());
           }
       
       }       
   }   
}
