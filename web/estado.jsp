<%@page import="ws.WSPedidos"%>
<%@page import="ws.WSPedidos_Service"%>
<%
    WSPedidos_Service pws = new WSPedidos_Service();
    WSPedidos pws_interfaz = pws.getWSPedidosPort();
    String rutCliente = (String) session.getAttribute("rutCliente");

    String estadoPedido = pws_interfaz.getEstadoPedidoCliente(rutCliente);
%>

<div class="center" id="refrescar">
    <i class="material-icons medium prefix">local_dining</i>
    <%
        if (estadoPedido.equals("En Espera")) {
            out.println("<h5 id='malo'>" + estadoPedido + "</h5>");
        } else {
            out.println("<h5 id='bueno'>" + estadoPedido + "</h5>");
        }
    %>

</div>