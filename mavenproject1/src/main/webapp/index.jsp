<%-- 
    Document   : index
    Created on : 12/02/2024, 4:43:36 p. m.
    Author     : JOSE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crear nuevo usuario</h1>
        <br><br>
        <form action="Svusuarios" method="POST">
            <p><label>Nombre de usuario:</label> <input type="text" name="Nombre"/></p>
            
            <p><label>Contraseña:</label> <input type="text" name="Contraseña"/></p>
             
            <p><label>Tipo de usuario:</label> <input type="text" name="Tipo"/></p>
             
            <p> <button type="submit">enviar</button> </p>
        </form>
        <form action="Svusuarios" method="GET">
            <button type="submit" > revisar usuarios </button>
        </form>
    </body>
</html>
