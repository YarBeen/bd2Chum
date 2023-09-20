/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.bd2.proyecto1;

import db.OracleDBConnection;
import db.dbSingleton;
import db.ofertaRepository;
import db.productoRepository;
import entity.ofertaEntity;
import entity.productoEntity;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Yarman
 */
public class misOfertasServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      OracleDBConnection db = dbSingleton.getDBConnection();
        ofertaRepository offeDB = db.getOfeRep();

        List<ofertaEntity> ofertas = offeDB.readOfertasHechas(db.getUserLogged().getId());
        db.closeConection();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.print("<meta charset=\"UTF-8\">");
            out.println("<title>Servlet categoryPubServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"goMain\" method=\"post\">");
              out.println("<input type=\"submit\" value=\"Volver\"  />");
              out.println("</form> ");
           
            out.println("<table border=1>");
            out.println("<tr>");
            out.println("    <th>ID</th>\n"
                    + "            <th>Titulo Publicacion</th>\n"
                    + "            <th>Regateo</th>\n"
                    + "<th>Mensaje</th>\n"
                    + "<th>Aceptacion </th>\n"
                     + "<th>ID Publicacion </th>\n"
                    + "        </tr>");

            
                for (ofertaEntity oferta : ofertas) {
                    out.println("<tr>");
                    out.print("<td> " + oferta.getId() + "</td>");
                    out.print("<td> " + oferta.getTituloPublicacionOriginal() + "</td>");
                    out.print("<td> " + oferta.getRegateo() + "</td>");
                    out.print("<td> " + oferta.getMensaje()+ "</td>");
                    out.print("<td> " + oferta.getAceptacion() + "</td>");
                    out.print("<td> " + oferta.getIdPublicacion() + "</td>");
                    out.println("</tr>");
                }
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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
