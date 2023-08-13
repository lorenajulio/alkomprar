package com.alkomprar.steps;

import com.alkomprar.pageObject.AgregarCarritoPage;
import com.alkomprar.utils.Util;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AgregarCarritoStep {
    @Page
    AgregarCarritoPage agregarCarritoPage;
    @Page
    Util util;
    @Step("agregar producto al carrito")
    public void agregarCarrito() {
        util.scroll(agregarCarritoPage.getDriver(),agregarCarritoPage.getElementoScroll());

        agregarCarritoPage.getDriver().findElement(agregarCarritoPage.getBtnAgregar()).click();
    }
}
