
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guiaHija complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guiaHija">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facturas" type="{http://aduana.gov.py/webservices}factura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineas" type="{http://aduana.gov.py/webservices}linea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maniPrimeraFraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDocDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroHijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisDocDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primeraFraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sujetoControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorDol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorMonedaPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaHija", propOrder = {
    "codigoMoneda",
    "destinatario",
    "facturas",
    "lineas",
    "maniPrimeraFraccion",
    "nroDocDestinatario",
    "nroHijo",
    "paisDocDestinatario",
    "paisOrigen",
    "paisProc",
    "primeraFraccion",
    "sujetoControl",
    "tipoDocDestinatario",
    "tipoOperacion",
    "tipoPaquete",
    "valorDol",
    "valorMoneda",
    "valorMonedaPar"
})
public class GuiaHija {

    protected String codigoMoneda;
    protected String destinatario;
    @XmlElement(nillable = true)
    protected List<Factura> facturas;
    @XmlElement(nillable = true)
    protected List<Linea> lineas;
    protected String maniPrimeraFraccion;
    protected String nroDocDestinatario;
    protected String nroHijo;
    protected String paisDocDestinatario;
    protected String paisOrigen;
    protected String paisProc;
    protected String primeraFraccion;
    protected String sujetoControl;
    protected String tipoDocDestinatario;
    protected String tipoOperacion;
    protected String tipoPaquete;
    protected String valorDol;
    protected String valorMoneda;
    protected String valorMonedaPar;

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
    }

    /**
     * Gets the value of the facturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Factura }
     * 
     * 
     */
    public List<Factura> getFacturas() {
        if (facturas == null) {
            facturas = new ArrayList<Factura>();
        }
        return this.facturas;
    }

    /**
     * Gets the value of the lineas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linea }
     * 
     * 
     */
    public List<Linea> getLineas() {
        if (lineas == null) {
            lineas = new ArrayList<Linea>();
        }
        return this.lineas;
    }

    /**
     * Obtiene el valor de la propiedad maniPrimeraFraccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManiPrimeraFraccion() {
        return maniPrimeraFraccion;
    }

    /**
     * Define el valor de la propiedad maniPrimeraFraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManiPrimeraFraccion(String value) {
        this.maniPrimeraFraccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocDestinatario() {
        return nroDocDestinatario;
    }

    /**
     * Define el valor de la propiedad nroDocDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocDestinatario(String value) {
        this.nroDocDestinatario = value;
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
     * Obtiene el valor de la propiedad paisDocDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDocDestinatario() {
        return paisDocDestinatario;
    }

    /**
     * Define el valor de la propiedad paisDocDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDocDestinatario(String value) {
        this.paisDocDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad paisOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Define el valor de la propiedad paisOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigen(String value) {
        this.paisOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad paisProc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisProc() {
        return paisProc;
    }

    /**
     * Define el valor de la propiedad paisProc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisProc(String value) {
        this.paisProc = value;
    }

    /**
     * Obtiene el valor de la propiedad primeraFraccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeraFraccion() {
        return primeraFraccion;
    }

    /**
     * Define el valor de la propiedad primeraFraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeraFraccion(String value) {
        this.primeraFraccion = value;
    }

    /**
     * Obtiene el valor de la propiedad sujetoControl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSujetoControl() {
        return sujetoControl;
    }

    /**
     * Define el valor de la propiedad sujetoControl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSujetoControl(String value) {
        this.sujetoControl = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocDestinatario() {
        return tipoDocDestinatario;
    }

    /**
     * Define el valor de la propiedad tipoDocDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocDestinatario(String value) {
        this.tipoDocDestinatario = value;
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

    /**
     * Obtiene el valor de la propiedad tipoPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPaquete() {
        return tipoPaquete;
    }

    /**
     * Define el valor de la propiedad tipoPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPaquete(String value) {
        this.tipoPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDol() {
        return valorDol;
    }

    /**
     * Define el valor de la propiedad valorDol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDol(String value) {
        this.valorDol = value;
    }

    /**
     * Obtiene el valor de la propiedad valorMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorMoneda() {
        return valorMoneda;
    }

    /**
     * Define el valor de la propiedad valorMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorMoneda(String value) {
        this.valorMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad valorMonedaPar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorMonedaPar() {
        return valorMonedaPar;
    }

    /**
     * Define el valor de la propiedad valorMonedaPar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorMonedaPar(String value) {
        this.valorMonedaPar = value;
    }

}
