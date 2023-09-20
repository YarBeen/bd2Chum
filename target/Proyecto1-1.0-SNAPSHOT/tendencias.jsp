<%-- 
    Document   : tendencias
    Created on : Sep 17, 2023, 5:22:25 PM
    Author     : Yarman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="styles/tendenciasStyle.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tendencias</title>
         <script>
        var userFromSession = '<%= session.getAttribute("user") %>';
        console.log(typeof userFromSession);
        if (userFromSession === "null" || userFromSession === "") {
            // User is not logged in, redirect to indexFail.jsp
            window.location.href = "indexNotLogged.jsp";
        }
    </script>

    
    <script src="script/checkLoggedStatus.js"></script>
    </head>
    <body>
        <div class="user-container">
        <p class="hola-usuario"><strong>Usuario:</strong></p>
        <h1 class="user-name"><%= session.getAttribute("user") %></h1>
    </div>

        <div class="button-container">
            
            <form action="categoryPub" method="post">
            <input type="submit" value="Mostrar Categorias con mas Publicaciones"  />
            </form> 
            <form action="categoryOffer" method="post">
            <input type="submit" value="Mostrar Categorias con mas ofertas"  />
            </form>
        </div>
    </body>
</html>
