
package py.gov.aduana.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosTituloManifiesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosTituloManifiesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantAfectar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantFaltSobran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUnidadMerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorCombus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="litrosCombus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroBultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partidaCombus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoAfectar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoFaltSobran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoParMerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadMedidaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosTituloManifiesto", propOrder = {
    "cantAfectar",
    "cantFaltSobran",
    "cantPar",
    "cantTotal",
    "codEmbalaje",
    "codUnidadMerc",
    "comentario",
    "condContenedor",
    "descEmbalaje",
    "descripcion",
    "indicadorCombus",
    "litrosCombus",
    "nroBultos",
    "partidaCombus",
    "pesoAfectar",
    "pesoFaltSobran",
    "pesoParMerc",
    "pesoTotal",
    "tipoEmbalaje",
    "tipoMerc",
    "unidadMedidaDesc"
})
public class DatosTituloManifiesto {

    protected String cantAfectar;
    protected String cantFaltSobran;
    protected String cantPar;
    protected String cantTotal;
    protected String codEmbalaje;
    protected String codUnidadMerc;
    protected String comentario;
    protected String condContenedor;
    protected String descEmbalaje;
    protected String descripcion;
    protected String indicadorCombus;
    protected String litrosCombus;
    protected String nroBultos;
    protected String partidaCombus;
    protected String pesoAfectar;
    protected String pesoFaltSobran;
    protected String pesoParMerc;
    protected String pesoTotal;
    protected String tipoEmbalaje;
    protected String tipoMerc;
    protected String unidadMedidaDesc;

    /**
     * Obtiene el valor de la propiedad cantAfectar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantAfectar() {
        return cantAfectar;
    }

    /**
     * Define el valor de la propiedad cantAfectar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantAfectar(String value) {
        this.cantAfectar = value;
    }

    /**
     * Obtiene el valor de la propiedad cantFaltSobran.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantFaltSobran() {
        return cantFaltSobran;
    }

    /**
     * Define el valor de la propiedad cantFaltSobran.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantFaltSobran(String value) {
        this.cantFaltSobran = value;
    }

    /**
     * Obtiene el valor de la propiedad cantPar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantPar() {
        return cantPar;
    }

    /**
     * Define el valor de la propiedad cantPar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantPar(String value) {
        this.cantPar = value;
    }

    /**
     * Obtiene el valor de la propiedad cantTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantTotal() {
        return cantTotal;
    }

    /**
     * Define el valor de la propiedad cantTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantTotal(String value) {
        this.cantTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad codEmbalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEmbalaje() {
        return codEmbalaje;
    }

    /**
     * Define el valor de la propiedad codEmbalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEmbalaje(String value) {
        this.codEmbalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad codUnidadMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUnidadMerc() {
        return codUnidadMerc;
    }

    /**
     * Define el valor de la propiedad codUnidadMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUnidadMerc(String value) {
        this.codUnidadMerc = value;
    }

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
     * Obtiene el valor de la propiedad condContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondContenedor() {
        return condContenedor;
    }

    /**
     * Define el valor de la propiedad condContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondContenedor(String value) {
        this.condContenedor = value;
    }

    /**
     * Obtiene el valor de la propiedad descEmbalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEmbalaje() {
        return descEmbalaje;
    }

    /**
     * Define el valor de la propiedad descEmbalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEmbalaje(String value) {
        this.descEmbalaje = value;
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
     * Obtiene el valor de la propiedad indicadorCombus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorCombus() {
        return indicadorCombus;
    }

    /**
     * Define el valor de la propiedad indicadorCombus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorCombus(String value) {
        this.indicadorCombus = value;
    }

    /**
     * Obtiene el valor de la propiedad litrosCombus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLitrosCombus() {
        return litrosCombus;
    }

    /**
     * Define el valor de la propiedad litrosCombus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLitrosCombus(String value) {
        this.litrosCombus = value;
    }

    /**
     * Obtiene el valor de la propiedad nroBultos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroBultos() {
        return nroBultos;
    }

    /**
     * Define el valor de la propiedad nroBultos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroBultos(String value) {
        this.nroBultos = value;
    }

    /**
     * Obtiene el valor de la propiedad partidaCombus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartidaCombus() {
        return partidaCombus;
    }

    /**
     * Define el valor de la propiedad partidaCombus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartidaCombus(String value) {
        this.partidaCombus = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoAfectar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoAfectar() {
        return pesoAfectar;
    }

    /**
     * Define el valor de la propiedad pesoAfectar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoAfectar(String value) {
        this.pesoAfectar = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoFaltSobran.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoFaltSobran() {
        return pesoFaltSobran;
    }

    /**
     * Define el valor de la propiedad pesoFaltSobran.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoFaltSobran(String value) {
        this.pesoFaltSobran = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoParMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoParMerc() {
        return pesoParMerc;
    }

    /**
     * Define el valor de la propiedad pesoParMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoParMerc(String value) {
        this.pesoParMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoTotal() {
        return pesoTotal;
    }

    /**
     * Define el valor de la propiedad pesoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoTotal(String value) {
        this.pesoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEmbalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    /**
     * Define el valor de la propiedad tipoEmbalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbalaje(String value) {
        this.tipoEmbalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMerc() {
        return tipoMerc;
    }

    /**
     * Define el valor de la propiedad tipoMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMerc(String value) {
        this.tipoMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedidaDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedidaDesc() {
        return unidadMedidaDesc;
    }

    /**
     * Define el valor de la propiedad unidadMedidaDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedidaDesc(String value) {
        this.unidadMedidaDesc = value;
    }

}
