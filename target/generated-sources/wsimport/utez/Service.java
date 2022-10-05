
package utez;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service", targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Service {


    /**
     * 
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "utez/Service/adivinarNumeroRequest", output = "utez/Service/adivinarNumeroResponse")
    public String adivinarNumero(
        @WebParam(name = "message", partName = "message")
        int message);

    /**
     * 
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "utez/Service/consonantesRequest", output = "utez/Service/consonantesResponse")
    public String consonantes(
        @WebParam(name = "message", partName = "message")
        String message);

    /**
     * 
     * @param fechaNac
     * @param apellidoP
     * @param apellidoM
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "utez/Service/rfcRequest", output = "utez/Service/rfcResponse")
    public String rfc(
        @WebParam(name = "nombre", partName = "nombre")
        String nombre,
        @WebParam(name = "apellidoP", partName = "apellidoP")
        String apellidoP,
        @WebParam(name = "apellidoM", partName = "apellidoM")
        String apellidoM,
        @WebParam(name = "fechaNac", partName = "fechaNac")
        String fechaNac);

    /**
     * 
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "utez/Service/responseMessageRequest", output = "utez/Service/responseMessageResponse")
    public String responseMessage(
        @WebParam(name = "message", partName = "message")
        String message);

}