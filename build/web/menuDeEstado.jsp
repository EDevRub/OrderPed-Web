<%-- 
    Document   : menuDeEstado
    Created on : 12-07-2020, 21:37:06
    Author     : Eduardo Rubio
--%>

<%@page import="ws.WSPedidos"%>
<%@page import="ws.WSPedidos_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Estado De Pedido</title>

        <script
            src="https://code.jquery.com/jquery-3.5.1.js"
            integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
            crossorigin="anonymous">
        </script>

    </head>
    <body class="grey lighten-3 section">

        <%
            WSPedidos_Service pws = new WSPedidos_Service();
            WSPedidos pws_interfaz = pws.getWSPedidosPort();
            String rutCliente = (String) session.getAttribute("rutCliente");

            Object validarCliente = session.getAttribute("validar");

            String nombreCliente = pws_interfaz.nombreCliente(rutCliente);
            String estadoPedido = pws_interfaz.getEstadoPedidoCliente(rutCliente);
            int numPedido = pws_interfaz.numPedido(rutCliente);

            if (Boolean.parseBoolean(String.valueOf(validarCliente)) == false) {
                response.sendRedirect("error.jsp");
            }

        %>
        <br>
        <br>
        <br>
        <br>
        <br>
        <div class="container teal lighten-2">
            <div class="row">
                <div class="z-depth-5 col s12 m4 offset-m4">
                    <div class="card">
                        <div class="card-action light-blue darken-4 white-text">
                            <h4 class="white-text" align="center">Estado de Pedido</h4>
                        </div>

                        <div class="card-content">
                            <form action="cerrarSesion.do" method="post">
                                <div class="center">
                                    <i class="material-icons medium">assignment</i>
                                    <h5><%out.println(numPedido);%></h5>
                                </div>
                                <br>
                                <div class="center">
                                    <i class="material-icons medium">account_circle</i>
                                    <h5><%out.println(nombreCliente);%></h5>
                                </div>
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
                                <br>
                                <br>
                                <br>
                                <div align="center">
                                    <button class="btn-large light-blue darken-4 white-text" style="width:100%" type="submit" name="btn_Ingreso">Cerrar Sesion
                                        <i class="material-icons right">cancel</i>
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--JavaScript at end of body for optimized loading-->
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script type="text/javascript">
                $(document).ready(function () {
                    $('#refrescar').load('estado.jsp');
                    refresh();
                });

                function refresh() {
                    setTimeout(function () {
                        $('#refrescar').fadeOut('slow').load('estado.jsp').fadeIn('slow');
                        refresh();
                    }, 2000);
                }   
        </script>




    </body>
    <style>
        body{
            background: url("FondoPedidos.jpg");
        }
        #malo{
            color: red;
        }
        #bueno{
            color: green;
        }
    </style>
</html>
