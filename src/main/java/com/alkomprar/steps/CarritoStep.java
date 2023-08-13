package com.alkomprar.steps;

import com.alkomprar.pageObject.CarritoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CarritoStep {
    @Page
    CarritoPage carritoPage;

    @Step("ir al carrito y pagar")
    public void CarritoPagar(){
        carritoPage.getDriver().findElement(carritoPage.getIrALCarritoYPagar()).click();

    }
}
