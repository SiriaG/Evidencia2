<%-- 
    Document   : ListaClientes
    Created on : 28/03/2020, 07:07:44 PM
    Author     : gmndi
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.model.ListaClientes"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de clientes</title>
    </head>
    <body>
        <h1>Banco Mercantil de México</h1>
        
        <a href="index.html">Regresar</a> 
        
        <h2>Lista de clientes.</h2>
            
            <% ServletContext sc = getServletContext();
            
            if(sc.getAttribute("LISTACLIENTES")!=null){
                List<ListaClientes> clientes = (ArrayList<ListaClientes>)sc.getAttribute("LISTACLIENTES"); 
                for(ListaClientes cliente : clientes)
                {
                    out.println("No. Cliente: "+cliente.getNocliente());
                    out.println("</br>");
                    out.println("Nombre: "+cliente.getNombre());
                    out.println("</br>");
                    out.println("Direccion: "+cliente.getDireccion());
                    out.println("</br>");
                    out.println("Correo: "+cliente.getCorreo());
                    out.println("</br>");
                    out.println("Telefono: "+cliente.getTelefono());
                    out.println("</br>");
                    out.println("Ciudad: "+cliente.getCiudad());
                    out.println("</br>");
                    out.println("Cumpleaños: "+cliente.getCumple());
                    out.println("</br>");
                    out.println("Contraseña: "+cliente.getContrasena());
                    out.println("</br>");

                }
            }
            else{
                out.println("Aun no hay clientes");
            }
            
            %>
            
     
            
             
    </body>
</html>
