
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retornoImpresionDSImpuesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retornoImpresionDSImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="impresion" type="{http://aduana.gov.py/webservices}impresionDSImpuesto" minOccurs="0"/>
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
@XmlType(name = "retornoImpresionDSImpuesto", propOrder = {
    "impresion",
    "recibo"
})
public class RetornoImpresionDSImpuesto {

    protected ImpresionDSImpuesto impresion;
    protected Recibo recibo;

    /**
     * Obtiene el valor de la propiedad impresion.
     * 
     * @return
     *     possible object is
     *     {@link ImpresionDSImpuesto }
     *     
     */
    public ImpresionDSImpuesto getImpresion() {
        return impresion;
    }

    /**
     * Define el valor de la propiedad impresion.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpresionDSImpuesto }
     *     
     */
    public void setImpresion(ImpresionDSImpuesto value) {
        this.impresion = value;
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
