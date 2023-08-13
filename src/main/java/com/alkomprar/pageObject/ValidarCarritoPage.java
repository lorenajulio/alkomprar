package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarCarritoPage extends PageObject {

    private final By TxtValidar = By.xpath("//h1[@class='module-title font-title--big-title js-cart-title ']");
    public By getTxtValidar() {
        return TxtValidar;
    }

}
