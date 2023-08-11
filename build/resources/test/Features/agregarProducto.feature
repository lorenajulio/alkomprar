#language: es
  Característica: agregar producto al carrito

    @AgregarProducto
    Escenario: agregar producto exitoso al carrito
      Dado que el usuario ingrese un producto y se seleccione un producto aleatorio
      Cuando agregue el producto al carrito
      Y de clic en ir a carrito y pagar
      Entonces validara su producto