
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarHistorialPedidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarHistorialPedidos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numPed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rutPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaDeEspera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minDeEspera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="segDeEspera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarHistorialPedidos", propOrder = {
    "numPed",
    "rutPersona",
    "nomPersona",
    "horaDeEspera",
    "minDeEspera",
    "segDeEspera"
})
public class RegistrarHistorialPedidos {

    protected int numPed;
    protected String rutPersona;
    protected String nomPersona;
    protected int horaDeEspera;
    protected int minDeEspera;
    protected int segDeEspera;

    /**
     * Obtiene el valor de la propiedad numPed.
     * 
     */
    public int getNumPed() {
        return numPed;
    }

    /**
     * Define el valor de la propiedad numPed.
     * 
     */
    public void setNumPed(int value) {
        this.numPed = value;
    }

    /**
     * Obtiene el valor de la propiedad rutPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutPersona() {
        return rutPersona;
    }

    /**
     * Define el valor de la propiedad rutPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutPersona(String value) {
        this.rutPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nomPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPersona() {
        return nomPersona;
    }

    /**
     * Define el valor de la propiedad nomPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPersona(String value) {
        this.nomPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad horaDeEspera.
     * 
     */
    public int getHoraDeEspera() {
        return horaDeEspera;
    }

    /**
     * Define el valor de la propiedad horaDeEspera.
     * 
     */
    public void setHoraDeEspera(int value) {
        this.horaDeEspera = value;
    }

    /**
     * Obtiene el valor de la propiedad minDeEspera.
     * 
     */
    public int getMinDeEspera() {
        return minDeEspera;
    }

    /**
     * Define el valor de la propiedad minDeEspera.
     * 
     */
    public void setMinDeEspera(int value) {
        this.minDeEspera = value;
    }

    /**
     * Obtiene el valor de la propiedad segDeEspera.
     * 
     */
    public int getSegDeEspera() {
        return segDeEspera;
    }

    /**
     * Define el valor de la propiedad segDeEspera.
     * 
     */
    public void setSegDeEspera(int value) {
        this.segDeEspera = value;
    }

}
