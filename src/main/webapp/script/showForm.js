

function showButtonsPublicacion() {
    document.getElementById('botones-producto').style.display = "none";
    document.getElementById('botones-publicacion').style.display = "block";
    
}
function showButtonsProducto() {
    document.getElementById('botones-publicacion').style.display = "none";
    document.getElementById('botones-producto').style.display = "block";
}
function showPublicationForm() {
    document.getElementById('productForm').style.display = "none";
    document.getElementById('publicationForm').style.display = "block";

}
function hideAll() {


//    document.getElementById('botones-publicacion').style.display = "none";
//    document.getElementById('botones-producto').style.display = "none";
    //Forms
    document.getElementById('publication-edit-form').style.display = "none";
    document.getElementById('publication-borrar-form').style.display = "none";
    document.getElementById('publication-create-form').style.display = "none";
    document.getElementById('productForm-edit').style.display = "none";
    document.getElementById('productForm-Delete').style.display = "none";
    document.getElementById('productForm-create').style.display = "none";
}
function showPublicationCreateForm() {


    document.getElementById('publication-edit-form').style.display = "none";
    document.getElementById('publication-borrar-form').style.display = "none";
    document.getElementById('productForm-edit').style.display = "none";
    document.getElementById('productForm-Delete').style.display = "none";
    document.getElementById('productForm-create').style.display = "none";

    document.getElementById('publication-create-form').style.display = "block";



}
function showPublicationEditForm() {

    document.getElementById('publication-borrar-form').style.display = "none";
    document.getElementById('productForm-edit').style.display = "none";
    document.getElementById('productForm-Delete').style.display = "none";
    document.getElementById('productForm-create').style.display = "none";
    document.getElementById('publication-create-form').style.display = "none";
    document.getElementById('publication-edit-form').style.display = "block";
}
function showPublicationDeleteForm() {
    
    document.getElementById('productForm-edit').style.display = "none";
    document.getElementById('productForm-Delete').style.display = "none";
    document.getElementById('productForm-create').style.display = "none";
    document.getElementById('publication-create-form').style.display = "none";
    document.getElementById('publication-edit-form').style.display = "none";
    document.getElementById('publication-borrar-form').style.display = "block";
}
function showProductRegisterForm() {
    document.getElementById('publication-borrar-form').style.display = "none";
    document.getElementById('productForm-edit').style.display = "none";
    document.getElementById('productForm-Delete').style.display = "none";

    document.getElementById('publication-create-form').style.display = "none";
    document.getElementById('publication-edit-form').style.display = "none";
    document.getElementById('productForm-create').style.display = "block";
}

function showProductDeleteForm() {
    document.getElementById('publication-borrar-form').style.display = "none";
    document.getElementById('productForm-edit').style.display = "none";


    document.getElementById('publication-create-form').style.display = "none";
    document.getElementById('publication-edit-form').style.display = "none";
    document.getElementById('productForm-create').style.display = "none";
    document.getElementById('productForm-Delete').style.display = "block";
}
function showProductEditForm() {
    document.getElementById('publication-borrar-form').style.display = "none";



    document.getElementById('publication-create-form').style.display = "none";
    document.getElementById('publication-edit-form').style.display = "none";
    document.getElementById('productForm-create').style.display = "none";
    document.getElementById('productForm-Delete').style.display = "none";
    document.getElementById('productForm-edit').style.display = "block";
}
function showProductForm() {
    document.getElementById('publicationForm').style.display = "none";
    document.getElementById('productForm').style.display = "block";

}

