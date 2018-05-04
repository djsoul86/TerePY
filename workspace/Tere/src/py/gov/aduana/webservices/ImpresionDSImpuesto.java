
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impresionDSImpuesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impresionDSImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionArchivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="tipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impresionDSImpuesto", propOrder = {
    "idDs",
    "impresionArchivo",
    "tipoArchivo"
})
public class ImpresionDSImpuesto {

    protected String idDs;
    protected byte[] impresionArchivo;
    protected String tipoArchivo;

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
     * Obtiene el valor de la propiedad impresionArchivo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImpresionArchivo() {
        return impresionArchivo;
    }

    /**
     * Define el valor de la propiedad impresionArchivo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImpresionArchivo(byte[] value) {
        this.impresionArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoArchivo() {
        return tipoArchivo;
    }

    /**
     * Define el valor de la propiedad tipoArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoArchivo(String value) {
        this.tipoArchivo = value;
    }

}
