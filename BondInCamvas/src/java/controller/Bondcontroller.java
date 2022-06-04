/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author vinht
 */
public class Bondcontroller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        response.getWriter().println("<!DOCTYPE html>\n"
                + "<html>\n"
                + "<style>\n"
                + "#myContainer {\n"
                + "  width: 400px;\n"
                + "  height: 400px;\n"
                + "  position: relative;\n"
                + "  background: yellow;\n"
                + "}\n"
                + "#myAnimation {\n"
                + "  width: 50px;\n"
                + "  height: 50px;\n"
                + "  position: absolute;\n"
                + "  background-color: red;\n"
                + "}\n"
                + "</style>\n"
                + "<body>\n"
                + "\n"
                + "<p>\n"
                + "<button onclick=\"myMove()\">Click Me</button> \n"
                + "</p>\n"
                + "\n"
                + "<div id =\"myContainer\">\n"
                + "<div id =\"myAnimation\"></div>\n"
                + "</div>\n"
                + "\n"
                + "<script>\n"
                + "var id = null;\n"
                + "function myMove() {\n"
                + "  var elem = document.getElementById(\"myAnimation\");   \n"
                + "  var pos = 0;\n"
                + "  clearInterval(id);\n"
                + "  id = setInterval(frame, 10);\n"
                + "  function frame() {\n"
                + "    if (pos == 350) {\n"
                + "      clearInterval(id);\n"
                + "    } else {\n"
                + "      pos++; \n"
                + "      elem.style.top = pos + 'px'; \n"
                + "      elem.style.left = pos + 'px'; \n"
                + "    }\n"
                + "  }\n"
                + "}\n"
                + "</script>\n"
                + "\n"
                + "</body>\n"
                + "</html>");
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
