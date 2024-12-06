@PeticionZelmichat @Regression
Feature: Peticion Zelmichat

  @PeticionExitosaZelmichat @Smoke @ReadyToAutomate
  Scenario Outline: Realizar una peticion en Zelmichat de manera exitosa
    Given el usuarios se encuentra logueado en Zelmichat
    When el usuario hace click en el boton de "Cargar archivo"
    #And el usuario selecciona un archivo
    #And el usuario hace click en el boton "Cargar imagen complementaria"
    #And el usuario selecciona un archivo
    #And el usuario hace click en el boton "Seleccionar actividades"
    #And el usuario selecciona <Actividad>
    #And el usuario hace click en el boton "Aceptar"
    #And el usuario hace click en el boton "Seleccionar manual"
    #And el usuario selecciona <SeleccionManual>
    #And el usuario hace click en el boton "Seleccionar tipo de teoria"
    #And el usuario selecciona <TipoDeTeoria>
    #And el usuario hace click en el boton "Seleccionar color de adaptación"
    #And el usuario selecciona <Color>
    #And el usuario ingresa <Peticion> en la casilla
    #And el usuario hace click en el boton "Enviar"
    #Then se crea la peticion luego de unos segundos

    Examples:
      | Actividad         | SeleccionManual     | TipoDeTeoria | Color    | Peticion              |
      | Verdadero o falso | Muy significativas  | Parrafo      | Azul     | Adaptar esta peticion |
      #| A completar       | Significativas      | Sin teoria   | Verde    | Adaptar esta peticion |
      #| Unir con flechas  | Poco significativas | Parrafo      | Rojo     | Adaptar esta peticion |
      #| Opcion multiple   | Aplicar plantilla   | Sin teoria   | Amarillo | Adaptar esta peticion |