package com.alkomprar.utils;


import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class Util extends PageObject {





    public  void HoverElemento (By elemento){
        withAction().moveToElement(getDriver().findElement(elemento)).build().perform();
    }
      public   WebElement seleccionDatos(WebDriver driver, By elementoWeb){
        List<WebElement> coleccion = driver.findElements(elementoWeb);
        Random random= new Random();
        int indexRandom= random.nextInt(coleccion.size());
        return coleccion.get(indexRandom);



    }
    public void scroll( WebDriver driver,By element){

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement elementToScroll = driver.findElement(element);

        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);

    }


}

