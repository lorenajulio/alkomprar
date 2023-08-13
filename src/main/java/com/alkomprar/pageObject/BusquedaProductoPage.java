package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaProductoPage extends PageObject {
    private final By txtBusqueda = By.xpath("//input[@id='js-site-search-input']");

    private final By btnBuscar = By.xpath("//button[@id='js-search-button']");


    public By getBtnBuscar() {return btnBuscar;
    }

    public By getTxtBusqueda() {
        return txtBusqueda;
    }
}
