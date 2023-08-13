package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarCarritoPage extends PageObject {


    private final By elementoScroll = By.xpath("(//div[@class='new-container__header__title'] )[1]");
    private final By btnAgregar = By.xpath("(//button[@id='addToCartButton'])[1]");
    public By getBtnAgregar() {
        return btnAgregar;
    }

    public By getElementoScroll() {
        return elementoScroll;
    }

}
