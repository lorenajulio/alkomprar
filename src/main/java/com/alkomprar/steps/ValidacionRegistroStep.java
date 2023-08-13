package com.alkomprar.steps;

import com.alkomprar.pageObject.ValidacionRegistroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidacionRegistroStep {
    @Page
    ValidacionRegistroPage validacionRegistro;

    @Step
    public void validacionRegistro (){
        Assert.assertTrue(validacionRegistro.getDriver().findElement(validacionRegistro.getValidaicon())
                .isDisplayed());
    }
}
