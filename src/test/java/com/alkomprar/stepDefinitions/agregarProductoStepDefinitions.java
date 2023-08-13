package com.alkomprar.stepDefinitions;


import com.alkomprar.steps.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class agregarProductoStepDefinitions {

    @Steps
    BusquedaProductoStep busquedaProductoStep;
    @Steps
    ListaProductosStep listaProductosStep;
    @Steps
    AgregarCarritoStep agregarCarritoStep;
    @Steps
    CarritoStep carritoStep;
    @Steps
    ValidarCarritoStep validarCarritoStep;

    @Dado("que el usuario ingrese un producto y se seleccione un producto aleatorio")
    public void queElUsuarioIngreseUnProductoYSeSeleccioneUnProductoAleatorio() {

      busquedaProductoStep.BusquedaProducto();
      listaProductosStep.SeleccionAleatoria();
    }
    @Cuando("agregue el producto al carrito")
    public void agregueElProductoAlCarrito() {
        agregarCarritoStep.agregarCarrito();


    }
    @Cuando("de clic en ir a carrito y pagar")
    public void deClicEnIrACarritoYPagar() {
        carritoStep.CarritoPagar();

    }
    @Entonces("validara su producto")
    public void validaraSuProducto() {
        validarCarritoStep.ValidarCarrito();


    }

}
