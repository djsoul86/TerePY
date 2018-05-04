
package py.gov.aduana.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the py.gov.aduana.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnularLote_QNAME = new QName("http://aduana.gov.py/webservices", "anularLote");
    private final static QName _ModificarFraccionadoResponse_QNAME = new QName("http://aduana.gov.py/webservices", "modificarFraccionadoResponse");
    private final static QName _IngresoDeposito_QNAME = new QName("http://aduana.gov.py/webservices", "ingresoDeposito");
    private final static QName _ImpresionImpuestoDSResponse_QNAME = new QName("http://aduana.gov.py/webservices", "impresionImpuestoDSResponse");
    private final static QName _IngresoDepositoResponse_QNAME = new QName("http://aduana.gov.py/webservices", "ingresoDepositoResponse");
    private final static QName _ConsultaInfoGuiasResponse_QNAME = new QName("http://aduana.gov.py/webservices", "consultaInfoGuiasResponse");
    private final static QName _ModificarFraccionado_QNAME = new QName("http://aduana.gov.py/webservices", "modificarFraccionado");
    private final static QName _AgregarGuia_QNAME = new QName("http://aduana.gov.py/webservices", "agregarGuia");
    private final static QName _EnviarFacturaResponse_QNAME = new QName("http://aduana.gov.py/webservices", "enviarFacturaResponse");
    private final static QName _AnularLoteResponse_QNAME = new QName("http://aduana.gov.py/webservices", "anularLoteResponse");
    private final static QName _AsignarManifiesto_QNAME = new QName("http://aduana.gov.py/webservices", "asignarManifiesto");
    private final static QName _ConsultaManifiestoResponse_QNAME = new QName("http://aduana.gov.py/webservices", "consultaManifiestoResponse");
    private final static QName _ConsultarListaGuiasResponse_QNAME = new QName("http://aduana.gov.py/webservices", "consultarListaGuiasResponse");
    private final static QName _ConsultaGuia_QNAME = new QName("http://aduana.gov.py/webservices", "consultaGuia");
    private final static QName _AsignarManifiestoResponse_QNAME = new QName("http://aduana.gov.py/webservices", "asignarManifiestoResponse");
    private final static QName _ConsultaManifiesto_QNAME = new QName("http://aduana.gov.py/webservices", "consultaManifiesto");
    private final static QName _AgregarGuiaResponse_QNAME = new QName("http://aduana.gov.py/webservices", "agregarGuiaResponse");
    private final static QName _EnviarFactura_QNAME = new QName("http://aduana.gov.py/webservices", "enviarFactura");
    private final static QName _ImpresionImpuestoDS_QNAME = new QName("http://aduana.gov.py/webservices", "impresionImpuestoDS");
    private final static QName _ConsultaGuiaResponse_QNAME = new QName("http://aduana.gov.py/webservices", "consultaGuiaResponse");
    private final static QName _ConsultaInfoGuias_QNAME = new QName("http://aduana.gov.py/webservices", "consultaInfoGuias");
    private final static QName _ConsultarListaGuias_QNAME = new QName("http://aduana.gov.py/webservices", "consultarListaGuias");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: py.gov.aduana.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaGuiaResponse }
     * 
     */
    public ConsultaGuiaResponse createConsultaGuiaResponse() {
        return new ConsultaGuiaResponse();
    }

    /**
     * Create an instance of {@link ConsultaInfoGuias }
     * 
     */
    public ConsultaInfoGuias createConsultaInfoGuias() {
        return new ConsultaInfoGuias();
    }

    /**
     * Create an instance of {@link ConsultarListaGuias }
     * 
     */
    public ConsultarListaGuias createConsultarListaGuias() {
        return new ConsultarListaGuias();
    }

    /**
     * Create an instance of {@link AgregarGuiaResponse }
     * 
     */
    public AgregarGuiaResponse createAgregarGuiaResponse() {
        return new AgregarGuiaResponse();
    }

    /**
     * Create an instance of {@link EnviarFactura }
     * 
     */
    public EnviarFactura createEnviarFactura() {
        return new EnviarFactura();
    }

    /**
     * Create an instance of {@link ImpresionImpuestoDS }
     * 
     */
    public ImpresionImpuestoDS createImpresionImpuestoDS() {
        return new ImpresionImpuestoDS();
    }

    /**
     * Create an instance of {@link AsignarManifiestoResponse }
     * 
     */
    public AsignarManifiestoResponse createAsignarManifiestoResponse() {
        return new AsignarManifiestoResponse();
    }

    /**
     * Create an instance of {@link ConsultaManifiesto }
     * 
     */
    public ConsultaManifiesto createConsultaManifiesto() {
        return new ConsultaManifiesto();
    }

    /**
     * Create an instance of {@link ConsultaGuia }
     * 
     */
    public ConsultaGuia createConsultaGuia() {
        return new ConsultaGuia();
    }

    /**
     * Create an instance of {@link AsignarManifiesto }
     * 
     */
    public AsignarManifiesto createAsignarManifiesto() {
        return new AsignarManifiesto();
    }

    /**
     * Create an instance of {@link ConsultaManifiestoResponse }
     * 
     */
    public ConsultaManifiestoResponse createConsultaManifiestoResponse() {
        return new ConsultaManifiestoResponse();
    }

    /**
     * Create an instance of {@link ConsultarListaGuiasResponse }
     * 
     */
    public ConsultarListaGuiasResponse createConsultarListaGuiasResponse() {
        return new ConsultarListaGuiasResponse();
    }

    /**
     * Create an instance of {@link AnularLoteResponse }
     * 
     */
    public AnularLoteResponse createAnularLoteResponse() {
        return new AnularLoteResponse();
    }

    /**
     * Create an instance of {@link EnviarFacturaResponse }
     * 
     */
    public EnviarFacturaResponse createEnviarFacturaResponse() {
        return new EnviarFacturaResponse();
    }

    /**
     * Create an instance of {@link AgregarGuia }
     * 
     */
    public AgregarGuia createAgregarGuia() {
        return new AgregarGuia();
    }

    /**
     * Create an instance of {@link ModificarFraccionado }
     * 
     */
    public ModificarFraccionado createModificarFraccionado() {
        return new ModificarFraccionado();
    }

    /**
     * Create an instance of {@link ConsultaInfoGuiasResponse }
     * 
     */
    public ConsultaInfoGuiasResponse createConsultaInfoGuiasResponse() {
        return new ConsultaInfoGuiasResponse();
    }

    /**
     * Create an instance of {@link IngresoDepositoResponse }
     * 
     */
    public IngresoDepositoResponse createIngresoDepositoResponse() {
        return new IngresoDepositoResponse();
    }

    /**
     * Create an instance of {@link ImpresionImpuestoDSResponse }
     * 
     */
    public ImpresionImpuestoDSResponse createImpresionImpuestoDSResponse() {
        return new ImpresionImpuestoDSResponse();
    }

    /**
     * Create an instance of {@link IngresoDeposito }
     * 
     */
    public IngresoDeposito createIngresoDeposito() {
        return new IngresoDeposito();
    }

    /**
     * Create an instance of {@link ModificarFraccionadoResponse }
     * 
     */
    public ModificarFraccionadoResponse createModificarFraccionadoResponse() {
        return new ModificarFraccionadoResponse();
    }

    /**
     * Create an instance of {@link AnularLote }
     * 
     */
    public AnularLote createAnularLote() {
        return new AnularLote();
    }

    /**
     * Create an instance of {@link RetornoConsultaManifiesto }
     * 
     */
    public RetornoConsultaManifiesto createRetornoConsultaManifiesto() {
        return new RetornoConsultaManifiesto();
    }

    /**
     * Create an instance of {@link RetornoConsultaInfoGuias }
     * 
     */
    public RetornoConsultaInfoGuias createRetornoConsultaInfoGuias() {
        return new RetornoConsultaInfoGuias();
    }

    /**
     * Create an instance of {@link Autenticacion }
     * 
     */
    public Autenticacion createAutenticacion() {
        return new Autenticacion();
    }

    /**
     * Create an instance of {@link DatosTituloManifiesto }
     * 
     */
    public DatosTituloManifiesto createDatosTituloManifiesto() {
        return new DatosTituloManifiesto();
    }

    /**
     * Create an instance of {@link RetornoAgregarGuia }
     * 
     */
    public RetornoAgregarGuia createRetornoAgregarGuia() {
        return new RetornoAgregarGuia();
    }

    /**
     * Create an instance of {@link ProrrogaManifiesto }
     * 
     */
    public ProrrogaManifiesto createProrrogaManifiesto() {
        return new ProrrogaManifiesto();
    }

    /**
     * Create an instance of {@link RetornoModificarFraccionado }
     * 
     */
    public RetornoModificarFraccionado createRetornoModificarFraccionado() {
        return new RetornoModificarFraccionado();
    }

    /**
     * Create an instance of {@link RetornoImpresionDSImpuesto }
     * 
     */
    public RetornoImpresionDSImpuesto createRetornoImpresionDSImpuesto() {
        return new RetornoImpresionDSImpuesto();
    }

    /**
     * Create an instance of {@link GuiaHijaConsultaDTO }
     * 
     */
    public GuiaHijaConsultaDTO createGuiaHijaConsultaDTO() {
        return new GuiaHijaConsultaDTO();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link Manifiesto }
     * 
     */
    public Manifiesto createManifiesto() {
        return new Manifiesto();
    }

    /**
     * Create an instance of {@link TereConsultaDTO }
     * 
     */
    public TereConsultaDTO createTereConsultaDTO() {
        return new TereConsultaDTO();
    }

    /**
     * Create an instance of {@link RetornoConsultarListaGuias }
     * 
     */
    public RetornoConsultarListaGuias createRetornoConsultarListaGuias() {
        return new RetornoConsultarListaGuias();
    }

    /**
     * Create an instance of {@link ImpresionDSImpuesto }
     * 
     */
    public ImpresionDSImpuesto createImpresionDSImpuesto() {
        return new ImpresionDSImpuesto();
    }

    /**
     * Create an instance of {@link RetornoTransaccion }
     * 
     */
    public RetornoTransaccion createRetornoTransaccion() {
        return new RetornoTransaccion();
    }

    /**
     * Create an instance of {@link RetornoConsultaGuia }
     * 
     */
    public RetornoConsultaGuia createRetornoConsultaGuia() {
        return new RetornoConsultaGuia();
    }

    /**
     * Create an instance of {@link Recibo }
     * 
     */
    public Recibo createRecibo() {
        return new Recibo();
    }

    /**
     * Create an instance of {@link IdManifiesto }
     * 
     */
    public IdManifiesto createIdManifiesto() {
        return new IdManifiesto();
    }

    /**
     * Create an instance of {@link ContenedorManifiesto }
     * 
     */
    public ContenedorManifiesto createContenedorManifiesto() {
        return new ContenedorManifiesto();
    }

    /**
     * Create an instance of {@link RetornoAnularLote }
     * 
     */
    public RetornoAnularLote createRetornoAnularLote() {
        return new RetornoAnularLote();
    }

    /**
     * Create an instance of {@link GuiaMadre }
     * 
     */
    public GuiaMadre createGuiaMadre() {
        return new GuiaMadre();
    }

    /**
     * Create an instance of {@link Linea }
     * 
     */
    public Linea createLinea() {
        return new Linea();
    }

    /**
     * Create an instance of {@link RetornoAsignarManifiesto }
     * 
     */
    public RetornoAsignarManifiesto createRetornoAsignarManifiesto() {
        return new RetornoAsignarManifiesto();
    }

    /**
     * Create an instance of {@link IntervencionManifiesto }
     * 
     */
    public IntervencionManifiesto createIntervencionManifiesto() {
        return new IntervencionManifiesto();
    }

    /**
     * Create an instance of {@link GuiaHija }
     * 
     */
    public GuiaHija createGuiaHija() {
        return new GuiaHija();
    }

    /**
     * Create an instance of {@link FacturaPDF }
     * 
     */
    public FacturaPDF createFacturaPDF() {
        return new FacturaPDF();
    }

    /**
     * Create an instance of {@link DespachoManifiesto }
     * 
     */
    public DespachoManifiesto createDespachoManifiesto() {
        return new DespachoManifiesto();
    }

    /**
     * Create an instance of {@link TereFilterDTO }
     * 
     */
    public TereFilterDTO createTereFilterDTO() {
        return new TereFilterDTO();
    }

    /**
     * Create an instance of {@link FiltroConsultaDSImpuesto }
     * 
     */
    public FiltroConsultaDSImpuesto createFiltroConsultaDSImpuesto() {
        return new FiltroConsultaDSImpuesto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularLote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "anularLote")
    public JAXBElement<AnularLote> createAnularLote(AnularLote value) {
        return new JAXBElement<AnularLote>(_AnularLote_QNAME, AnularLote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarFraccionadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "modificarFraccionadoResponse")
    public JAXBElement<ModificarFraccionadoResponse> createModificarFraccionadoResponse(ModificarFraccionadoResponse value) {
        return new JAXBElement<ModificarFraccionadoResponse>(_ModificarFraccionadoResponse_QNAME, ModificarFraccionadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoDeposito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "ingresoDeposito")
    public JAXBElement<IngresoDeposito> createIngresoDeposito(IngresoDeposito value) {
        return new JAXBElement<IngresoDeposito>(_IngresoDeposito_QNAME, IngresoDeposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpresionImpuestoDSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "impresionImpuestoDSResponse")
    public JAXBElement<ImpresionImpuestoDSResponse> createImpresionImpuestoDSResponse(ImpresionImpuestoDSResponse value) {
        return new JAXBElement<ImpresionImpuestoDSResponse>(_ImpresionImpuestoDSResponse_QNAME, ImpresionImpuestoDSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoDepositoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "ingresoDepositoResponse")
    public JAXBElement<IngresoDepositoResponse> createIngresoDepositoResponse(IngresoDepositoResponse value) {
        return new JAXBElement<IngresoDepositoResponse>(_IngresoDepositoResponse_QNAME, IngresoDepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaInfoGuiasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultaInfoGuiasResponse")
    public JAXBElement<ConsultaInfoGuiasResponse> createConsultaInfoGuiasResponse(ConsultaInfoGuiasResponse value) {
        return new JAXBElement<ConsultaInfoGuiasResponse>(_ConsultaInfoGuiasResponse_QNAME, ConsultaInfoGuiasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarFraccionado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "modificarFraccionado")
    public JAXBElement<ModificarFraccionado> createModificarFraccionado(ModificarFraccionado value) {
        return new JAXBElement<ModificarFraccionado>(_ModificarFraccionado_QNAME, ModificarFraccionado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarGuia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "agregarGuia")
    public JAXBElement<AgregarGuia> createAgregarGuia(AgregarGuia value) {
        return new JAXBElement<AgregarGuia>(_AgregarGuia_QNAME, AgregarGuia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "enviarFacturaResponse")
    public JAXBElement<EnviarFacturaResponse> createEnviarFacturaResponse(EnviarFacturaResponse value) {
        return new JAXBElement<EnviarFacturaResponse>(_EnviarFacturaResponse_QNAME, EnviarFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularLoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "anularLoteResponse")
    public JAXBElement<AnularLoteResponse> createAnularLoteResponse(AnularLoteResponse value) {
        return new JAXBElement<AnularLoteResponse>(_AnularLoteResponse_QNAME, AnularLoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarManifiesto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "asignarManifiesto")
    public JAXBElement<AsignarManifiesto> createAsignarManifiesto(AsignarManifiesto value) {
        return new JAXBElement<AsignarManifiesto>(_AsignarManifiesto_QNAME, AsignarManifiesto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaManifiestoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultaManifiestoResponse")
    public JAXBElement<ConsultaManifiestoResponse> createConsultaManifiestoResponse(ConsultaManifiestoResponse value) {
        return new JAXBElement<ConsultaManifiestoResponse>(_ConsultaManifiestoResponse_QNAME, ConsultaManifiestoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaGuiasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultarListaGuiasResponse")
    public JAXBElement<ConsultarListaGuiasResponse> createConsultarListaGuiasResponse(ConsultarListaGuiasResponse value) {
        return new JAXBElement<ConsultarListaGuiasResponse>(_ConsultarListaGuiasResponse_QNAME, ConsultarListaGuiasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaGuia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultaGuia")
    public JAXBElement<ConsultaGuia> createConsultaGuia(ConsultaGuia value) {
        return new JAXBElement<ConsultaGuia>(_ConsultaGuia_QNAME, ConsultaGuia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarManifiestoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "asignarManifiestoResponse")
    public JAXBElement<AsignarManifiestoResponse> createAsignarManifiestoResponse(AsignarManifiestoResponse value) {
        return new JAXBElement<AsignarManifiestoResponse>(_AsignarManifiestoResponse_QNAME, AsignarManifiestoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaManifiesto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultaManifiesto")
    public JAXBElement<ConsultaManifiesto> createConsultaManifiesto(ConsultaManifiesto value) {
        return new JAXBElement<ConsultaManifiesto>(_ConsultaManifiesto_QNAME, ConsultaManifiesto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarGuiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "agregarGuiaResponse")
    public JAXBElement<AgregarGuiaResponse> createAgregarGuiaResponse(AgregarGuiaResponse value) {
        return new JAXBElement<AgregarGuiaResponse>(_AgregarGuiaResponse_QNAME, AgregarGuiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "enviarFactura")
    public JAXBElement<EnviarFactura> createEnviarFactura(EnviarFactura value) {
        return new JAXBElement<EnviarFactura>(_EnviarFactura_QNAME, EnviarFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpresionImpuestoDS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "impresionImpuestoDS")
    public JAXBElement<ImpresionImpuestoDS> createImpresionImpuestoDS(ImpresionImpuestoDS value) {
        return new JAXBElement<ImpresionImpuestoDS>(_ImpresionImpuestoDS_QNAME, ImpresionImpuestoDS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaGuiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultaGuiaResponse")
    public JAXBElement<ConsultaGuiaResponse> createConsultaGuiaResponse(ConsultaGuiaResponse value) {
        return new JAXBElement<ConsultaGuiaResponse>(_ConsultaGuiaResponse_QNAME, ConsultaGuiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaInfoGuias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultaInfoGuias")
    public JAXBElement<ConsultaInfoGuias> createConsultaInfoGuias(ConsultaInfoGuias value) {
        return new JAXBElement<ConsultaInfoGuias>(_ConsultaInfoGuias_QNAME, ConsultaInfoGuias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaGuias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aduana.gov.py/webservices", name = "consultarListaGuias")
    public JAXBElement<ConsultarListaGuias> createConsultarListaGuias(ConsultarListaGuias value) {
        return new JAXBElement<ConsultarListaGuias>(_ConsultarListaGuias_QNAME, ConsultarListaGuias.class, null, value);
    }

}
