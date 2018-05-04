
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retornoConsultaInfoGuias complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retornoConsultaInfoGuias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recibo" type="{http://aduana.gov.py/webservices}Recibo" minOccurs="0"/>
 *         &lt;element name="tere" type="{http://aduana.gov.py/webservices}tereConsultaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoConsultaInfoGuias", propOrder = {
    "recibo",
    "tere"
})
public class RetornoConsultaInfoGuias {

    protected Recibo recibo;
    protected TereConsultaDTO tere;

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

    /**
     * Obtiene el valor de la propiedad tere.
     * 
     * @return
     *     possible object is
     *     {@link TereConsultaDTO }
     *     
     */
    public TereConsultaDTO getTere() {
        return tere;
    }

    /**
     * Define el valor de la propiedad tere.
     * 
     * @param value
     *     allowed object is
     *     {@link TereConsultaDTO }
     *     
     */
    public void setTere(TereConsultaDTO value) {
        this.tere = value;
    }

}
