package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaProductosPage extends PageObject {

    public By getTxtVisualizar() {
        return txtVisualizar;
    }

    public By txtVisualizar = By.xpath("//*[@class=\"plp_breadcrumblist_link\"]");




}
