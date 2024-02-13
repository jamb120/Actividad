<%-- 
    Document   : Respuesta
    Created on : 12/02/2024, 7:54:40 p. m.
    Author     : JOSE
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuesta a peticion</title>
    </head>
    <body>
        <h1>Lista de Usuarios registrados</h1>
        <%
            int cont =1;
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
               for(Usuario usu:listaUsuarios){
        
        %>
        <p><b>Usuario N°<%=cont%></b></p>
        <p>Nombre: <%=usu.getNombre()%> </p>
        <p>Contraseña: <%=usu.getContraseña()%> </p>
        <p>TIpo: <%=usu.getTipo()%></p>
        <p>------------------------------------------------</p>
        <%cont = cont +1;%>
        <%}%>
        
    </body>
</html>
