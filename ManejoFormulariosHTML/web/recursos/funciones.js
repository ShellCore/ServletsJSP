function validarForma(forma) {
    // Validamos el usuario
    var user = forma.user;
    if (user.value == "" || user.valie == "Escribir usuario") {
        alert("Debe de proporcionar un nombre de usuario");
        user.focus();
        user.select();
        return false;
    }
    
    // Validamos la contraseña
    var pass = forma.pass;
    if (pass.value == "" || pass.value.length < 3) {
        alert("Debe de proporcionar una contraseña de al menos 3 caracteres");
        pass.focus();
        pass.select();
        return false;
    }
    
    // Validamos las tecnologías de interés
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    // Revisamos si se seleccionó algún checkbox
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    
    if (!checkSeleccionado) {
        alert("Debe proporcionar alguna tecnología");
        return false;
    }
    
    // Validamos el género
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    // Revisamos si se seleccionó algún radioButton
    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    
    if (!radioSeleccionado) {
        alert("Debe proporcionar alguna tecnología");
        return false;
    }
    
    // Validamos la ocupación
    var ocupacion = forma.ocupacion;
    if (ocupacion.value == "") {
        alert("Debe seleccionar una ocupación");
        return false;
    }
    
    // Formulario validado
    alerlt("Formulario válido. Enviando datos...");
    return true;
}

