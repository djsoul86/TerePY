
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para intervencionManifiesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="intervencionManifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosTitulo" type="{http://aduana.gov.py/webservices}datosTituloManifiesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intenvencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervencionManifiesto", propOrder = {
    "conocimiento",
    "consignatario",
    "datosTitulo",
    "descripcion",
    "intenvencion",
    "linea",
    "prefijo",
    "titPadre"
})
public class IntervencionManifiesto {

    protected String conocimiento;
    protected String consignatario;
    @XmlElement(nillable = true)
    protected List<DatosTituloManifiesto> datosTitulo;
    protected String descripcion;
    protected String intenvencion;
    protected String linea;
    protected String prefijo;
    protected String titPadre;

    /**
     * Obtiene el valor de la propiedad conocimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConocimiento() {
        return conocimiento;
    }

    /**
     * Define el valor de la propiedad conocimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConocimiento(String value) {
        this.conocimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad consignatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignatario() {
        return consignatario;
    }

    /**
     * Define el valor de la propiedad consignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignatario(String value) {
        this.consignatario = value;
    }

    /**
     * Gets the value of the datosTitulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosTitulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosTitulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosTituloManifiesto }
     * 
     * 
     */
    public List<DatosTituloManifiesto> getDatosTitulo() {
        if (datosTitulo == null) {
            datosTitulo = new ArrayList<DatosTituloManifiesto>();
        }
        return this.datosTitulo;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad intenvencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntenvencion() {
        return intenvencion;
    }

    /**
     * Define el valor de la propiedad intenvencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntenvencion(String value) {
        this.intenvencion = value;
    }

    /**
     * Obtiene el valor de la propiedad linea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Define el valor de la propiedad linea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinea(String value) {
        this.linea = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Define el valor de la propiedad prefijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijo(String value) {
        this.prefijo = value;
    }

    /**
     * Obtiene el valor de la propiedad titPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitPadre() {
        return titPadre;
    }

    /**
     * Define el valor de la propiedad titPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitPadre(String value) {
        this.titPadre = value;
    }

}
