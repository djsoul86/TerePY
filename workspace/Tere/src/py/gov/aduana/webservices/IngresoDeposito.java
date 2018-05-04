
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingresoDeposito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingresoDeposito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autenticacion" type="{http://aduana.gov.py/webservices}autenticacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingresoDeposito", propOrder = {
    "ingreso",
    "autenticacion"
})
public class IngresoDeposito {

    protected String ingreso;
    protected Autenticacion autenticacion;

    /**
     * Obtiene el valor de la propiedad ingreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngreso() {
        return ingreso;
    }

    /**
     * Define el valor de la propiedad ingreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngreso(String value) {
        this.ingreso = value;
    }

    /**
     * Obtiene el valor de la propiedad autenticacion.
     * 
     * @return
     *     possible object is
     *     {@link Autenticacion }
     *     
     */
    public Autenticacion getAutenticacion() {
        return autenticacion;
    }

    /**
     * Define el valor de la propiedad autenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Autenticacion }
     *     
     */
    public void setAutenticacion(Autenticacion value) {
        this.autenticacion = value;
    }

}
