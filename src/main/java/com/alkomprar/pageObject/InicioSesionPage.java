package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class InicioSesionPage extends PageObject {
    private final By btnCuenta = By.xpath("//li[@id='js-myaccount-header']");

    private final By btnMiPerfil = By.xpath("//li[contains(@class, 'js-my-account-menu-item') and @data-name='MyProfileLink']//a");

    public By getBtnCuenta() {
        return btnCuenta;
    }

    public By getBtnMiPerfil() {
        return btnMiPerfil;
    }
}