
package rest;


import com.mycompany.htamas.datamodel.Halak;
import com.mycompany.htamas.datamodel.Mennyiseg;
import com.mycompany.htamas.service.api.HalakService;
import com.mycompany.htamas.service.memory.DataStore;
import com.mycompany.htamas.service.memory.HalakServiceImpl;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author tamas
 */
@Path("halak")
public class Halak_resources {
    @Path("osszes")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getOsszesHalak()
    {
        return DataStore.etellap.getEteltipusok().get(0).getEtelek();
    }
    
    @Path("me")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getOsszesme()
    {
        return DataStore.etellap.getEteltipusok().get(0).getMennyisegek();
    }

    @Path("ar")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getAr(@FormParam("halak") int halakid, @FormParam("me") int meid)
    {
        HalakService serviceHalak = new HalakServiceImpl();
        Halak halak = serviceHalak.getHalakById(halakid);
        Mennyiseg me = serviceHalak.getMennyisegById(meid);
        return ""+serviceHalak.getAr(halak, me).getAr();   
    }
       
}
