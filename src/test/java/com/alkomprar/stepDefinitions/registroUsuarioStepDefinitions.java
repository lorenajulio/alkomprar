package com.alkomprar.stepDefinitions;


import com.alkomprar.steps.InicioSesionSteps;

import com.alkomprar.steps.RegistroCorreoSteps;
import com.alkomprar.steps.ValidacionRegistroStep;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class registroUsuarioStepDefinitions {
    @Steps
    InicioSesionSteps inicioSesion;
    @Steps
    RegistroCorreoSteps registroCorreoSteps;
    @Steps
    ValidacionRegistroStep validacionRegistroStep;

    @Dado("que el usuario abre la pagania de alkomprar y de click en mi cuenta")
    public void queElUsuarioAbreLaPaganiaDeAlkomprarYDeClickEnMiCuenta() {
        inicioSesion.abrirNavegador();


    }
    @Cuando("el usuario de clic en iniciar sesion y digita el correo, dando clic en continuar")
    public void elUsuarioDeClicEnIniciarSesionYDigitaElCorreoDandoClicEnContinuar() {
        inicioSesion.clicInicioSesion();
        registroCorreoSteps.enviarCorreo();
        registroCorreoSteps.clickContinuar();

    }
    @Cuando("llene los campos del formulario y da click en autorizar")
    public void lleneLosCamposDelFormularioYDaClickEnAutorizar() {
        registroCorreoSteps.enviarNombre();
        registroCorreoSteps.enviarApellido();
        registroCorreoSteps.enviarTelefono();
        registroCorreoSteps.checkbox();


    }
    @Entonces("da click en continuar y visualiza la pagina principal")
    public void daClickEnContinuarYVisualizaLaPaginaPrincipal() {
        registroCorreoSteps.clickContinuarRegistro();
        validacionRegistroStep.validacionRegistro();

    }


}
