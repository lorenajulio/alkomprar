package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    private final By IrALCarritoYPagar = By.xpath("//a[@class='button-primary js-animateBeforeSend js-delayLocation js-sf-go-to-cart']");
    public By getIrALCarritoYPagar() {
        return IrALCarritoYPagar;
    }


}
