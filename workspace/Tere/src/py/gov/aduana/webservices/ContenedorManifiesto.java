
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contenedorManifiesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contenedorManifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contenedorManifiesto", propOrder = {
    "comentario",
    "condicion",
    "despacho",
    "medida",
    "nroContenedor"
})
public class ContenedorManifiesto {

    protected String comentario;
    protected String condicion;
    protected String despacho;
    protected String medida;
    protected String nroContenedor;

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtiene el valor de la propiedad condicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicion() {
        return condicion;
    }

    /**
     * Define el valor de la propiedad condicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicion(String value) {
        this.condicion = value;
    }

    /**
     * Obtiene el valor de la propiedad despacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * Define el valor de la propiedad despacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespacho(String value) {
        this.despacho = value;
    }

    /**
     * Obtiene el valor de la propiedad medida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedida() {
        return medida;
    }

    /**
     * Define el valor de la propiedad medida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedida(String value) {
        this.medida = value;
    }

    /**
     * Obtiene el valor de la propiedad nroContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroContenedor() {
        return nroContenedor;
    }

    /**
     * Define el valor de la propiedad nroContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroContenedor(String value) {
        this.nroContenedor = value;
    }

}
