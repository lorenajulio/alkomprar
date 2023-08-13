package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPage extends PageObject {
    private final By inputCorreo = By.xpath("//input[@id='js-login-email']");
    private final By btnContinuarCorreo = By.xpath("//button[@id='js-login-continue']");

    private final By inputNombre = By.xpath("//input[@id='register.firstName']");
    private final By inputApellido = By.xpath("//input[@id='register.lastName']");
    private final By inputCelular = By.xpath("//*[@id='register.mobileNumber']");
     private  final By Checkbox = By.xpath("//*[@id='alkostoRegisterForm']/div[7]/label");
     private final By btnContinuarRegistro = By.xpath("//button[@class='button-primary btn-block js-btn-register-myaccount']");


    public By getCheckbox() {
        return Checkbox;
    }

    public By getBtnContinuarRegistro() {
        return btnContinuarRegistro;
    }

    public By getInputCorreo() {
        return inputCorreo;
    }
    public By getBtnContinuarCorreo() {
        return btnContinuarCorreo;
    }
    public By getInputApellido() {return inputApellido;}

    public By getInputNombre() {return inputNombre;
    }
    public By getInputCelular() { return inputCelular; }

}


