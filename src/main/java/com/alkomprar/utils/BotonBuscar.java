package com.alkomprar.utils;


import com.alkomprar.pageObject.BusquedaProductoPage;
import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BotonBuscar extends PageObject {
    private WebDriver driver;

        @Page
        BusquedaProductoPage busquedaproductoPage;


        public BotonBuscar (WebDriver driver) {
            this.driver = driver;
        }
        public void habilitarBotonBuscar() {
            WebElement botonBuscar = driver.findElement(busquedaproductoPage.getBtnBuscar());

            if (botonBuscar.getAttribute("disabled") != null) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('disabled');", botonBuscar);
}
        }
        public void espera(){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(busquedaproductoPage.getBtnBuscar()));

        }
}