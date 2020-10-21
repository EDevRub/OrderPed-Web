
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getHoraDeEspera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getHoraDeEspera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numPed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHoraDeEspera", propOrder = {
    "numPed"
})
public class GetHoraDeEspera {

    protected int numPed;

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

}
