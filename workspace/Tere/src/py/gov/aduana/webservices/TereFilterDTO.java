
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tereFilterDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tereFilterDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conDespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conIngDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tereFilterDTO", propOrder = {
    "bloqueo",
    "conDespacho",
    "conIngDeposito",
    "nroGuia",
    "tere"
})
public class TereFilterDTO {

    protected String bloqueo;
    protected String conDespacho;
    protected String conIngDeposito;
    protected String nroGuia;
    protected String tere;

    /**
     * Obtiene el valor de la propiedad bloqueo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloqueo() {
        return bloqueo;
    }

    /**
     * Define el valor de la propiedad bloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloqueo(String value) {
        this.bloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad conDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConDespacho() {
        return conDespacho;
    }

    /**
     * Define el valor de la propiedad conDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConDespacho(String value) {
        this.conDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad conIngDeposito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConIngDeposito() {
        return conIngDeposito;
    }

    /**
     * Define el valor de la propiedad conIngDeposito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConIngDeposito(String value) {
        this.conIngDeposito = value;
    }

    /**
     * Obtiene el valor de la propiedad nroGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroGuia() {
        return nroGuia;
    }

    /**
     * Define el valor de la propiedad nroGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroGuia(String value) {
        this.nroGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad tere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTere() {
        return tere;
    }

    /**
     * Define el valor de la propiedad tere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTere(String value) {
        this.tere = value;
    }

}
