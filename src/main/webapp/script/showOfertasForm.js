function showOfertasEditForm() {

    document.getElementById('oferta-rechazar-form').style.display = "none";
    document.getElementById('oferta-accept-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-edit-form').style.display = "block";


}

function showOfertasDeleteForm() {
    document.getElementById('oferta-rechazar-form').style.display = "none";
    document.getElementById('oferta-accept-form').style.display = "none";
    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "block";


}
function showOfertasCreateForm() {
    document.getElementById('oferta-rechazar-form').style.display = "none";
    document.getElementById('oferta-accept-form').style.display = "none";
    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "block";

}
function showOfertasAcceptForm() {
    document.getElementById('oferta-rechazar-form').style.display = "none";
    document.getElementById('oferta-accept-form').style.display = "block";
    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-accept-form').style.display = "block";

}
function showOfertasRejectForm() {

    document.getElementById('oferta-accept-form').style.display = "none";
    document.getElementById('oferta-edit-form').style.display = "none";
    document.getElementById('oferta-borrar-form').style.display = "none";
    document.getElementById('oferta-create-form').style.display = "none";
    document.getElementById('oferta-rechazar-form').style.display = "block";

}
