package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ws.WSPedidos;
import ws.WSPedidos_Service;

/**
 *
 * @author Eduardo Rubio
 */
@WebServlet(name = "IngresarServlet", urlPatterns = {"/ingresar.do"})
public class IngresarServlet extends HttpServlet {

    WSPedidos_Service pws;
    WSPedidos pws_interfaz;

    boolean clienteExiste;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            pws = new WSPedidos_Service();
            pws_interfaz = pws.getWSPedidosPort();
            String rut = request.getParameter("txt_RutCliente");
            clienteExiste = pws_interfaz.ingresoDeCliente(rut);
            if(clienteExiste == false){
                //out.println("<script>alert(\"Cliente no registra pedidos\");</script>");
                out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
                out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal(\"Cliente no registra pedido\",\"\",\"error\");");
                out.println("});");
                out.println("</script>");
                
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.include(request, response);
                //response.sendRedirect("index.jsp");
            }else{
                HttpSession sesion = request.getSession();
                sesion.setAttribute("rutCliente", rut);
                sesion.setAttribute("validar", clienteExiste);
                response.sendRedirect("menuDeEstado.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
