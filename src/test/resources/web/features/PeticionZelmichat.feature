@PeticionZelmichat @Regression
Feature: Peticion Zelmichat

  @PeticionExitosaZelmichat @Smoke @ReadyToAutomate
  Scenario Outline: Realizar una peticion en Zelmichat de manera exitosa
    Given el usuarios se encuentra logueado en Zelmichat
    When el usuario carga el archivo "<nombreArchivo>"
    And el usuario ve cargado el archivo "<nombreArchivo>"
    And el usuario carga la imagen "<nomImagen>"
    And el usuario ve cargado el archivo "<nomImagen>"
    And el usuario hace click en el boton Seleccionar actividades
    And el usuario ve el popup de las Actividades
    And el usuario selecciona la "<Actividad>"
    And el usuario ve la actividad "<Actividad>" selecionada
    And el usuario hace click en el boton Aceptar de la actividad seleccionada
    And no se encuentra visible el popup de actividades
    And el usuario hace click en el boton Seleccionar manual
    And el usuario selecciona "<SeleccionManual>"
    And el usuario hace click en el boton Seleccionar tipo de teoria
    And el usuario selecciona el tipo de teoria "<TipoDeTeoria>"
    And el usuario hace click en el boton Seleccionar color de adaptacion
    And el usuario selecciona el color "<Color>"
    And el usuario ingresa "<Peticion>" en la casilla
    And el usuario hace click en el boton Enviar
    Then se crea la peticion luego de unos segundos

    Examples:
      | Actividad         | SeleccionManual     | nombreArchivo     | nomImagen  | TipoDeTeoria | Color    | Peticion              |
      | Verdadero o falso | Muy significativas  | 5gradoZelmira.pdf | lengua.png | Parrafo      | Rojo     | Adaptar esta peticion |
      | A completar       | Significativas      | 5gradoZelmira.pdf | lengua.png | Sin teoría   | Verde    | Adaptar esta peticion |
      | Unir con flechas  | Poco significativas | 5gradoZelmira.pdf | lengua.png | Parrafo      | Azul     | Adaptar esta peticion |
      | Opción múltiple   | Aplicar plantilla   | 5gradoZelmira.pdf | lengua.png | Sin teoría   | Amarillo | Adaptar esta peticion |