#language: es
  Característica:Registro de usuario
    Yo como usuario quiero registrarme en la pagina

  @RegistroExitoso
  Escenario: Registro de usuario exitoso
    Dado que el usuario abre la pagania de alkomprar y de click en mi cuenta
    Cuando el usuario de clic en iniciar sesion y digita el correo, dando clic en continuar
    Y llene los campos del formulario y da click en autorizar
    Entonces da click en continuar y visualiza la pagina principal

