
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para manifiesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="manifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeroProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avionCarg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenedores" type="{http://aduana.gov.py/webservices}contenedorManifiesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datosTransportista" type="{http://aduana.gov.py/webservices}intervencionManifiesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descHab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desconsolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despachos" type="{http://aduana.gov.py/webservices}despachoManifiesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaArribo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSofia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intervenciones" type="{http://aduana.gov.py/webservices}intervencionManifiesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medioTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mercBodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plazoRezago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prorrogas" type="{http://aduana.gov.py/webservices}prorrogaManifiesto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoOp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transpVacio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifiesto", propOrder = {
    "aeroProc",
    "avionCarg",
    "comentarios",
    "contenedores",
    "datosTransportista",
    "descHab",
    "desconsolidado",
    "despachos",
    "documento",
    "estado",
    "fechaArribo",
    "fechaDescarga",
    "fechaReg",
    "idSofia",
    "intervenciones",
    "medioTrans",
    "mercBodo",
    "paisProc",
    "paisTrans",
    "plazoRezago",
    "prorrogas",
    "tipoOp",
    "transpVacio",
    "transportista"
})
public class Manifiesto {

    protected String aeroProc;
    protected String avionCarg;
    protected String comentarios;
    @XmlElement(nillable = true)
    protected List<ContenedorManifiesto> contenedores;
    @XmlElement(nillable = true)
    protected List<IntervencionManifiesto> datosTransportista;
    protected String descHab;
    protected String desconsolidado;
    @XmlElement(nillable = true)
    protected List<DespachoManifiesto> despachos;
    protected String documento;
    protected String estado;
    protected String fechaArribo;
    protected String fechaDescarga;
    protected String fechaReg;
    protected String idSofia;
    @XmlElement(nillable = true)
    protected List<IntervencionManifiesto> intervenciones;
    protected String medioTrans;
    protected String mercBodo;
    protected String paisProc;
    protected String paisTrans;
    protected String plazoRezago;
    @XmlElement(nillable = true)
    protected List<ProrrogaManifiesto> prorrogas;
    protected String tipoOp;
    protected String transpVacio;
    protected String transportista;

    /**
     * Obtiene el valor de la propiedad aeroProc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeroProc() {
        return aeroProc;
    }

    /**
     * Define el valor de la propiedad aeroProc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeroProc(String value) {
        this.aeroProc = value;
    }

    /**
     * Obtiene el valor de la propiedad avionCarg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvionCarg() {
        return avionCarg;
    }

    /**
     * Define el valor de la propiedad avionCarg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvionCarg(String value) {
        this.avionCarg = value;
    }

    /**
     * Obtiene el valor de la propiedad comentarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Define el valor de la propiedad comentarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Gets the value of the contenedores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContenedorManifiesto }
     * 
     * 
     */
    public List<ContenedorManifiesto> getContenedores() {
        if (contenedores == null) {
            contenedores = new ArrayList<ContenedorManifiesto>();
        }
        return this.contenedores;
    }

    /**
     * Gets the value of the datosTransportista property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosTransportista property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosTransportista().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervencionManifiesto }
     * 
     * 
     */
    public List<IntervencionManifiesto> getDatosTransportista() {
        if (datosTransportista == null) {
            datosTransportista = new ArrayList<IntervencionManifiesto>();
        }
        return this.datosTransportista;
    }

    /**
     * Obtiene el valor de la propiedad descHab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescHab() {
        return descHab;
    }

    /**
     * Define el valor de la propiedad descHab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescHab(String value) {
        this.descHab = value;
    }

    /**
     * Obtiene el valor de la propiedad desconsolidado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesconsolidado() {
        return desconsolidado;
    }

    /**
     * Define el valor de la propiedad desconsolidado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesconsolidado(String value) {
        this.desconsolidado = value;
    }

    /**
     * Gets the value of the despachos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despachos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespachos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DespachoManifiesto }
     * 
     * 
     */
    public List<DespachoManifiesto> getDespachos() {
        if (despachos == null) {
            despachos = new ArrayList<DespachoManifiesto>();
        }
        return this.despachos;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaArribo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaArribo() {
        return fechaArribo;
    }

    /**
     * Define el valor de la propiedad fechaArribo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaArribo(String value) {
        this.fechaArribo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDescarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDescarga() {
        return fechaDescarga;
    }

    /**
     * Define el valor de la propiedad fechaDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDescarga(String value) {
        this.fechaDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaReg() {
        return fechaReg;
    }

    /**
     * Define el valor de la propiedad fechaReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaReg(String value) {
        this.fechaReg = value;
    }

    /**
     * Obtiene el valor de la propiedad idSofia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSofia() {
        return idSofia;
    }

    /**
     * Define el valor de la propiedad idSofia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSofia(String value) {
        this.idSofia = value;
    }

    /**
     * Gets the value of the intervenciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervenciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervenciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervencionManifiesto }
     * 
     * 
     */
    public List<IntervencionManifiesto> getIntervenciones() {
        if (intervenciones == null) {
            intervenciones = new ArrayList<IntervencionManifiesto>();
        }
        return this.intervenciones;
    }

    /**
     * Obtiene el valor de la propiedad medioTrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioTrans() {
        return medioTrans;
    }

    /**
     * Define el valor de la propiedad medioTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioTrans(String value) {
        this.medioTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad mercBodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercBodo() {
        return mercBodo;
    }

    /**
     * Define el valor de la propiedad mercBodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercBodo(String value) {
        this.mercBodo = value;
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

    /**
     * Obtiene el valor de la propiedad plazoRezago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazoRezago() {
        return plazoRezago;
    }

    /**
     * Define el valor de la propiedad plazoRezago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazoRezago(String value) {
        this.plazoRezago = value;
    }

    /**
     * Gets the value of the prorrogas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prorrogas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProrrogas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProrrogaManifiesto }
     * 
     * 
     */
    public List<ProrrogaManifiesto> getProrrogas() {
        if (prorrogas == null) {
            prorrogas = new ArrayList<ProrrogaManifiesto>();
        }
        return this.prorrogas;
    }

    /**
     * Obtiene el valor de la propiedad tipoOp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOp() {
        return tipoOp;
    }

    /**
     * Define el valor de la propiedad tipoOp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOp(String value) {
        this.tipoOp = value;
    }

    /**
     * Obtiene el valor de la propiedad transpVacio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranspVacio() {
        return transpVacio;
    }

    /**
     * Define el valor de la propiedad transpVacio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranspVacio(String value) {
        this.transpVacio = value;
    }

    /**
     * Obtiene el valor de la propiedad transportista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportista() {
        return transportista;
    }

    /**
     * Define el valor de la propiedad transportista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportista(String value) {
        this.transportista = value;
    }

}
