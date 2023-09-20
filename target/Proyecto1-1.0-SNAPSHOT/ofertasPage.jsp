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
         <link rel="stylesheet" type="text/css" href="styles/ofertasStyle.css">
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
        <p class="hola-usuario"><strong>Usuario:</strong> <%= session.getAttribute("user") %></p><br>
         <div class="botones">
             <form action="misOfertas" method="post">
            <input type="submit" value="Ver mis ofertas" />
             </form>
              <form action="misOfertasRecibidas" method="post">
            <input type="submit" value="Ver ofertas recibidas" />
             </form>
               <form action="todasPublicaciones" method="post">
            <input type="submit" value="Ver todas las publicaciones" />
             </form>
            <input type="button" value="Crear Oferta" onclick="showOfertasCreateForm()"/>
            <input type="button" value="Editar Oferta" onclick="showOfertasEditForm()"/>
            <input type="button" value="Borrar Oferta" onclick="showOfertasDeleteForm()"/>
         </div>
         <div class="form-container">
            <div id="oferta-edit-form" class="oferta-form">
                <form action="editOferta" method="post">
                    ID-Oferta<input type="number" name="oferta-edit-form-id-oferta" required/><br>
                    Precio-Regateo<input type="number" name="oferta-edit-form-precio" required/><br>
                 
                    Mensaje<input type="string" name="oferta-edit-form-mensaje" required/><br>
                   
                <input type="submit" value="Enviar"/>
                </form></div>


            <div id="oferta-borrar-form"  class="oferta-form"><form action="deleteOferta" method="post">
                    ID<input type="number" name="oferta-borrar-form-id" required/><br>

                    <input type="submit" value="Enviar"/>
                </form>
            </div>


            <div id="oferta-create-form"  class="oferta-form">
                <form action="createOferta" method="post">

                      Precio-Regateo<input type="number" name="oferta-create-form-precio" required/><br>
                    ID-Publicacion<input type="number" name="oferta-create-form-id-publicacion" required/><br>
                    Mensaje<input type="string" name="oferta-create-form-mensaje" required/><br>
                <input type="submit" value="Enviar"/>
                </form>
            </div>
         </div>
         <script src="script/showOfertasForm.js"></script>
    </body>
</html>
