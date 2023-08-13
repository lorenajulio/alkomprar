package com.alkomprar.steps;

import com.alkomprar.pageObject.ListaProductosPage;
import com.alkomprar.utils.Util;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ListaProductosStep {
    @Page
    Util util;
    @Page
    ListaProductosPage listaProductosPage;
    @Step("seleccion aleatoria")
    public void SeleccionAleatoria(){
        WebDriverWait wait = new WebDriverWait(listaProductosPage.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(listaProductosPage.txtVisualizar));
        WebElement producto = util.seleccionDatos(
                listaProductosPage.getDriver(),
                listaProductosPage.getTxtVisualizar()
        );
        producto.click();


    }
}
