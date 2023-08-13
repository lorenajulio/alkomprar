package com.alkomprar.steps;

import com.alkomprar.pageObject.InicioSesionPage;

import com.alkomprar.utils.Util;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.WithDriver;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class InicioSesionSteps {

    @Page
    InicioSesionPage inicio;
    @Page
    Util util;



    @Step("Abrir el navegador y hover sobre mi cuenta ")
    public void abrirNavegador() {
        inicio.openUrl("https://www.alkomprar.com");
        util.HoverElemento(inicio.getBtnCuenta());
    }
    @Step("clic en iniciar sesion")
    public  void clicInicioSesion(){

        inicio.getDriver().findElement(inicio.getBtnMiPerfil()).click();

    }




}


