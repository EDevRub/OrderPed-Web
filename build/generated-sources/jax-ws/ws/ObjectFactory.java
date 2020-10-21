
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _ActualizarPedidoAEntregado_QNAME = new QName("http://webservice/", "actualizarPedidoAEntregado");
    private final static QName _ActualizarPedidoAEntregadoResponse_QNAME = new QName("http://webservice/", "actualizarPedidoAEntregadoResponse");
    private final static QName _AgregarPedido_QNAME = new QName("http://webservice/", "agregarPedido");
    private final static QName _AgregarPedidoResponse_QNAME = new QName("http://webservice/", "agregarPedidoResponse");
    private final static QName _CambiarEstadoPedido_QNAME = new QName("http://webservice/", "cambiarEstadoPedido");
    private final static QName _CambiarEstadoPedidoAListo_QNAME = new QName("http://webservice/", "cambiarEstadoPedidoAListo");
    private final static QName _CambiarEstadoPedidoAListoResponse_QNAME = new QName("http://webservice/", "cambiarEstadoPedidoAListoResponse");
    private final static QName _CambiarEstadoPedidoResponse_QNAME = new QName("http://webservice/", "cambiarEstadoPedidoResponse");
    private final static QName _CantPedBuenosMIN_QNAME = new QName("http://webservice/", "cantPedBuenosMIN");
    private final static QName _CantPedBuenosMINFiltrados_QNAME = new QName("http://webservice/", "cantPedBuenosMINFiltrados");
    private final static QName _CantPedBuenosMINFiltradosResponse_QNAME = new QName("http://webservice/", "cantPedBuenosMINFiltradosResponse");
    private final static QName _CantPedBuenosMINResponse_QNAME = new QName("http://webservice/", "cantPedBuenosMINResponse");
    private final static QName _CantPedBuenosSEG_QNAME = new QName("http://webservice/", "cantPedBuenosSEG");
    private final static QName _CantPedBuenosSEGFiltrados_QNAME = new QName("http://webservice/", "cantPedBuenosSEGFiltrados");
    private final static QName _CantPedBuenosSEGFiltradosResponse_QNAME = new QName("http://webservice/", "cantPedBuenosSEGFiltradosResponse");
    private final static QName _CantPedBuenosSEGResponse_QNAME = new QName("http://webservice/", "cantPedBuenosSEGResponse");
    private final static QName _CantPedMalosMIN_QNAME = new QName("http://webservice/", "cantPedMalosMIN");
    private final static QName _CantPedMalosMINFiltrados_QNAME = new QName("http://webservice/", "cantPedMalosMINFiltrados");
    private final static QName _CantPedMalosMINFiltradosResponse_QNAME = new QName("http://webservice/", "cantPedMalosMINFiltradosResponse");
    private final static QName _CantPedMalosMINResponse_QNAME = new QName("http://webservice/", "cantPedMalosMINResponse");
    private final static QName _CantPedMalosSEGFiltrados_QNAME = new QName("http://webservice/", "cantPedMalosSEGFiltrados");
    private final static QName _CantPedMalosSEGFiltradosResponse_QNAME = new QName("http://webservice/", "cantPedMalosSEGFiltradosResponse");
    private final static QName _CantPedMalosSeg_QNAME = new QName("http://webservice/", "cantPedMalosSeg");
    private final static QName _CantPedMalosSegResponse_QNAME = new QName("http://webservice/", "cantPedMalosSegResponse");
    private final static QName _GetEstadoPedidoCliente_QNAME = new QName("http://webservice/", "getEstadoPedidoCliente");
    private final static QName _GetEstadoPedidoClienteResponse_QNAME = new QName("http://webservice/", "getEstadoPedidoClienteResponse");
    private final static QName _GetHistorialPedidos_QNAME = new QName("http://webservice/", "getHistorialPedidos");
    private final static QName _GetHistorialPedidosFiltrados_QNAME = new QName("http://webservice/", "getHistorialPedidosFiltrados");
    private final static QName _GetHistorialPedidosFiltradosResponse_QNAME = new QName("http://webservice/", "getHistorialPedidosFiltradosResponse");
    private final static QName _GetHistorialPedidosResponse_QNAME = new QName("http://webservice/", "getHistorialPedidosResponse");
    private final static QName _GetHoraDeEspera_QNAME = new QName("http://webservice/", "getHoraDeEspera");
    private final static QName _GetHoraDeEsperaResponse_QNAME = new QName("http://webservice/", "getHoraDeEsperaResponse");
    private final static QName _GetHoraRegistro_QNAME = new QName("http://webservice/", "getHoraRegistro");
    private final static QName _GetHoraRegistroResponse_QNAME = new QName("http://webservice/", "getHoraRegistroResponse");
    private final static QName _GetMinDeEspera_QNAME = new QName("http://webservice/", "getMinDeEspera");
    private final static QName _GetMinDeEsperaResponse_QNAME = new QName("http://webservice/", "getMinDeEsperaResponse");
    private final static QName _GetNumTotalPedidos_QNAME = new QName("http://webservice/", "getNumTotalPedidos");
    private final static QName _GetNumTotalPedidosResponse_QNAME = new QName("http://webservice/", "getNumTotalPedidosResponse");
    private final static QName _GetPromHoraFiltrada_QNAME = new QName("http://webservice/", "getPromHoraFiltrada");
    private final static QName _GetPromHoraFiltradaResponse_QNAME = new QName("http://webservice/", "getPromHoraFiltradaResponse");
    private final static QName _GetPromMinFiltrado_QNAME = new QName("http://webservice/", "getPromMinFiltrado");
    private final static QName _GetPromMinFiltradoResponse_QNAME = new QName("http://webservice/", "getPromMinFiltradoResponse");
    private final static QName _GetPromSegFiltrado_QNAME = new QName("http://webservice/", "getPromSegFiltrado");
    private final static QName _GetPromSegFiltradoResponse_QNAME = new QName("http://webservice/", "getPromSegFiltradoResponse");
    private final static QName _GetPromedioDeHoras_QNAME = new QName("http://webservice/", "getPromedioDeHoras");
    private final static QName _GetPromedioDeHorasResponse_QNAME = new QName("http://webservice/", "getPromedioDeHorasResponse");
    private final static QName _GetPromedioDeMinutos_QNAME = new QName("http://webservice/", "getPromedioDeMinutos");
    private final static QName _GetPromedioDeMinutosResponse_QNAME = new QName("http://webservice/", "getPromedioDeMinutosResponse");
    private final static QName _GetPromedioDeSegundos_QNAME = new QName("http://webservice/", "getPromedioDeSegundos");
    private final static QName _GetPromedioDeSegundosResponse_QNAME = new QName("http://webservice/", "getPromedioDeSegundosResponse");
    private final static QName _GetSegDeEspera_QNAME = new QName("http://webservice/", "getSegDeEspera");
    private final static QName _GetSegDeEsperaResponse_QNAME = new QName("http://webservice/", "getSegDeEsperaResponse");
    private final static QName _GetTotalDePedidosFiltrado_QNAME = new QName("http://webservice/", "getTotalDePedidosFiltrado");
    private final static QName _GetTotalDePedidosFiltradoResponse_QNAME = new QName("http://webservice/", "getTotalDePedidosFiltradoResponse");
    private final static QName _HoraRegPed_QNAME = new QName("http://webservice/", "horaRegPed");
    private final static QName _HoraRegPedResponse_QNAME = new QName("http://webservice/", "horaRegPedResponse");
    private final static QName _HoraRegistroPedido_QNAME = new QName("http://webservice/", "horaRegistroPedido");
    private final static QName _HoraRegistroPedidoResponse_QNAME = new QName("http://webservice/", "horaRegistroPedidoResponse");
    private final static QName _IdCargoPersona_QNAME = new QName("http://webservice/", "id_CargoPersona");
    private final static QName _IdCargoPersonaResponse_QNAME = new QName("http://webservice/", "id_CargoPersonaResponse");
    private final static QName _Ingresar_QNAME = new QName("http://webservice/", "ingresar");
    private final static QName _IngresarResponse_QNAME = new QName("http://webservice/", "ingresarResponse");
    private final static QName _IngresoDeCliente_QNAME = new QName("http://webservice/", "ingresoDeCliente");
    private final static QName _IngresoDeClienteResponse_QNAME = new QName("http://webservice/", "ingresoDeClienteResponse");
    private final static QName _MinutoRegPed_QNAME = new QName("http://webservice/", "minutoRegPed");
    private final static QName _MinutoRegPedResponse_QNAME = new QName("http://webservice/", "minutoRegPedResponse");
    private final static QName _NombreCliente_QNAME = new QName("http://webservice/", "nombreCliente");
    private final static QName _NombreClienteResponse_QNAME = new QName("http://webservice/", "nombreClienteResponse");
    private final static QName _NumCantPedidosHoy_QNAME = new QName("http://webservice/", "numCantPedidosHoy");
    private final static QName _NumCantPedidosHoyResponse_QNAME = new QName("http://webservice/", "numCantPedidosHoyResponse");
    private final static QName _NumPedido_QNAME = new QName("http://webservice/", "numPedido");
    private final static QName _NumPedidoResponse_QNAME = new QName("http://webservice/", "numPedidoResponse");
    private final static QName _NumTotalDePersonas_QNAME = new QName("http://webservice/", "numTotalDePersonas");
    private final static QName _NumTotalDePersonasResponse_QNAME = new QName("http://webservice/", "numTotalDePersonasResponse");
    private final static QName _PedidosDeHoy_QNAME = new QName("http://webservice/", "pedidosDeHoy");
    private final static QName _PedidosDeHoyResponse_QNAME = new QName("http://webservice/", "pedidosDeHoyResponse");
    private final static QName _PedidosPorFecha_QNAME = new QName("http://webservice/", "pedidosPorFecha");
    private final static QName _PedidosPorFechaResponse_QNAME = new QName("http://webservice/", "pedidosPorFechaResponse");
    private final static QName _RegistrarHistorialPedidos_QNAME = new QName("http://webservice/", "registrarHistorialPedidos");
    private final static QName _RegistrarHistorialPedidosResponse_QNAME = new QName("http://webservice/", "registrarHistorialPedidosResponse");
    private final static QName _RegistrarPersonal_QNAME = new QName("http://webservice/", "registrarPersonal");
    private final static QName _RegistrarPersonalResponse_QNAME = new QName("http://webservice/", "registrarPersonalResponse");
    private final static QName _SegundoRegPed_QNAME = new QName("http://webservice/", "segundoRegPed");
    private final static QName _SegundoRegPedResponse_QNAME = new QName("http://webservice/", "segundoRegPedResponse");
    private final static QName _TodasLasPersonas_QNAME = new QName("http://webservice/", "todasLasPersonas");
    private final static QName _TodasLasPersonasResponse_QNAME = new QName("http://webservice/", "todasLasPersonasResponse");
    private final static QName _TodosLosPedidos_QNAME = new QName("http://webservice/", "todosLosPedidos");
    private final static QName _TodosLosPedidosResponse_QNAME = new QName("http://webservice/", "todosLosPedidosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarPedidoAEntregado }
     * 
     */
    public ActualizarPedidoAEntregado createActualizarPedidoAEntregado() {
        return new ActualizarPedidoAEntregado();
    }

    /**
     * Create an instance of {@link ActualizarPedidoAEntregadoResponse }
     * 
     */
    public ActualizarPedidoAEntregadoResponse createActualizarPedidoAEntregadoResponse() {
        return new ActualizarPedidoAEntregadoResponse();
    }

    /**
     * Create an instance of {@link AgregarPedido }
     * 
     */
    public AgregarPedido createAgregarPedido() {
        return new AgregarPedido();
    }

    /**
     * Create an instance of {@link AgregarPedidoResponse }
     * 
     */
    public AgregarPedidoResponse createAgregarPedidoResponse() {
        return new AgregarPedidoResponse();
    }

    /**
     * Create an instance of {@link CambiarEstadoPedido }
     * 
     */
    public CambiarEstadoPedido createCambiarEstadoPedido() {
        return new CambiarEstadoPedido();
    }

    /**
     * Create an instance of {@link CambiarEstadoPedidoAListo }
     * 
     */
    public CambiarEstadoPedidoAListo createCambiarEstadoPedidoAListo() {
        return new CambiarEstadoPedidoAListo();
    }

    /**
     * Create an instance of {@link CambiarEstadoPedidoAListoResponse }
     * 
     */
    public CambiarEstadoPedidoAListoResponse createCambiarEstadoPedidoAListoResponse() {
        return new CambiarEstadoPedidoAListoResponse();
    }

    /**
     * Create an instance of {@link CambiarEstadoPedidoResponse }
     * 
     */
    public CambiarEstadoPedidoResponse createCambiarEstadoPedidoResponse() {
        return new CambiarEstadoPedidoResponse();
    }

    /**
     * Create an instance of {@link CantPedBuenosMIN }
     * 
     */
    public CantPedBuenosMIN createCantPedBuenosMIN() {
        return new CantPedBuenosMIN();
    }

    /**
     * Create an instance of {@link CantPedBuenosMINFiltrados }
     * 
     */
    public CantPedBuenosMINFiltrados createCantPedBuenosMINFiltrados() {
        return new CantPedBuenosMINFiltrados();
    }

    /**
     * Create an instance of {@link CantPedBuenosMINFiltradosResponse }
     * 
     */
    public CantPedBuenosMINFiltradosResponse createCantPedBuenosMINFiltradosResponse() {
        return new CantPedBuenosMINFiltradosResponse();
    }

    /**
     * Create an instance of {@link CantPedBuenosMINResponse }
     * 
     */
    public CantPedBuenosMINResponse createCantPedBuenosMINResponse() {
        return new CantPedBuenosMINResponse();
    }

    /**
     * Create an instance of {@link CantPedBuenosSEG }
     * 
     */
    public CantPedBuenosSEG createCantPedBuenosSEG() {
        return new CantPedBuenosSEG();
    }

    /**
     * Create an instance of {@link CantPedBuenosSEGFiltrados }
     * 
     */
    public CantPedBuenosSEGFiltrados createCantPedBuenosSEGFiltrados() {
        return new CantPedBuenosSEGFiltrados();
    }

    /**
     * Create an instance of {@link CantPedBuenosSEGFiltradosResponse }
     * 
     */
    public CantPedBuenosSEGFiltradosResponse createCantPedBuenosSEGFiltradosResponse() {
        return new CantPedBuenosSEGFiltradosResponse();
    }

    /**
     * Create an instance of {@link CantPedBuenosSEGResponse }
     * 
     */
    public CantPedBuenosSEGResponse createCantPedBuenosSEGResponse() {
        return new CantPedBuenosSEGResponse();
    }

    /**
     * Create an instance of {@link CantPedMalosMIN }
     * 
     */
    public CantPedMalosMIN createCantPedMalosMIN() {
        return new CantPedMalosMIN();
    }

    /**
     * Create an instance of {@link CantPedMalosMINFiltrados }
     * 
     */
    public CantPedMalosMINFiltrados createCantPedMalosMINFiltrados() {
        return new CantPedMalosMINFiltrados();
    }

    /**
     * Create an instance of {@link CantPedMalosMINFiltradosResponse }
     * 
     */
    public CantPedMalosMINFiltradosResponse createCantPedMalosMINFiltradosResponse() {
        return new CantPedMalosMINFiltradosResponse();
    }

    /**
     * Create an instance of {@link CantPedMalosMINResponse }
     * 
     */
    public CantPedMalosMINResponse createCantPedMalosMINResponse() {
        return new CantPedMalosMINResponse();
    }

    /**
     * Create an instance of {@link CantPedMalosSEGFiltrados }
     * 
     */
    public CantPedMalosSEGFiltrados createCantPedMalosSEGFiltrados() {
        return new CantPedMalosSEGFiltrados();
    }

    /**
     * Create an instance of {@link CantPedMalosSEGFiltradosResponse }
     * 
     */
    public CantPedMalosSEGFiltradosResponse createCantPedMalosSEGFiltradosResponse() {
        return new CantPedMalosSEGFiltradosResponse();
    }

    /**
     * Create an instance of {@link CantPedMalosSeg }
     * 
     */
    public CantPedMalosSeg createCantPedMalosSeg() {
        return new CantPedMalosSeg();
    }

    /**
     * Create an instance of {@link CantPedMalosSegResponse }
     * 
     */
    public CantPedMalosSegResponse createCantPedMalosSegResponse() {
        return new CantPedMalosSegResponse();
    }

    /**
     * Create an instance of {@link GetEstadoPedidoCliente }
     * 
     */
    public GetEstadoPedidoCliente createGetEstadoPedidoCliente() {
        return new GetEstadoPedidoCliente();
    }

    /**
     * Create an instance of {@link GetEstadoPedidoClienteResponse }
     * 
     */
    public GetEstadoPedidoClienteResponse createGetEstadoPedidoClienteResponse() {
        return new GetEstadoPedidoClienteResponse();
    }

    /**
     * Create an instance of {@link GetHistorialPedidos }
     * 
     */
    public GetHistorialPedidos createGetHistorialPedidos() {
        return new GetHistorialPedidos();
    }

    /**
     * Create an instance of {@link GetHistorialPedidosFiltrados }
     * 
     */
    public GetHistorialPedidosFiltrados createGetHistorialPedidosFiltrados() {
        return new GetHistorialPedidosFiltrados();
    }

    /**
     * Create an instance of {@link GetHistorialPedidosFiltradosResponse }
     * 
     */
    public GetHistorialPedidosFiltradosResponse createGetHistorialPedidosFiltradosResponse() {
        return new GetHistorialPedidosFiltradosResponse();
    }

    /**
     * Create an instance of {@link GetHistorialPedidosResponse }
     * 
     */
    public GetHistorialPedidosResponse createGetHistorialPedidosResponse() {
        return new GetHistorialPedidosResponse();
    }

    /**
     * Create an instance of {@link GetHoraDeEspera }
     * 
     */
    public GetHoraDeEspera createGetHoraDeEspera() {
        return new GetHoraDeEspera();
    }

    /**
     * Create an instance of {@link GetHoraDeEsperaResponse }
     * 
     */
    public GetHoraDeEsperaResponse createGetHoraDeEsperaResponse() {
        return new GetHoraDeEsperaResponse();
    }

    /**
     * Create an instance of {@link GetHoraRegistro }
     * 
     */
    public GetHoraRegistro createGetHoraRegistro() {
        return new GetHoraRegistro();
    }

    /**
     * Create an instance of {@link GetHoraRegistroResponse }
     * 
     */
    public GetHoraRegistroResponse createGetHoraRegistroResponse() {
        return new GetHoraRegistroResponse();
    }

    /**
     * Create an instance of {@link GetMinDeEspera }
     * 
     */
    public GetMinDeEspera createGetMinDeEspera() {
        return new GetMinDeEspera();
    }

    /**
     * Create an instance of {@link GetMinDeEsperaResponse }
     * 
     */
    public GetMinDeEsperaResponse createGetMinDeEsperaResponse() {
        return new GetMinDeEsperaResponse();
    }

    /**
     * Create an instance of {@link GetNumTotalPedidos }
     * 
     */
    public GetNumTotalPedidos createGetNumTotalPedidos() {
        return new GetNumTotalPedidos();
    }

    /**
     * Create an instance of {@link GetNumTotalPedidosResponse }
     * 
     */
    public GetNumTotalPedidosResponse createGetNumTotalPedidosResponse() {
        return new GetNumTotalPedidosResponse();
    }

    /**
     * Create an instance of {@link GetPromHoraFiltrada }
     * 
     */
    public GetPromHoraFiltrada createGetPromHoraFiltrada() {
        return new GetPromHoraFiltrada();
    }

    /**
     * Create an instance of {@link GetPromHoraFiltradaResponse }
     * 
     */
    public GetPromHoraFiltradaResponse createGetPromHoraFiltradaResponse() {
        return new GetPromHoraFiltradaResponse();
    }

    /**
     * Create an instance of {@link GetPromMinFiltrado }
     * 
     */
    public GetPromMinFiltrado createGetPromMinFiltrado() {
        return new GetPromMinFiltrado();
    }

    /**
     * Create an instance of {@link GetPromMinFiltradoResponse }
     * 
     */
    public GetPromMinFiltradoResponse createGetPromMinFiltradoResponse() {
        return new GetPromMinFiltradoResponse();
    }

    /**
     * Create an instance of {@link GetPromSegFiltrado }
     * 
     */
    public GetPromSegFiltrado createGetPromSegFiltrado() {
        return new GetPromSegFiltrado();
    }

    /**
     * Create an instance of {@link GetPromSegFiltradoResponse }
     * 
     */
    public GetPromSegFiltradoResponse createGetPromSegFiltradoResponse() {
        return new GetPromSegFiltradoResponse();
    }

    /**
     * Create an instance of {@link GetPromedioDeHoras }
     * 
     */
    public GetPromedioDeHoras createGetPromedioDeHoras() {
        return new GetPromedioDeHoras();
    }

    /**
     * Create an instance of {@link GetPromedioDeHorasResponse }
     * 
     */
    public GetPromedioDeHorasResponse createGetPromedioDeHorasResponse() {
        return new GetPromedioDeHorasResponse();
    }

    /**
     * Create an instance of {@link GetPromedioDeMinutos }
     * 
     */
    public GetPromedioDeMinutos createGetPromedioDeMinutos() {
        return new GetPromedioDeMinutos();
    }

    /**
     * Create an instance of {@link GetPromedioDeMinutosResponse }
     * 
     */
    public GetPromedioDeMinutosResponse createGetPromedioDeMinutosResponse() {
        return new GetPromedioDeMinutosResponse();
    }

    /**
     * Create an instance of {@link GetPromedioDeSegundos }
     * 
     */
    public GetPromedioDeSegundos createGetPromedioDeSegundos() {
        return new GetPromedioDeSegundos();
    }

    /**
     * Create an instance of {@link GetPromedioDeSegundosResponse }
     * 
     */
    public GetPromedioDeSegundosResponse createGetPromedioDeSegundosResponse() {
        return new GetPromedioDeSegundosResponse();
    }

    /**
     * Create an instance of {@link GetSegDeEspera }
     * 
     */
    public GetSegDeEspera createGetSegDeEspera() {
        return new GetSegDeEspera();
    }

    /**
     * Create an instance of {@link GetSegDeEsperaResponse }
     * 
     */
    public GetSegDeEsperaResponse createGetSegDeEsperaResponse() {
        return new GetSegDeEsperaResponse();
    }

    /**
     * Create an instance of {@link GetTotalDePedidosFiltrado }
     * 
     */
    public GetTotalDePedidosFiltrado createGetTotalDePedidosFiltrado() {
        return new GetTotalDePedidosFiltrado();
    }

    /**
     * Create an instance of {@link GetTotalDePedidosFiltradoResponse }
     * 
     */
    public GetTotalDePedidosFiltradoResponse createGetTotalDePedidosFiltradoResponse() {
        return new GetTotalDePedidosFiltradoResponse();
    }

    /**
     * Create an instance of {@link HoraRegPed }
     * 
     */
    public HoraRegPed createHoraRegPed() {
        return new HoraRegPed();
    }

    /**
     * Create an instance of {@link HoraRegPedResponse }
     * 
     */
    public HoraRegPedResponse createHoraRegPedResponse() {
        return new HoraRegPedResponse();
    }

    /**
     * Create an instance of {@link HoraRegistroPedido }
     * 
     */
    public HoraRegistroPedido createHoraRegistroPedido() {
        return new HoraRegistroPedido();
    }

    /**
     * Create an instance of {@link HoraRegistroPedidoResponse }
     * 
     */
    public HoraRegistroPedidoResponse createHoraRegistroPedidoResponse() {
        return new HoraRegistroPedidoResponse();
    }

    /**
     * Create an instance of {@link IdCargoPersona }
     * 
     */
    public IdCargoPersona createIdCargoPersona() {
        return new IdCargoPersona();
    }

    /**
     * Create an instance of {@link IdCargoPersonaResponse }
     * 
     */
    public IdCargoPersonaResponse createIdCargoPersonaResponse() {
        return new IdCargoPersonaResponse();
    }

    /**
     * Create an instance of {@link Ingresar }
     * 
     */
    public Ingresar createIngresar() {
        return new Ingresar();
    }

    /**
     * Create an instance of {@link IngresarResponse }
     * 
     */
    public IngresarResponse createIngresarResponse() {
        return new IngresarResponse();
    }

    /**
     * Create an instance of {@link IngresoDeCliente }
     * 
     */
    public IngresoDeCliente createIngresoDeCliente() {
        return new IngresoDeCliente();
    }

    /**
     * Create an instance of {@link IngresoDeClienteResponse }
     * 
     */
    public IngresoDeClienteResponse createIngresoDeClienteResponse() {
        return new IngresoDeClienteResponse();
    }

    /**
     * Create an instance of {@link MinutoRegPed }
     * 
     */
    public MinutoRegPed createMinutoRegPed() {
        return new MinutoRegPed();
    }

    /**
     * Create an instance of {@link MinutoRegPedResponse }
     * 
     */
    public MinutoRegPedResponse createMinutoRegPedResponse() {
        return new MinutoRegPedResponse();
    }

    /**
     * Create an instance of {@link NombreCliente }
     * 
     */
    public NombreCliente createNombreCliente() {
        return new NombreCliente();
    }

    /**
     * Create an instance of {@link NombreClienteResponse }
     * 
     */
    public NombreClienteResponse createNombreClienteResponse() {
        return new NombreClienteResponse();
    }

    /**
     * Create an instance of {@link NumCantPedidosHoy }
     * 
     */
    public NumCantPedidosHoy createNumCantPedidosHoy() {
        return new NumCantPedidosHoy();
    }

    /**
     * Create an instance of {@link NumCantPedidosHoyResponse }
     * 
     */
    public NumCantPedidosHoyResponse createNumCantPedidosHoyResponse() {
        return new NumCantPedidosHoyResponse();
    }

    /**
     * Create an instance of {@link NumPedido }
     * 
     */
    public NumPedido createNumPedido() {
        return new NumPedido();
    }

    /**
     * Create an instance of {@link NumPedidoResponse }
     * 
     */
    public NumPedidoResponse createNumPedidoResponse() {
        return new NumPedidoResponse();
    }

    /**
     * Create an instance of {@link NumTotalDePersonas }
     * 
     */
    public NumTotalDePersonas createNumTotalDePersonas() {
        return new NumTotalDePersonas();
    }

    /**
     * Create an instance of {@link NumTotalDePersonasResponse }
     * 
     */
    public NumTotalDePersonasResponse createNumTotalDePersonasResponse() {
        return new NumTotalDePersonasResponse();
    }

    /**
     * Create an instance of {@link PedidosDeHoy }
     * 
     */
    public PedidosDeHoy createPedidosDeHoy() {
        return new PedidosDeHoy();
    }

    /**
     * Create an instance of {@link PedidosDeHoyResponse }
     * 
     */
    public PedidosDeHoyResponse createPedidosDeHoyResponse() {
        return new PedidosDeHoyResponse();
    }

    /**
     * Create an instance of {@link PedidosPorFecha }
     * 
     */
    public PedidosPorFecha createPedidosPorFecha() {
        return new PedidosPorFecha();
    }

    /**
     * Create an instance of {@link PedidosPorFechaResponse }
     * 
     */
    public PedidosPorFechaResponse createPedidosPorFechaResponse() {
        return new PedidosPorFechaResponse();
    }

    /**
     * Create an instance of {@link RegistrarHistorialPedidos }
     * 
     */
    public RegistrarHistorialPedidos createRegistrarHistorialPedidos() {
        return new RegistrarHistorialPedidos();
    }

    /**
     * Create an instance of {@link RegistrarHistorialPedidosResponse }
     * 
     */
    public RegistrarHistorialPedidosResponse createRegistrarHistorialPedidosResponse() {
        return new RegistrarHistorialPedidosResponse();
    }

    /**
     * Create an instance of {@link RegistrarPersonal }
     * 
     */
    public RegistrarPersonal createRegistrarPersonal() {
        return new RegistrarPersonal();
    }

    /**
     * Create an instance of {@link RegistrarPersonalResponse }
     * 
     */
    public RegistrarPersonalResponse createRegistrarPersonalResponse() {
        return new RegistrarPersonalResponse();
    }

    /**
     * Create an instance of {@link SegundoRegPed }
     * 
     */
    public SegundoRegPed createSegundoRegPed() {
        return new SegundoRegPed();
    }

    /**
     * Create an instance of {@link SegundoRegPedResponse }
     * 
     */
    public SegundoRegPedResponse createSegundoRegPedResponse() {
        return new SegundoRegPedResponse();
    }

    /**
     * Create an instance of {@link TodasLasPersonas }
     * 
     */
    public TodasLasPersonas createTodasLasPersonas() {
        return new TodasLasPersonas();
    }

    /**
     * Create an instance of {@link TodasLasPersonasResponse }
     * 
     */
    public TodasLasPersonasResponse createTodasLasPersonasResponse() {
        return new TodasLasPersonasResponse();
    }

    /**
     * Create an instance of {@link TodosLosPedidos }
     * 
     */
    public TodosLosPedidos createTodosLosPedidos() {
        return new TodosLosPedidos();
    }

    /**
     * Create an instance of {@link TodosLosPedidosResponse }
     * 
     */
    public TodosLosPedidosResponse createTodosLosPedidosResponse() {
        return new TodosLosPedidosResponse();
    }

    /**
     * Create an instance of {@link HistorialPedidos }
     * 
     */
    public HistorialPedidos createHistorialPedidos() {
        return new HistorialPedidos();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPedidoAEntregado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actualizarPedidoAEntregado")
    public JAXBElement<ActualizarPedidoAEntregado> createActualizarPedidoAEntregado(ActualizarPedidoAEntregado value) {
        return new JAXBElement<ActualizarPedidoAEntregado>(_ActualizarPedidoAEntregado_QNAME, ActualizarPedidoAEntregado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPedidoAEntregadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "actualizarPedidoAEntregadoResponse")
    public JAXBElement<ActualizarPedidoAEntregadoResponse> createActualizarPedidoAEntregadoResponse(ActualizarPedidoAEntregadoResponse value) {
        return new JAXBElement<ActualizarPedidoAEntregadoResponse>(_ActualizarPedidoAEntregadoResponse_QNAME, ActualizarPedidoAEntregadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "agregarPedido")
    public JAXBElement<AgregarPedido> createAgregarPedido(AgregarPedido value) {
        return new JAXBElement<AgregarPedido>(_AgregarPedido_QNAME, AgregarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "agregarPedidoResponse")
    public JAXBElement<AgregarPedidoResponse> createAgregarPedidoResponse(AgregarPedidoResponse value) {
        return new JAXBElement<AgregarPedidoResponse>(_AgregarPedidoResponse_QNAME, AgregarPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cambiarEstadoPedido")
    public JAXBElement<CambiarEstadoPedido> createCambiarEstadoPedido(CambiarEstadoPedido value) {
        return new JAXBElement<CambiarEstadoPedido>(_CambiarEstadoPedido_QNAME, CambiarEstadoPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPedidoAListo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cambiarEstadoPedidoAListo")
    public JAXBElement<CambiarEstadoPedidoAListo> createCambiarEstadoPedidoAListo(CambiarEstadoPedidoAListo value) {
        return new JAXBElement<CambiarEstadoPedidoAListo>(_CambiarEstadoPedidoAListo_QNAME, CambiarEstadoPedidoAListo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPedidoAListoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cambiarEstadoPedidoAListoResponse")
    public JAXBElement<CambiarEstadoPedidoAListoResponse> createCambiarEstadoPedidoAListoResponse(CambiarEstadoPedidoAListoResponse value) {
        return new JAXBElement<CambiarEstadoPedidoAListoResponse>(_CambiarEstadoPedidoAListoResponse_QNAME, CambiarEstadoPedidoAListoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cambiarEstadoPedidoResponse")
    public JAXBElement<CambiarEstadoPedidoResponse> createCambiarEstadoPedidoResponse(CambiarEstadoPedidoResponse value) {
        return new JAXBElement<CambiarEstadoPedidoResponse>(_CambiarEstadoPedidoResponse_QNAME, CambiarEstadoPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosMIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosMIN")
    public JAXBElement<CantPedBuenosMIN> createCantPedBuenosMIN(CantPedBuenosMIN value) {
        return new JAXBElement<CantPedBuenosMIN>(_CantPedBuenosMIN_QNAME, CantPedBuenosMIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosMINFiltrados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosMINFiltrados")
    public JAXBElement<CantPedBuenosMINFiltrados> createCantPedBuenosMINFiltrados(CantPedBuenosMINFiltrados value) {
        return new JAXBElement<CantPedBuenosMINFiltrados>(_CantPedBuenosMINFiltrados_QNAME, CantPedBuenosMINFiltrados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosMINFiltradosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosMINFiltradosResponse")
    public JAXBElement<CantPedBuenosMINFiltradosResponse> createCantPedBuenosMINFiltradosResponse(CantPedBuenosMINFiltradosResponse value) {
        return new JAXBElement<CantPedBuenosMINFiltradosResponse>(_CantPedBuenosMINFiltradosResponse_QNAME, CantPedBuenosMINFiltradosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosMINResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosMINResponse")
    public JAXBElement<CantPedBuenosMINResponse> createCantPedBuenosMINResponse(CantPedBuenosMINResponse value) {
        return new JAXBElement<CantPedBuenosMINResponse>(_CantPedBuenosMINResponse_QNAME, CantPedBuenosMINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosSEG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosSEG")
    public JAXBElement<CantPedBuenosSEG> createCantPedBuenosSEG(CantPedBuenosSEG value) {
        return new JAXBElement<CantPedBuenosSEG>(_CantPedBuenosSEG_QNAME, CantPedBuenosSEG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosSEGFiltrados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosSEGFiltrados")
    public JAXBElement<CantPedBuenosSEGFiltrados> createCantPedBuenosSEGFiltrados(CantPedBuenosSEGFiltrados value) {
        return new JAXBElement<CantPedBuenosSEGFiltrados>(_CantPedBuenosSEGFiltrados_QNAME, CantPedBuenosSEGFiltrados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosSEGFiltradosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosSEGFiltradosResponse")
    public JAXBElement<CantPedBuenosSEGFiltradosResponse> createCantPedBuenosSEGFiltradosResponse(CantPedBuenosSEGFiltradosResponse value) {
        return new JAXBElement<CantPedBuenosSEGFiltradosResponse>(_CantPedBuenosSEGFiltradosResponse_QNAME, CantPedBuenosSEGFiltradosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedBuenosSEGResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedBuenosSEGResponse")
    public JAXBElement<CantPedBuenosSEGResponse> createCantPedBuenosSEGResponse(CantPedBuenosSEGResponse value) {
        return new JAXBElement<CantPedBuenosSEGResponse>(_CantPedBuenosSEGResponse_QNAME, CantPedBuenosSEGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosMIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosMIN")
    public JAXBElement<CantPedMalosMIN> createCantPedMalosMIN(CantPedMalosMIN value) {
        return new JAXBElement<CantPedMalosMIN>(_CantPedMalosMIN_QNAME, CantPedMalosMIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosMINFiltrados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosMINFiltrados")
    public JAXBElement<CantPedMalosMINFiltrados> createCantPedMalosMINFiltrados(CantPedMalosMINFiltrados value) {
        return new JAXBElement<CantPedMalosMINFiltrados>(_CantPedMalosMINFiltrados_QNAME, CantPedMalosMINFiltrados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosMINFiltradosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosMINFiltradosResponse")
    public JAXBElement<CantPedMalosMINFiltradosResponse> createCantPedMalosMINFiltradosResponse(CantPedMalosMINFiltradosResponse value) {
        return new JAXBElement<CantPedMalosMINFiltradosResponse>(_CantPedMalosMINFiltradosResponse_QNAME, CantPedMalosMINFiltradosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosMINResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosMINResponse")
    public JAXBElement<CantPedMalosMINResponse> createCantPedMalosMINResponse(CantPedMalosMINResponse value) {
        return new JAXBElement<CantPedMalosMINResponse>(_CantPedMalosMINResponse_QNAME, CantPedMalosMINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosSEGFiltrados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosSEGFiltrados")
    public JAXBElement<CantPedMalosSEGFiltrados> createCantPedMalosSEGFiltrados(CantPedMalosSEGFiltrados value) {
        return new JAXBElement<CantPedMalosSEGFiltrados>(_CantPedMalosSEGFiltrados_QNAME, CantPedMalosSEGFiltrados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosSEGFiltradosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosSEGFiltradosResponse")
    public JAXBElement<CantPedMalosSEGFiltradosResponse> createCantPedMalosSEGFiltradosResponse(CantPedMalosSEGFiltradosResponse value) {
        return new JAXBElement<CantPedMalosSEGFiltradosResponse>(_CantPedMalosSEGFiltradosResponse_QNAME, CantPedMalosSEGFiltradosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosSeg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosSeg")
    public JAXBElement<CantPedMalosSeg> createCantPedMalosSeg(CantPedMalosSeg value) {
        return new JAXBElement<CantPedMalosSeg>(_CantPedMalosSeg_QNAME, CantPedMalosSeg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantPedMalosSegResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "cantPedMalosSegResponse")
    public JAXBElement<CantPedMalosSegResponse> createCantPedMalosSegResponse(CantPedMalosSegResponse value) {
        return new JAXBElement<CantPedMalosSegResponse>(_CantPedMalosSegResponse_QNAME, CantPedMalosSegResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstadoPedidoCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getEstadoPedidoCliente")
    public JAXBElement<GetEstadoPedidoCliente> createGetEstadoPedidoCliente(GetEstadoPedidoCliente value) {
        return new JAXBElement<GetEstadoPedidoCliente>(_GetEstadoPedidoCliente_QNAME, GetEstadoPedidoCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEstadoPedidoClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getEstadoPedidoClienteResponse")
    public JAXBElement<GetEstadoPedidoClienteResponse> createGetEstadoPedidoClienteResponse(GetEstadoPedidoClienteResponse value) {
        return new JAXBElement<GetEstadoPedidoClienteResponse>(_GetEstadoPedidoClienteResponse_QNAME, GetEstadoPedidoClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistorialPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHistorialPedidos")
    public JAXBElement<GetHistorialPedidos> createGetHistorialPedidos(GetHistorialPedidos value) {
        return new JAXBElement<GetHistorialPedidos>(_GetHistorialPedidos_QNAME, GetHistorialPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistorialPedidosFiltrados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHistorialPedidosFiltrados")
    public JAXBElement<GetHistorialPedidosFiltrados> createGetHistorialPedidosFiltrados(GetHistorialPedidosFiltrados value) {
        return new JAXBElement<GetHistorialPedidosFiltrados>(_GetHistorialPedidosFiltrados_QNAME, GetHistorialPedidosFiltrados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistorialPedidosFiltradosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHistorialPedidosFiltradosResponse")
    public JAXBElement<GetHistorialPedidosFiltradosResponse> createGetHistorialPedidosFiltradosResponse(GetHistorialPedidosFiltradosResponse value) {
        return new JAXBElement<GetHistorialPedidosFiltradosResponse>(_GetHistorialPedidosFiltradosResponse_QNAME, GetHistorialPedidosFiltradosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHistorialPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHistorialPedidosResponse")
    public JAXBElement<GetHistorialPedidosResponse> createGetHistorialPedidosResponse(GetHistorialPedidosResponse value) {
        return new JAXBElement<GetHistorialPedidosResponse>(_GetHistorialPedidosResponse_QNAME, GetHistorialPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHoraDeEspera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHoraDeEspera")
    public JAXBElement<GetHoraDeEspera> createGetHoraDeEspera(GetHoraDeEspera value) {
        return new JAXBElement<GetHoraDeEspera>(_GetHoraDeEspera_QNAME, GetHoraDeEspera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHoraDeEsperaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHoraDeEsperaResponse")
    public JAXBElement<GetHoraDeEsperaResponse> createGetHoraDeEsperaResponse(GetHoraDeEsperaResponse value) {
        return new JAXBElement<GetHoraDeEsperaResponse>(_GetHoraDeEsperaResponse_QNAME, GetHoraDeEsperaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHoraRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHoraRegistro")
    public JAXBElement<GetHoraRegistro> createGetHoraRegistro(GetHoraRegistro value) {
        return new JAXBElement<GetHoraRegistro>(_GetHoraRegistro_QNAME, GetHoraRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHoraRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getHoraRegistroResponse")
    public JAXBElement<GetHoraRegistroResponse> createGetHoraRegistroResponse(GetHoraRegistroResponse value) {
        return new JAXBElement<GetHoraRegistroResponse>(_GetHoraRegistroResponse_QNAME, GetHoraRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinDeEspera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getMinDeEspera")
    public JAXBElement<GetMinDeEspera> createGetMinDeEspera(GetMinDeEspera value) {
        return new JAXBElement<GetMinDeEspera>(_GetMinDeEspera_QNAME, GetMinDeEspera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinDeEsperaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getMinDeEsperaResponse")
    public JAXBElement<GetMinDeEsperaResponse> createGetMinDeEsperaResponse(GetMinDeEsperaResponse value) {
        return new JAXBElement<GetMinDeEsperaResponse>(_GetMinDeEsperaResponse_QNAME, GetMinDeEsperaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumTotalPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getNumTotalPedidos")
    public JAXBElement<GetNumTotalPedidos> createGetNumTotalPedidos(GetNumTotalPedidos value) {
        return new JAXBElement<GetNumTotalPedidos>(_GetNumTotalPedidos_QNAME, GetNumTotalPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumTotalPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getNumTotalPedidosResponse")
    public JAXBElement<GetNumTotalPedidosResponse> createGetNumTotalPedidosResponse(GetNumTotalPedidosResponse value) {
        return new JAXBElement<GetNumTotalPedidosResponse>(_GetNumTotalPedidosResponse_QNAME, GetNumTotalPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromHoraFiltrada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromHoraFiltrada")
    public JAXBElement<GetPromHoraFiltrada> createGetPromHoraFiltrada(GetPromHoraFiltrada value) {
        return new JAXBElement<GetPromHoraFiltrada>(_GetPromHoraFiltrada_QNAME, GetPromHoraFiltrada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromHoraFiltradaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromHoraFiltradaResponse")
    public JAXBElement<GetPromHoraFiltradaResponse> createGetPromHoraFiltradaResponse(GetPromHoraFiltradaResponse value) {
        return new JAXBElement<GetPromHoraFiltradaResponse>(_GetPromHoraFiltradaResponse_QNAME, GetPromHoraFiltradaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromMinFiltrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromMinFiltrado")
    public JAXBElement<GetPromMinFiltrado> createGetPromMinFiltrado(GetPromMinFiltrado value) {
        return new JAXBElement<GetPromMinFiltrado>(_GetPromMinFiltrado_QNAME, GetPromMinFiltrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromMinFiltradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromMinFiltradoResponse")
    public JAXBElement<GetPromMinFiltradoResponse> createGetPromMinFiltradoResponse(GetPromMinFiltradoResponse value) {
        return new JAXBElement<GetPromMinFiltradoResponse>(_GetPromMinFiltradoResponse_QNAME, GetPromMinFiltradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromSegFiltrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromSegFiltrado")
    public JAXBElement<GetPromSegFiltrado> createGetPromSegFiltrado(GetPromSegFiltrado value) {
        return new JAXBElement<GetPromSegFiltrado>(_GetPromSegFiltrado_QNAME, GetPromSegFiltrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromSegFiltradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromSegFiltradoResponse")
    public JAXBElement<GetPromSegFiltradoResponse> createGetPromSegFiltradoResponse(GetPromSegFiltradoResponse value) {
        return new JAXBElement<GetPromSegFiltradoResponse>(_GetPromSegFiltradoResponse_QNAME, GetPromSegFiltradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromedioDeHoras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromedioDeHoras")
    public JAXBElement<GetPromedioDeHoras> createGetPromedioDeHoras(GetPromedioDeHoras value) {
        return new JAXBElement<GetPromedioDeHoras>(_GetPromedioDeHoras_QNAME, GetPromedioDeHoras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromedioDeHorasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromedioDeHorasResponse")
    public JAXBElement<GetPromedioDeHorasResponse> createGetPromedioDeHorasResponse(GetPromedioDeHorasResponse value) {
        return new JAXBElement<GetPromedioDeHorasResponse>(_GetPromedioDeHorasResponse_QNAME, GetPromedioDeHorasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromedioDeMinutos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromedioDeMinutos")
    public JAXBElement<GetPromedioDeMinutos> createGetPromedioDeMinutos(GetPromedioDeMinutos value) {
        return new JAXBElement<GetPromedioDeMinutos>(_GetPromedioDeMinutos_QNAME, GetPromedioDeMinutos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromedioDeMinutosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromedioDeMinutosResponse")
    public JAXBElement<GetPromedioDeMinutosResponse> createGetPromedioDeMinutosResponse(GetPromedioDeMinutosResponse value) {
        return new JAXBElement<GetPromedioDeMinutosResponse>(_GetPromedioDeMinutosResponse_QNAME, GetPromedioDeMinutosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromedioDeSegundos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromedioDeSegundos")
    public JAXBElement<GetPromedioDeSegundos> createGetPromedioDeSegundos(GetPromedioDeSegundos value) {
        return new JAXBElement<GetPromedioDeSegundos>(_GetPromedioDeSegundos_QNAME, GetPromedioDeSegundos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPromedioDeSegundosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getPromedioDeSegundosResponse")
    public JAXBElement<GetPromedioDeSegundosResponse> createGetPromedioDeSegundosResponse(GetPromedioDeSegundosResponse value) {
        return new JAXBElement<GetPromedioDeSegundosResponse>(_GetPromedioDeSegundosResponse_QNAME, GetPromedioDeSegundosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegDeEspera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getSegDeEspera")
    public JAXBElement<GetSegDeEspera> createGetSegDeEspera(GetSegDeEspera value) {
        return new JAXBElement<GetSegDeEspera>(_GetSegDeEspera_QNAME, GetSegDeEspera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSegDeEsperaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getSegDeEsperaResponse")
    public JAXBElement<GetSegDeEsperaResponse> createGetSegDeEsperaResponse(GetSegDeEsperaResponse value) {
        return new JAXBElement<GetSegDeEsperaResponse>(_GetSegDeEsperaResponse_QNAME, GetSegDeEsperaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalDePedidosFiltrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getTotalDePedidosFiltrado")
    public JAXBElement<GetTotalDePedidosFiltrado> createGetTotalDePedidosFiltrado(GetTotalDePedidosFiltrado value) {
        return new JAXBElement<GetTotalDePedidosFiltrado>(_GetTotalDePedidosFiltrado_QNAME, GetTotalDePedidosFiltrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalDePedidosFiltradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getTotalDePedidosFiltradoResponse")
    public JAXBElement<GetTotalDePedidosFiltradoResponse> createGetTotalDePedidosFiltradoResponse(GetTotalDePedidosFiltradoResponse value) {
        return new JAXBElement<GetTotalDePedidosFiltradoResponse>(_GetTotalDePedidosFiltradoResponse_QNAME, GetTotalDePedidosFiltradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegPed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegPed")
    public JAXBElement<HoraRegPed> createHoraRegPed(HoraRegPed value) {
        return new JAXBElement<HoraRegPed>(_HoraRegPed_QNAME, HoraRegPed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegPedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegPedResponse")
    public JAXBElement<HoraRegPedResponse> createHoraRegPedResponse(HoraRegPedResponse value) {
        return new JAXBElement<HoraRegPedResponse>(_HoraRegPedResponse_QNAME, HoraRegPedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegistroPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegistroPedido")
    public JAXBElement<HoraRegistroPedido> createHoraRegistroPedido(HoraRegistroPedido value) {
        return new JAXBElement<HoraRegistroPedido>(_HoraRegistroPedido_QNAME, HoraRegistroPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoraRegistroPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "horaRegistroPedidoResponse")
    public JAXBElement<HoraRegistroPedidoResponse> createHoraRegistroPedidoResponse(HoraRegistroPedidoResponse value) {
        return new JAXBElement<HoraRegistroPedidoResponse>(_HoraRegistroPedidoResponse_QNAME, HoraRegistroPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCargoPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "id_CargoPersona")
    public JAXBElement<IdCargoPersona> createIdCargoPersona(IdCargoPersona value) {
        return new JAXBElement<IdCargoPersona>(_IdCargoPersona_QNAME, IdCargoPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCargoPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "id_CargoPersonaResponse")
    public JAXBElement<IdCargoPersonaResponse> createIdCargoPersonaResponse(IdCargoPersonaResponse value) {
        return new JAXBElement<IdCargoPersonaResponse>(_IdCargoPersonaResponse_QNAME, IdCargoPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingresar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ingresar")
    public JAXBElement<Ingresar> createIngresar(Ingresar value) {
        return new JAXBElement<Ingresar>(_Ingresar_QNAME, Ingresar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ingresarResponse")
    public JAXBElement<IngresarResponse> createIngresarResponse(IngresarResponse value) {
        return new JAXBElement<IngresarResponse>(_IngresarResponse_QNAME, IngresarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoDeCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ingresoDeCliente")
    public JAXBElement<IngresoDeCliente> createIngresoDeCliente(IngresoDeCliente value) {
        return new JAXBElement<IngresoDeCliente>(_IngresoDeCliente_QNAME, IngresoDeCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoDeClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ingresoDeClienteResponse")
    public JAXBElement<IngresoDeClienteResponse> createIngresoDeClienteResponse(IngresoDeClienteResponse value) {
        return new JAXBElement<IngresoDeClienteResponse>(_IngresoDeClienteResponse_QNAME, IngresoDeClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinutoRegPed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "minutoRegPed")
    public JAXBElement<MinutoRegPed> createMinutoRegPed(MinutoRegPed value) {
        return new JAXBElement<MinutoRegPed>(_MinutoRegPed_QNAME, MinutoRegPed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinutoRegPedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "minutoRegPedResponse")
    public JAXBElement<MinutoRegPedResponse> createMinutoRegPedResponse(MinutoRegPedResponse value) {
        return new JAXBElement<MinutoRegPedResponse>(_MinutoRegPedResponse_QNAME, MinutoRegPedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NombreCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "nombreCliente")
    public JAXBElement<NombreCliente> createNombreCliente(NombreCliente value) {
        return new JAXBElement<NombreCliente>(_NombreCliente_QNAME, NombreCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NombreClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "nombreClienteResponse")
    public JAXBElement<NombreClienteResponse> createNombreClienteResponse(NombreClienteResponse value) {
        return new JAXBElement<NombreClienteResponse>(_NombreClienteResponse_QNAME, NombreClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumCantPedidosHoy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numCantPedidosHoy")
    public JAXBElement<NumCantPedidosHoy> createNumCantPedidosHoy(NumCantPedidosHoy value) {
        return new JAXBElement<NumCantPedidosHoy>(_NumCantPedidosHoy_QNAME, NumCantPedidosHoy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumCantPedidosHoyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numCantPedidosHoyResponse")
    public JAXBElement<NumCantPedidosHoyResponse> createNumCantPedidosHoyResponse(NumCantPedidosHoyResponse value) {
        return new JAXBElement<NumCantPedidosHoyResponse>(_NumCantPedidosHoyResponse_QNAME, NumCantPedidosHoyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numPedido")
    public JAXBElement<NumPedido> createNumPedido(NumPedido value) {
        return new JAXBElement<NumPedido>(_NumPedido_QNAME, NumPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numPedidoResponse")
    public JAXBElement<NumPedidoResponse> createNumPedidoResponse(NumPedidoResponse value) {
        return new JAXBElement<NumPedidoResponse>(_NumPedidoResponse_QNAME, NumPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumTotalDePersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numTotalDePersonas")
    public JAXBElement<NumTotalDePersonas> createNumTotalDePersonas(NumTotalDePersonas value) {
        return new JAXBElement<NumTotalDePersonas>(_NumTotalDePersonas_QNAME, NumTotalDePersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumTotalDePersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "numTotalDePersonasResponse")
    public JAXBElement<NumTotalDePersonasResponse> createNumTotalDePersonasResponse(NumTotalDePersonasResponse value) {
        return new JAXBElement<NumTotalDePersonasResponse>(_NumTotalDePersonasResponse_QNAME, NumTotalDePersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosDeHoy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosDeHoy")
    public JAXBElement<PedidosDeHoy> createPedidosDeHoy(PedidosDeHoy value) {
        return new JAXBElement<PedidosDeHoy>(_PedidosDeHoy_QNAME, PedidosDeHoy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosDeHoyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosDeHoyResponse")
    public JAXBElement<PedidosDeHoyResponse> createPedidosDeHoyResponse(PedidosDeHoyResponse value) {
        return new JAXBElement<PedidosDeHoyResponse>(_PedidosDeHoyResponse_QNAME, PedidosDeHoyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosPorFecha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosPorFecha")
    public JAXBElement<PedidosPorFecha> createPedidosPorFecha(PedidosPorFecha value) {
        return new JAXBElement<PedidosPorFecha>(_PedidosPorFecha_QNAME, PedidosPorFecha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidosPorFechaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pedidosPorFechaResponse")
    public JAXBElement<PedidosPorFechaResponse> createPedidosPorFechaResponse(PedidosPorFechaResponse value) {
        return new JAXBElement<PedidosPorFechaResponse>(_PedidosPorFechaResponse_QNAME, PedidosPorFechaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarHistorialPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "registrarHistorialPedidos")
    public JAXBElement<RegistrarHistorialPedidos> createRegistrarHistorialPedidos(RegistrarHistorialPedidos value) {
        return new JAXBElement<RegistrarHistorialPedidos>(_RegistrarHistorialPedidos_QNAME, RegistrarHistorialPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarHistorialPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "registrarHistorialPedidosResponse")
    public JAXBElement<RegistrarHistorialPedidosResponse> createRegistrarHistorialPedidosResponse(RegistrarHistorialPedidosResponse value) {
        return new JAXBElement<RegistrarHistorialPedidosResponse>(_RegistrarHistorialPedidosResponse_QNAME, RegistrarHistorialPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPersonal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "registrarPersonal")
    public JAXBElement<RegistrarPersonal> createRegistrarPersonal(RegistrarPersonal value) {
        return new JAXBElement<RegistrarPersonal>(_RegistrarPersonal_QNAME, RegistrarPersonal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPersonalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "registrarPersonalResponse")
    public JAXBElement<RegistrarPersonalResponse> createRegistrarPersonalResponse(RegistrarPersonalResponse value) {
        return new JAXBElement<RegistrarPersonalResponse>(_RegistrarPersonalResponse_QNAME, RegistrarPersonalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegundoRegPed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "segundoRegPed")
    public JAXBElement<SegundoRegPed> createSegundoRegPed(SegundoRegPed value) {
        return new JAXBElement<SegundoRegPed>(_SegundoRegPed_QNAME, SegundoRegPed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegundoRegPedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "segundoRegPedResponse")
    public JAXBElement<SegundoRegPedResponse> createSegundoRegPedResponse(SegundoRegPedResponse value) {
        return new JAXBElement<SegundoRegPedResponse>(_SegundoRegPedResponse_QNAME, SegundoRegPedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodasLasPersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todasLasPersonas")
    public JAXBElement<TodasLasPersonas> createTodasLasPersonas(TodasLasPersonas value) {
        return new JAXBElement<TodasLasPersonas>(_TodasLasPersonas_QNAME, TodasLasPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodasLasPersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todasLasPersonasResponse")
    public JAXBElement<TodasLasPersonasResponse> createTodasLasPersonasResponse(TodasLasPersonasResponse value) {
        return new JAXBElement<TodasLasPersonasResponse>(_TodasLasPersonasResponse_QNAME, TodasLasPersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosLosPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todosLosPedidos")
    public JAXBElement<TodosLosPedidos> createTodosLosPedidos(TodosLosPedidos value) {
        return new JAXBElement<TodosLosPedidos>(_TodosLosPedidos_QNAME, TodosLosPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosLosPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "todosLosPedidosResponse")
    public JAXBElement<TodosLosPedidosResponse> createTodosLosPedidosResponse(TodosLosPedidosResponse value) {
        return new JAXBElement<TodosLosPedidosResponse>(_TodosLosPedidosResponse_QNAME, TodosLosPedidosResponse.class, null, value);
    }

}
