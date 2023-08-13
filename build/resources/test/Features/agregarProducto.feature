#language: es
  Característica: agregar producto al carrito
    Antecedentes:
      Dado que el usuario abre la pagania de alkomprar y de click en mi cuenta
      Cuando el usuario de clic en iniciar sesion y digita el correo, dando clic en continuar
      Y llene los campos del formulario y da click en autorizar
      Entonces da click en continuar y visualiza la pagina principal



    @AgregarProducto
    Escenario: agregar producto exitoso al carrito
      Dado que el usuario ingrese un producto y se seleccione un producto aleatorio
      Cuando agregue el producto al carrito
      Y de clic en ir a carrito y pagar
      Entonces validara su producto