
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guiaMadre complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guiaMadre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroVuelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guiasHija" type="{http://aduana.gov.py/webservices}guiaHija" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idLoteRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisCodProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisMedTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaMadre", propOrder = {
    "codAduana",
    "codEmpresa",
    "nroVuelo",
    "fecArribo",
    "guiasHija",
    "idLoteRemesa",
    "medio",
    "paisCodProc",
    "paisMedTrans",
    "paisTrans"
})
public class GuiaMadre {

    protected String codAduana;
    protected String codEmpresa;
    protected String nroVuelo;
    protected String fecArribo;
    @XmlElement(nillable = true)
    protected List<GuiaHija> guiasHija;
    protected String idLoteRemesa;
    protected String medio;
    protected String paisCodProc;
    protected String paisMedTrans;
    protected String paisTrans;

    /**
     * Obtiene el valor de la propiedad codAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAduana() {
        return codAduana;
    }

    /**
     * Define el valor de la propiedad codAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAduana(String value) {
        this.codAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad codEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEmpresa() {
        return codEmpresa;
    }

    /**
     * Define el valor de la propiedad codEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEmpresa(String value) {
        this.codEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nroVuelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroVuelo() {
        return nroVuelo;
    }

    /**
     * Define el valor de la propiedad nroVuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroVuelo(String value) {
        this.nroVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad fecArribo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecArribo() {
        return fecArribo;
    }

    /**
     * Define el valor de la propiedad fecArribo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecArribo(String value) {
        this.fecArribo = value;
    }

    /**
     * Gets the value of the guiasHija property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiasHija property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiasHija().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuiaHija }
     * 
     * 
     */
    public List<GuiaHija> getGuiasHija() {
        if (guiasHija == null) {
            guiasHija = new ArrayList<GuiaHija>();
        }
        return this.guiasHija;
    }

    /**
     * Obtiene el valor de la propiedad idLoteRemesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLoteRemesa() {
        return idLoteRemesa;
    }

    /**
     * Define el valor de la propiedad idLoteRemesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLoteRemesa(String value) {
        this.idLoteRemesa = value;
    }

    /**
     * Obtiene el valor de la propiedad medio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedio() {
        return medio;
    }

    /**
     * Define el valor de la propiedad medio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedio(String value) {
        this.medio = value;
    }

    /**
     * Obtiene el valor de la propiedad paisCodProc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisCodProc() {
        return paisCodProc;
    }

    /**
     * Define el valor de la propiedad paisCodProc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisCodProc(String value) {
        this.paisCodProc = value;
    }

    /**
     * Obtiene el valor de la propiedad paisMedTrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisMedTrans() {
        return paisMedTrans;
    }

    /**
     * Define el valor de la propiedad paisMedTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisMedTrans(String value) {
        this.paisMedTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad paisTrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisTrans() {
        return paisTrans;
    }

    /**
     * Define el valor de la propiedad paisTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisTrans(String value) {
        this.paisTrans = value;
    }

}
