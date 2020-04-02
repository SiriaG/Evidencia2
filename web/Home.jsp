<%-- 
    Document   : Home
    Created on : 31/03/2020, 07:07:02 PM
    Author     : andi9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Home</title>
    </head>
       <body>
           <div class="home">
               <h1>¡Bienvenido! </h1>
               <text>Seleccione la opcion deseada</text>
               
          <ul>
              
              Administrador: <br>
              <li><a href="AltaCliente.jsp">Alta Cliente</a></li><br>
              <li><a href="AltaCuenta.jsp">Alta Cuenta</a></li><br>
              <li><a href="ListaClientes.jsp">Lista de Clientes</a></li><br>
              <li><a href="DetallesCuenta.jsp">Detalles de cuenta</a></li><br>
              <li><a href="DetallesCliente.jsp">Detalles de cliente</a></li><br>
          
              Cliente<br>
              <li><a href="Transferencia.jsp">Hacer una transferencia</a></li><br>
              <li><a href="Listatransferencias.html">Lista de transferencias</a></li><br>
            </ul>
        </div>
    </body>
</html>
