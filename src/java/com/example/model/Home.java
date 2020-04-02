/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andi9
 */
@WebServlet(name = "Home", urlPatterns = {"/Home"})
public class Home extends HttpServlet {
    public String[] ArregloUsuarios = new String[50];
    public String[] ArregloContras = new String[50];

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
            out.println("<title>Servlet Home</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Home at " + request.getContextPath() + "</h1>");
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
        ServletContext sc = getServletContext();
        
        String count="";
        String user="";
        String contra="";
        
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        
        if(session.getAttribute("contador") == null){
            
        count = "0";
        user ="admin";
        contra="admin";
     
        }
        else{
            count = session.getAttribute("contador").toString();
            user = session.getAttribute("USUARIOINICIO").toString();
            contra = session.getAttribute("CONTRAINICIO").toString();
        }
        int conta = Integer.parseInt(count);
        
        
        System.out.println(user);
        System.out.println(contra);
        System.out.println(conta);
//        
//        
//        
//        ArregloUsuarios[0] = "admin";
//        ArregloContras[0] = "admin";
//        
//        
//        
//        ArregloUsuarios[conta] = user;
//        ArregloContras[conta] = contra;
//        
//        
//        for(int i=0; i<= conta; i++){
//            System.out.println("Contador: "+conta);
//            System.out.println("No. cliente: "+ArregloUsuarios[i]);
//            System.out.println("Contraseña: "+ArregloContras[i]);
//            System.out.println("");
//        }
        
        if (user.equals(usuario) && contra.equals(contrasena)){
        request.getRequestDispatcher("Home.jsp").forward(request, response);
        }
        PrintWriter out = response.getWriter();
        
        
        ArrayList<ListaClientes> clientes = (ArrayList<ListaClientes>) sc.getAttribute("LISTACLIENTES");

        boolean seEncontroCliente = false;
        try {
            
            for (ListaClientes cliente : clientes) {
                if (conta == cliente.getNocliente() && contra.equals(cliente.getContrasena())) {
                    session.setAttribute("usuario", cliente);
                    request.getRequestDispatcher("Home.jsp").forward(request, response);
                    seEncontroCliente = true;
                    break;
                }
            }
            if (!seEncontroCliente) {
                out.println("<center>");
                out.print("<p>Error en los campos, verifique su informacion</p>");
                out.println("</center>");
                request.getRequestDispatcher("FailRegistro.jsp").include(request, response);
            }
            out.close();
        } catch (NullPointerException e) {
            log("Error en inicio de sesion", e);
            request.getRequestDispatcher("FailRegistro.jsp").forward(request, response);

        }
        
        
//        RequestDispatcher view = request.getRequestDispatcher("index.html");
//        view.forward(request, response);
        
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
