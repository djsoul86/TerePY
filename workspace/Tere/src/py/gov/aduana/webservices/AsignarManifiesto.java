
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asignarManifiesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignarManifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manifiesto" type="{http://aduana.gov.py/webservices}IdManifiesto" minOccurs="0"/>
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
@XmlType(name = "asignarManifiesto", propOrder = {
    "manifiesto",
    "autenticacion"
})
public class AsignarManifiesto {

    protected IdManifiesto manifiesto;
    protected Autenticacion autenticacion;

    /**
     * Obtiene el valor de la propiedad manifiesto.
     * 
     * @return
     *     possible object is
     *     {@link IdManifiesto }
     *     
     */
    public IdManifiesto getManifiesto() {
        return manifiesto;
    }

    /**
     * Define el valor de la propiedad manifiesto.
     * 
     * @param value
     *     allowed object is
     *     {@link IdManifiesto }
     *     
     */
    public void setManifiesto(IdManifiesto value) {
        this.manifiesto = value;
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
