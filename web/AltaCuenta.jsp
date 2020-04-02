<%-- 
    Document   : AltaCuenta
    Created on : 1/04/2020, 05:17:39 PM
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
        <div class="registro">
            <h1>Alta de Cuenta</h1>
            <form action="Altacuenta" method="post">            
                    Número de cliente:
                    <input type="number" name="nocliente" required><br><br>
                    Número de cuenta:
                    <input type="number" name="nocuenta" required><br><br>
                    Tipo de cuenta:
                    <select>
                        <option name="monto" value="DEBITO">Debito</option>
                        <option name="monto" value="RETIRO">Retiro</option>
                    </select><br><br>
                    Monto:                    
                    <input type="number" name="monto" required><br><br>
                    Fecha:
                    <input type="number" name="fecha" required><br><br>
                    <button type="submit" name="BotonRegistro">Guardar</button>
            </form>
        </div>
    </body>
</html>
