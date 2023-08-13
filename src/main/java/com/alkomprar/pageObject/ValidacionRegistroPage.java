package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionRegistroPage extends PageObject {

    private final By Validaicon = By.xpath("//div[@class='account-section-header visible module-title']");

    public By getValidaicon() {
        return Validaicon;
    }


}
