

package SOAP;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author usser
 */
@WebService(serviceName = "LogC")
public class Calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sumar")
    public double sumar(@WebParam(name = "a") double a,@WebParam(name = "b") double b) {
        return a + b;
    }
    
    @WebMethod(operationName = "restar")
    public double restar(@WebParam(name = "a") double a,@WebParam(name = "b") double b) {
        return a - b;
    }
    
    @WebMethod(operationName = "multiplicar")
    public double multiplicar(@WebParam(name = "a") double a,@WebParam(name = "b") double b) {
        return a * b;
    }
    
    @WebMethod(operationName = "dividir")
    public double dividir(@WebParam(name = "a") double a,@WebParam(name = "b") double b) {
        return a / b;
    }
}
