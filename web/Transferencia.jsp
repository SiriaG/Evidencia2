<%-- 
    Document   : Transferencia
    Created on : 28/03/2020, 09:24:31 PM
    Author     : gmndi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hacer una transferencia </h1>
        
        
        <form action="Exito.jsp" method="post">
        
        Numero de cuenta propia:
        
        <input type="number" class="input" name="noCuenta" required><br><br>
     
        
        Numero de cuenta a depositar:
           <input type="number" class="input" name="noCuenta2" required><br><br>
        
           
               
        Monto:
           <input type="number" class="input" name="monto" required><br><br>
        
           
        Depositar:
        <input type="submit" value="Entrar"><br>
        
        
        
        
    </body>
</html>
