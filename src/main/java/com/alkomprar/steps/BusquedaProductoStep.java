package com.alkomprar.steps;

import com.alkomprar.models.Credenciales;
import com.alkomprar.pageObject.BusquedaProductoPage;
import com.alkomprar.utils.BotonBuscar;
import com.alkomprar.utils.Util;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class BusquedaProductoStep {
    @Page
    BusquedaProductoPage busquedaProductoPage;
    @Page
    BotonBuscar botonBuscar;
    @Page
    Util util;



    @Step("Busqueda de producto")
    public void BusquedaProducto(){
        String producto = Credenciales.Data().get(0).get("Producto");
        busquedaProductoPage.getDriver().findElement(busquedaProductoPage.getTxtBusqueda()).sendKeys(producto);
        botonBuscar.espera();
        botonBuscar.habilitarBotonBuscar();
        busquedaProductoPage.getDriver().findElement(busquedaProductoPage.getBtnBuscar()).click();

    }


}
