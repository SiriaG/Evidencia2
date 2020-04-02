<%-- 
    Document   : index
    Created on : 1/04/2020, 03:44:47 PM
    Author     : gmndi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Bienvenido</title>
    </head>
    <body>
        
        
        <div class ="login">
            <img class="avatar" src="img/bancoo.png" alt="logobanco">
            <h1>Iniciar sesion</h1>

            <form action="Home" method="post">

            

                Número de cliente:
                <input type="text" name="usuario" required> <br> <br>
                Clave de acceso:
                <input type="password" name="contrasena" required><br><br>      
                
                <input type="submit" value="Entrar"><br>
                
                
            </form>
        </div>
    </body>
</html>
