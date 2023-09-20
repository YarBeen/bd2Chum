<%-- 
    Document   : comprarOVender
    Created on : Sep 16, 2023, 10:19:52 PM
    Author     : Yarman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buy or Sell</title>
   <script>
        var userFromSession = '<%= session.getAttribute("user") %>';
        console.log(typeof userFromSession);
        if (userFromSession === "null" || userFromSession === "") {
   
            window.location.href = "indexNotLogged.jsp";
        }
    </script>

    
    <script src="script/checkLoggedStatus.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/comprarOVenderStyle.css">
</head>
<body>
    <p class="hola-usuario"><strong>Usuario:</strong> <%= session.getAttribute("user") %></p><br>

    <div class="button-container">
        <a href="tendencias.jsp" class="button">Tendencias</a>
        <a href="sellPage.jsp" class="button">Vender</a>
        <a href="ofertasPage.jsp" class="button">Comprar</a>
    </div>
</body>
</html>