
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para autenticacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="autenticacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmaWSAA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketWSAA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autenticacion", propOrder = {
    "codAduana",
    "firmaWSAA",
    "idUsuario",
    "ticketWSAA"
})
public class Autenticacion {

    protected String codAduana;
    protected String firmaWSAA;
    protected String idUsuario;
    protected String ticketWSAA;

    /**
     * Obtiene el valor de la propiedad codAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAduana() {
        return codAduana;
    }

    /**
     * Define el valor de la propiedad codAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAduana(String value) {
        this.codAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad firmaWSAA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmaWSAA() {
        return firmaWSAA;
    }

    /**
     * Define el valor de la propiedad firmaWSAA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmaWSAA(String value) {
        this.firmaWSAA = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketWSAA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketWSAA() {
        return ticketWSAA;
    }

    /**
     * Define el valor de la propiedad ticketWSAA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketWSAA(String value) {
        this.ticketWSAA = value;
    }

}
