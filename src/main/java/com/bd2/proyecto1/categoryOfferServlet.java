/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.bd2.proyecto1;

import db.OracleDBConnection;
import db.dbSingleton;
import db.productoRepository;
import db.tendenciaRepository;
import entity.productoEntity;
import entity.stringAndInt;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Yarman
 */
public class categoryOfferServlet extends HttpServlet {

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
        tendenciaRepository productDB = db.getTendRep();

        List<stringAndInt> tendencias = productDB.getMasOfertable();
        db.closeConection();
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/tablasStyle.css\">");
            out.print("<meta charset=\"UTF-8\">");
            out.println("<title>Servlet categoryPubServlet</title>");
            out.println("</head>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/tablasStyle.css\">");
            out.println("<body>");
            out.println("<form action=\"goMain\" method=\"post\">");
            out.println("<input type=\"submit\" value=\"Volver\"  />");
            out.println("</form> ");

            out.println("<table border=1>");
            out.println("<tr>");
            out.println("    <th>ID Categoria</th>\n"
                    + "            <th>Cantidad Ofertas</th>\n"
                    + "        </tr>");

            for (stringAndInt tendencia : tendencias) {
                out.println("<tr>");
                out.print("<td> " + tendencia.getNombre() + "</td>");
                out.print("<td> " + tendencia.getValor() + "</td>");

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
