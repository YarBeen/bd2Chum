function showOfertaEditForm() {


    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-edit-form').style.display = "block";


}

function showOfertaDeleteForm() {

    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "block";


}
function showOfertaCreateForm() {

    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "block";
   


}