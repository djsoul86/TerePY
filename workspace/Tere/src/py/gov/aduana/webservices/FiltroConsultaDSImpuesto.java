
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para filtroConsultaDSImpuesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="filtroConsultaDSImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtroConsultaDSImpuesto", propOrder = {
    "idDs",
    "nroDocumento",
    "nroGuia",
    "tipoDocumento"
})
public class FiltroConsultaDSImpuesto {

    protected String idDs;
    protected String nroDocumento;
    protected String nroGuia;
    protected String tipoDocumento;

    /**
     * Obtiene el valor de la propiedad idDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDs() {
        return idDs;
    }

    /**
     * Define el valor de la propiedad idDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDs(String value) {
        this.idDs = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocumento() {
        return nroDocumento;
    }

    /**
     * Define el valor de la propiedad nroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocumento(String value) {
        this.nroDocumento = value;
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
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}
