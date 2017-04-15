
package SOAP;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author usser
 */
@WebService(serviceName = "Login")
public class Login {

    
    String Usuario = "Gerardo";
    String Password = "CECYT9";
    
    @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "US") String US, @WebParam(name = "PS") String PS) {
        if (US.equals(Usuario) && PS.equals(Password)){
            return "Bienvenido";
        } else {
            return "Error, vuelve a introducir tus datos";
        }
    }
}
