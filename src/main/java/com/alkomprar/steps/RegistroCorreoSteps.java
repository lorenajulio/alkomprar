package com.alkomprar.steps;

import com.alkomprar.pageObject.RegistroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import com.alkomprar.models.Credenciales;

public class RegistroCorreoSteps {

    @Page
    RegistroPage registroPage;

    @Step("Enviar Campo Correo")
    public void enviarCorreo(){

        String correo = Credenciales.Data().get(0).get("Correo");
         registroPage.getDriver().findElement(registroPage.getInputCorreo()).sendKeys(correo);

    }
    @Step("Click en continuar")
    public void  clickContinuar(){
        registroPage.getDriver().findElement(registroPage.getBtnContinuarCorreo()).click();
    }
    @Step("enviar Nombre")
    public void  enviarNombre(){
        // captura y envio de datos por excel
        String nombre = Credenciales.Data().get(0).get("Nombre");
        registroPage.getDriver().findElement(registroPage.getInputNombre()).sendKeys(nombre);

    }
    @Step("enviar Apellido")
    public void  enviarApellido(){
        // captura y envio de datos por excel
        String apellido = Credenciales.Data().get(0).get("Apellido");
        registroPage.getDriver().findElement(registroPage.getInputApellido()).sendKeys(apellido);

    }
    @Step("enviar telefono")
    public void enviarTelefono(){
       String celular =Credenciales.Data().get(0).get("Telefono");
       registroPage.getDriver().findElement(registroPage.getInputCelular()).sendKeys(celular);
    }

    @Step("hacer checkbox")
    public void checkbox() {

            registroPage.getDriver().findElement(registroPage.getCheckbox()).click();
        }
    @Step("hacer checkbox")
    public void clickContinuarRegistro() {

        registroPage.getDriver().findElement(registroPage.getBtnContinuarRegistro()).click();
    }


    }






