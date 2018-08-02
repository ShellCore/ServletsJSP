var capa;

function cambio(idCapa) {
    // Recuperamos la capa según el elemento disponible
    if (document.layers) {
        capa = eval("document." + idCapa);
    }
    if (document.all) {
        capa = eval(idCapa + ".style");
    }
    if (document.getElementById) {
        capa = eval('document.getElementById("' + idCapa + '").style');
    }
    
    // Si está oculta la capa, la mostramos, en caso contrario, la ocultamos
    if ((capa.visibility == "hidden")
            || (capa.visibility == "hide")) {
        capa.visibility = (document.layers) ? "show" : "visible";
    } else {
        capa.visibility = (document.layers) ? "hide" : "hidden";
    }
}