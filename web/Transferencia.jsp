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
        <link rel="stylesheet" href="style.css">
        <title>Tranferencia</title>
    </head>
    <body>
        <div class="transferencia">
        <h1>Hacer una transferencia </h1>
        <text> Ingrese una cuenta de retiro y una de deposito, indique los datos de la transferencia y de clic en "Continuar"</text><br><br>
                
        <form action="Exito.jsp" method="post">        
        Cuenta retiro:        
        <input type="number" class="input" name="noCuenta" required><br><br>
            
        Cuenta deposito:
           <input type="number" class="input" name="noCuenta2" required><br><br>
                                
        Importe MXN:
           <input type="number" class="input" name="monto" required><br><br>
                         
        <input type="submit" value="Continuar"><br>        
            </form>
        </div>    
=======
        <div class="transferencia">
        <h1>Hacer una transferencia </h1>
        <text> Ingrese una cuenta de retiro y una de deposito, indique los datos de la transferencia y de clic en "Continuar"</text><br><br>
                
        <form action="Exito.jsp" method="post">        
        Cuenta retiro:        
        <input type="number" class="input" name="noCuenta" required><br><br>
            
        Cuenta deposito:
           <input type="number" class="input" name="noCuenta2" required><br><br>
                                
        Importe MXN:
           <input type="number" class="input" name="monto" required><br><br>
                         
        <input type="submit" value="Continuar"><br>        
            </form>
        </div>    
