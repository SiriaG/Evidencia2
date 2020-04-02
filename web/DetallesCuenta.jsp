<%-- 
    Document   : DetallesCliente
    Created on : 31/03/2020, 12:44:55 AM
    Author     : siria
--%>

<%@page import="java.util.List"%>
<%@page import="com.example.model.Cuentas"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
        <h1>Detalles de la cuenta</h1>
        
        <a href="Home.jsp">Regresar</a> 
        
        <h2>Lista de clientes.</h2>
            
            <% ServletContext sc = getServletContext();
            
            if(sc.getAttribute("LISTACUENTAS")!=null){
                List<Cuentas> cuentas = (ArrayList<Cuentas>)sc.getAttribute("LISTACLIENTES"); 
                for(Cuentas cuenta : cuentas)
                {
                    out.println("No. Cliente: "+cuenta.getNoCliente());
                    out.println("</br>");
                    out.println("No. Cuenta: "+cuenta.getNoCuenta());
                    out.println("</br>");
                    out.println("Tipo de cuenta: "+cuenta.getTipo());
                    out.println("</br>");
                    out.println("Monto: "+cuenta.getMonto());
                    out.println("</br>");
                    

                }
            }
            else{
                out.println("Aun no hay cuentas");
            }
            
            %>
            
        
    </body>
</html>
