
package REST;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/Divisas")

public class Divisas {
    
    @GET
    public void conversion(@QueryParam("cantidad") double cantidad){
        
        double Dolar = cantidad * 18.1000;
        double Euro = cantidad * 19.5194;
        double Yen = cantidad * 0.1678;
        double Real = cantidad * 5.8525;
        double Franco = cantidad * 18.2390;
        
        String total = "Dolar: " + Dolar + "\n" + "Euro: " + Euro + "\n" + "Yen: " + Yen + "\n" + "Real: " + Real + "\n" + "Franco: " + Franco;
        
    }
    
}
