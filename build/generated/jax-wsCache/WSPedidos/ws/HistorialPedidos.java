
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para historialPedidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="historialPedidos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora_de_espera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="min_de_espera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nom_persona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="num_ped" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rut_persona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seg_de_espera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historialPedidos", propOrder = {
    "fecha",
    "horaDeEspera",
    "id",
    "minDeEspera",
    "nomPersona",
    "numPed",
    "rutPersona",
    "segDeEspera"
})
public class HistorialPedidos {

    protected String fecha;
    @XmlElement(name = "hora_de_espera")
    protected int horaDeEspera;
    protected int id;
    @XmlElement(name = "min_de_espera")
    protected int minDeEspera;
    @XmlElement(name = "nom_persona")
    protected String nomPersona;
    @XmlElement(name = "num_ped")
    protected int numPed;
    @XmlElement(name = "rut_persona")
    protected String rutPersona;
    @XmlElement(name = "seg_de_espera")
    protected int segDeEspera;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
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
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
