<%-- 
    Document   : sellPage
    Created on : Sep 16, 2023, 11:55:03 PM
    Author     : Yarman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vender</title>
        <link rel="stylesheet" type="text/css" href="styles/sellPageStyle.css">
        <script>
             var userFromSession = '<%= session.getAttribute("user")%>';
             console.log(typeof userFromSession);
             if (userFromSession === "null" || userFromSession === "") {

                 window.location.href = "indexNotLogged.jsp";
             }
        </script>


        <script src="script/checkLoggedStatus.js"></script>
    </head>
    <body>
        <p class="hola-usuario"><strong>Usuario:</strong> <%= session.getAttribute("user")%></p><br>
        <div class="botones">
            <input type="button" value="Publicacion" onclick="showButtonsPublicacion()"/>
            <input type="button" value="Producto" onclick="showButtonsProducto()" />
            <div class="ceb-buttons">
                <div id="botones-publicacion" class="ceb-publicacion">
                    <input type="button" value="Crear" onclick="showPublicationCreateForm()" />
                    <input type="button" value="Editar" onclick="showPublicationEditForm()" />
                    <input type="button" value="Borrar" onclick="showPublicationDeleteForm()" />
                    <form action="misPublicaciones">
                        <input type="submit" value="Mis Publicaciones"/>
                    </form>
                </div>
                <div id="botones-producto" class="ceb-producto">
                    <input type="button" value="Registrar" onclick="showProductRegisterForm()" />
                    <input type="button" value="Editar" onclick="showProductEditForm()" />
                    <input type="button" value="Borrar" onclick="showProductDeleteForm()" />
                    <form action="misProductos">
                        <input type="submit" value="Mis Productos"/>
                    </form>
                </div></div>
        </div>

        <div class="form-container">

            <div id="publication-edit-form" class="publicacion-form">
                <form action="editPublicacion" method="post">
                    ID<input type="number" name="publication-edit-form-id" required/><br>
                    
                    Titulo<input type="string" name="publication-edit-form-titulo" required/><br>
                    Estado<input type="string" name="publication-edit-form-estado" required/><br>
                    Precio<input type="number" name="publication-edit-form-precio" required/><br>
                    <input type="submit" value="Enviar"/>
                </form></div>


            <div id="publication-borrar-form"  class="publicacion-form"><form action="deletePublicacion" method="post">
                    ID<input type="number" name="publication-borrar-form-id" required/><br>

                    <input type="submit" value="Enviar"/>
                </form>
            </div>


            <div id="publication-create-form"  class="publicacion-form">
                <form action="createPublicacion" method="post">

                    ID-Producto<input type="number" name="publication-create-form-id-producto" required/><br>
                    Titulo<input type="string" name="publication-create-form-titulo" required/><br>
                    Estado<input type="string" name="publication-create-form-estado" required/><br>
                    Precio<input type="number" name="publication-create-form-precio" required/><br>
                    <input type="submit" value="Enviar"/>
                </form>
            </div>


            <div id="productForm-edit" class="producto-form">
                <form action="editProduct" method="post">
                    ID<input type="number" name="productForm-edit-id"/><br>

                    Nombre<input type="string" name="productForm-edit-nombre" required/><br>
                    Descripcion<input type="string" name="productForm-edit-descripcion" required/><br>



                    <input type="submit" value="Enviar"/>

                </form> </div>
            <div id="productForm-Delete" class="producto-form">
                <form action="deleteProduct" method="post">
                    ID<input type="number" name="productForm-Delete-id"/><br>



                    <input type="submit" value="Enviar"/>

                </form> </div>
            <div id="productForm-create" class="producto-form">
                <form action="createProducto" method="post">


                    Nombre<input type="string" name="productForm-create-nombre" required/><br>
                    Descripcion<input type="string" name="productForm-create-descripcion" required/><br>
                    ID-Categoria<input type="number" name="productForm-create-categoria"/><br>


                    <input type="submit" value="Enviar"/>

                </form> </div>
        </div>
        <script src="script/showForm.js"></script>

    </body>
</html>
