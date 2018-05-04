
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guiaHijaConsultaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guiaHijaConsultaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guiaDespachada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingresoDeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoBloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoDesbloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroHijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaHijaConsultaDTO", propOrder = {
    "bloqueo",
    "consignatario",
    "guiaDespachada",
    "ingresoDeposito",
    "manifiesto",
    "motivoBloqueo",
    "motivoDesbloqueo",
    "nroDespacho",
    "nroHijo",
    "tipoOperacion"
})
public class GuiaHijaConsultaDTO {

    protected String bloqueo;
    protected String consignatario;
    protected String guiaDespachada;
    protected String ingresoDeposito;
    protected String manifiesto;
    protected String motivoBloqueo;
    protected String motivoDesbloqueo;
    protected String nroDespacho;
    protected String nroHijo;
    protected String tipoOperacion;

    /**
     * Obtiene el valor de la propiedad bloqueo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloqueo() {
        return bloqueo;
    }

    /**
     * Define el valor de la propiedad bloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloqueo(String value) {
        this.bloqueo = value;
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
     * Obtiene el valor de la propiedad guiaDespachada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaDespachada() {
        return guiaDespachada;
    }

    /**
     * Define el valor de la propiedad guiaDespachada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaDespachada(String value) {
        this.guiaDespachada = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoDeposito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngresoDeposito() {
        return ingresoDeposito;
    }

    /**
     * Define el valor de la propiedad ingresoDeposito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngresoDeposito(String value) {
        this.ingresoDeposito = value;
    }

    /**
     * Obtiene el valor de la propiedad manifiesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiesto() {
        return manifiesto;
    }

    /**
     * Define el valor de la propiedad manifiesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiesto(String value) {
        this.manifiesto = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoBloqueo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoBloqueo() {
        return motivoBloqueo;
    }

    /**
     * Define el valor de la propiedad motivoBloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoBloqueo(String value) {
        this.motivoBloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDesbloqueo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDesbloqueo() {
        return motivoDesbloqueo;
    }

    /**
     * Define el valor de la propiedad motivoDesbloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDesbloqueo(String value) {
        this.motivoDesbloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDespacho() {
        return nroDespacho;
    }

    /**
     * Define el valor de la propiedad nroDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDespacho(String value) {
        this.nroDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad nroHijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroHijo() {
        return nroHijo;
    }

    /**
     * Define el valor de la propiedad nroHijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroHijo(String value) {
        this.nroHijo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

}
