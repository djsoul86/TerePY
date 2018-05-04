
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retornoAsignarManifiesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retornoAsignarManifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maniGen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "retornoAsignarManifiesto", propOrder = {
    "maniGen",
    "recibo"
})
public class RetornoAsignarManifiesto {

    protected String maniGen;
    protected Recibo recibo;

    /**
     * Obtiene el valor de la propiedad maniGen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManiGen() {
        return maniGen;
    }

    /**
     * Define el valor de la propiedad maniGen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManiGen(String value) {
        this.maniGen = value;
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
