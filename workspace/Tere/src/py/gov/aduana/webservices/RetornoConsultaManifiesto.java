
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retornoConsultaManifiesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retornoConsultaManifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manifiesto" type="{http://aduana.gov.py/webservices}manifiesto" minOccurs="0"/>
 *         &lt;element name="recibo" type="{http://aduana.gov.py/webservices}Recibo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoConsultaManifiesto", propOrder = {
    "manifiesto",
    "recibo"
})
public class RetornoConsultaManifiesto {

    protected Manifiesto manifiesto;
    protected Recibo recibo;

    /**
     * Obtiene el valor de la propiedad manifiesto.
     * 
     * @return
     *     possible object is
     *     {@link Manifiesto }
     *     
     */
    public Manifiesto getManifiesto() {
        return manifiesto;
    }

    /**
     * Define el valor de la propiedad manifiesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Manifiesto }
     *     
     */
    public void setManifiesto(Manifiesto value) {
        this.manifiesto = value;
    }

    /**
     * Obtiene el valor de la propiedad recibo.
     * 
     * @return
     *     possible object is
     *     {@link Recibo }
     *     
     */
    public Recibo getRecibo() {
        return recibo;
    }

    /**
     * Define el valor de la propiedad recibo.
     * 
     * @param value
     *     allowed object is
     *     {@link Recibo }
     *     
     */
    public void setRecibo(Recibo value) {
        this.recibo = value;
    }

}
