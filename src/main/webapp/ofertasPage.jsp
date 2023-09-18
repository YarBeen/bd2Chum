<%-- 
    Document   : ofertasPage
    Created on : Sep 17, 2023, 1:15:17 AM
    Author     : Yarman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ofertas</title>
    </head>
    <body>
         <div class="botones">
            <input type="button" value="Ver mis ofertas" onclick="showOfertasForm()"/>
            <input type="button" value="Crear Oferta" onclick="showOfertasCreateForm()"/>
            <input type="button" value="Editar Oferta" onclick="showOfertasEditForm()"/>
            <input type="button" value="Borrar Oferta" onclick="showOfertasDeleteForm()"/>
         </div>
    </body>
</html>
