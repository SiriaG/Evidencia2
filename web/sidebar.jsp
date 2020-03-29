<%-- 
    Document   : sidebar
    Created on : 28/03/2020, 08:13:40 PM
    Author     : gmndi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 200px;
  background-color: #f1f1f1
}

li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

li a.active {
  background-color: #4CAF50;
  color: white;
}

li a:hover:not(.active) {
  background-color: #555;
  color: white;
}
</style>
</head>

<ul >
  <li><a href="Home">Home</a></li>
  <li><a href="altacliente">Alta Cliente</a></li>
  <li><a href="altacuenta">Alta Cuenta</a></li>
  <li><a href="listaclientes">Lista de Clientes</a></li>
  <li><a href="Detallescuenta">Detalles de cuenta</a></li>
  <li><a href="DetallesCliente">Detalles de cliente</a></li>

   
  <li><a href="DetallesCliente">Detalles de cuenta cliente</a></li>
  <li><a href="Transferencia">Hacer una transferencia</a></li>
  <li><a href="ListaTransferencias">Lista de transferencias</a></li>
  
  
</ul>


</body>
</html>


<!DOCTYPE html>
