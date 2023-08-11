package com.alkomprar.pageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InicioSesionPage extends PageObject {
    private final By btnCuenta = By.xpath("//li[@id='js-myaccount-header']");

    private  final By btnInicioSesion =By.xpath("//li[@id='js-myaccount-header']/div[@class='nav-toggle-menu']/ul[@class='list-my-account js-mobile-menu-container']/li[@data-name='login-logout']/a");

    public By getBtnCuenta() {
        return btnCuenta;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

    public  void HoverElemento(){
        withAction().moveToElement(getDriver().findElement(getBtnCuenta())).build().perform();
    }
}

