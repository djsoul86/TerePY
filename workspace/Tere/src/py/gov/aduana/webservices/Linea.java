
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para linea complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="linea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantBultosPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantBultosTot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codArmonizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturalezaMercaderia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoBultosPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoBultosTot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linea", propOrder = {
    "cantBultosPar",
    "cantBultosTot",
    "codArmonizado",
    "naturalezaMercaderia",
    "numeroTicket",
    "pesoBultosPar",
    "pesoBultosTot",
    "valor"
})
public class Linea {

    protected String cantBultosPar;
    protected String cantBultosTot;
    protected String codArmonizado;
    protected String naturalezaMercaderia;
    protected String numeroTicket;
    protected String pesoBultosPar;
    protected String pesoBultosTot;
    protected String valor;

    /**
     * Obtiene el valor de la propiedad cantBultosPar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantBultosPar() {
        return cantBultosPar;
    }

    /**
     * Define el valor de la propiedad cantBultosPar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantBultosPar(String value) {
        this.cantBultosPar = value;
    }

    /**
     * Obtiene el valor de la propiedad cantBultosTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantBultosTot() {
        return cantBultosTot;
    }

    /**
     * Define el valor de la propiedad cantBultosTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantBultosTot(String value) {
        this.cantBultosTot = value;
    }

    /**
     * Obtiene el valor de la propiedad codArmonizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodArmonizado() {
        return codArmonizado;
    }

    /**
     * Define el valor de la propiedad codArmonizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodArmonizado(String value) {
        this.codArmonizado = value;
    }

    /**
     * Obtiene el valor de la propiedad naturalezaMercaderia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezaMercaderia() {
        return naturalezaMercaderia;
    }

    /**
     * Define el valor de la propiedad naturalezaMercaderia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezaMercaderia(String value) {
        this.naturalezaMercaderia = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTicket() {
        return numeroTicket;
    }

    /**
     * Define el valor de la propiedad numeroTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTicket(String value) {
        this.numeroTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBultosPar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBultosPar() {
        return pesoBultosPar;
    }

    /**
     * Define el valor de la propiedad pesoBultosPar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBultosPar(String value) {
        this.pesoBultosPar = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBultosTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBultosTot() {
        return pesoBultosTot;
    }

    /**
     * Define el valor de la propiedad pesoBultosTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBultosTot(String value) {
        this.pesoBultosTot = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

}
