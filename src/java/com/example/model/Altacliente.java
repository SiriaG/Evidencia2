/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author siria
 */
@WebServlet(name = "Altacliente", urlPatterns = {"/Altacliente"})
public class Altacliente extends HttpServlet {
    public int contador = 1;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Altacliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Altacliente at " + request.getContextPath() + "</h1>");
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
        
        
        HttpSession session = request.getSession();
        
        String nombre = request.getParameter("Nombre");
        String apellido = request.getParameter("Apellido");
        String direccion = request.getParameter("Direccion");
        int cp = Integer.parseInt(request.getParameter("Codigopostal"));
        String ciudad  = request.getParameter("Ciudad");
        String estado = request.getParameter("Estado");
        String pais = request.getParameter("Pais");
        String correo = request.getParameter("Correo");
        long telefono = Integer.parseInt(request.getParameter("Telefono"));
        String cumple = request.getParameter("Fechanacimiento");
        String contra = request.getParameter("Contra");
        
        ListaAltaCliente[] ListaAltaClientes = new ListaAltaCliente[50];
        
        ListaAltaClientes[0]= new ListaAltaCliente("Admin","admin",0,"admin","admin","admin", 0, "admin", "admin", "admin");
        
      
        
        
        
        System.out.println(nombre);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
