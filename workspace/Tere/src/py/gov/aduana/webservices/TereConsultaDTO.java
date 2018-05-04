
package py.gov.aduana.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tereConsultaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tereConsultaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guias" type="{http://aduana.gov.py/webservices}guiaHijaConsultaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idsofia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tereConsultaDTO", propOrder = {
    "guias",
    "idsofia"
})
public class TereConsultaDTO {

    @XmlElement(nillable = true)
    protected List<GuiaHijaConsultaDTO> guias;
    protected String idsofia;

    /**
     * Gets the value of the guias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuiaHijaConsultaDTO }
     * 
     * 
     */
    public List<GuiaHijaConsultaDTO> getGuias() {
        if (guias == null) {
            guias = new ArrayList<GuiaHijaConsultaDTO>();
        }
        return this.guias;
    }

    /**
     * Obtiene el valor de la propiedad idsofia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsofia() {
        return idsofia;
    }

    /**
     * Define el valor de la propiedad idsofia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsofia(String value) {
        this.idsofia = value;
    }

}
