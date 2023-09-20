function showOfertasEditForm() {


    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-edit-form').style.display = "block";


}

function showOfertasDeleteForm() {

    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "block";


}
function showOfertasCreateForm() {

    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "block";
   


}