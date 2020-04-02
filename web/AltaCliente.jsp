<%-- 
    Document   : AltaCliente
    Created on : 1/04/2020, 03:39:45 PM
    Author     : gmndi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro</h1>
        
        <h2>
        <% if(session.getAttribute("contador") == null){
            out.println("Tu numero de cliente es: 1");
        }
        else{
            out.println("Tu numero de cliente es: "+session.getAttribute("contador")); 
        }          
        %>
        </h2>
        
        <div class="wrapper">
            <h1>Registro</h1>
                <form action="ListaClientes.jsp" method="post">                         
                    Nombre:
                    <input type="text" name="Nombre" required><br>
                    Apellidos:
                    <input type="text" name="Apellido" required><br>
                    Direccion:
                    <input type="text" name="Direccion" required><br>
                    Código Postal:
                    <input type="number" name="Codigopostal" required><br>
                    Ciudad:
                    <input type="text" name="Ciudad" required><br>
                    Estado:
                    <input type="text" name="Estado" required><br>
                    Pais:
                    <input type="text" class="input" name="Pais" required><br><br>                 
                    Telefono:
                    <input type="number" name="Telefono" required><br>
                    Email:
                    <input type="email" name="Correo" required><br>
                    Fecha de nacimiento:
                    <input type="number" name="Fechanacimiento" required><br>                    
                    Contraseña:
                    <input type="password" name="Contra" required><br>
                    Repetir contraseña:
                    <input type="password" name="Confirmarcontra" required><br>
                    <button type="submit" name="BotonRegistro">Guardar</button>                  
            </form>
        </div>
        
    </body>
</html>
