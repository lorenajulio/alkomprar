package com.alkomprar.steps;

import com.alkomprar.pageObject.ValidarCarritoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidarCarritoStep {
    @Page
    ValidarCarritoPage validarCarritoPage;

    @Step
    public void ValidarCarrito (){
        Assert.assertTrue(validarCarritoPage.getDriver().findElement(validarCarritoPage.getTxtValidar())
                .isDisplayed());
    }
}
