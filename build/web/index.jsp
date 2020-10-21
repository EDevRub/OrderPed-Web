<%-- 
    Document   : index
    Created on : 12-07-2020, 21:25:44
    Author     : Eduardo Rubio
--%>

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
        <title>OrderPed Aplication</title>
    </head>
    <body class="grey lighten-3 section">
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <div class="container ">
            <div class="row">
                <div class="z-depth-5 col s12 m4 offset-m4">
                    <div class="card">
                        <div class="card-action light-blue darken-4 white-text">
                            <h4 class="white-text" align="center">Estado de Pedido</h4>
                        </div>

                        <div class="card-content">
                            <form action="ingresar.do" method="post">
                                <br>
                                <br>
                                <h6 class="center">Ingrese RUT:</h6>
                                <div class="input-field">
                                    <i class="material-icons prefix">account_circle</i>
                                    <input class="black-text" type="text" name="txt_RutCliente" id="txtRut" maxlength="10" required="">
                                    <label for="txtRut">EJ:12345678-9</label>
                                </div>
                                <br>
                                <br>
                                <div align="center">
                                    <button class="btn-large light-blue darken-4 white-text" style="width:100%" type="submit" name="btn_Ingreso">Revisar Estado
                                        <i class="material-icons right">done</i>
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
    </body>
    <style>
        body{
            background: url(FondoPedidos.jpg);
        }
    </style>
</html>
