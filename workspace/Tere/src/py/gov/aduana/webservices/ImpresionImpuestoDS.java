
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impresionImpuestoDS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impresionImpuestoDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtro" type="{http://aduana.gov.py/webservices}filtroConsultaDSImpuesto" minOccurs="0"/>
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
@XmlType(name = "impresionImpuestoDS", propOrder = {
    "filtro",
    "autenticacion"
})
public class ImpresionImpuestoDS {

    protected FiltroConsultaDSImpuesto filtro;
    protected Autenticacion autenticacion;

    /**
     * Obtiene el valor de la propiedad filtro.
     * 
     * @return
     *     possible object is
     *     {@link FiltroConsultaDSImpuesto }
     *     
     */
    public FiltroConsultaDSImpuesto getFiltro() {
        return filtro;
    }

    /**
     * Define el valor de la propiedad filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroConsultaDSImpuesto }
     *     
     */
    public void setFiltro(FiltroConsultaDSImpuesto value) {
        this.filtro = value;
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
