@Login @Regresion
Feature: Login

  Background:
    Given El usuario se encuentra en la pagina de login de Zelmichat

  @LoginExitoso @Smoke @Do
  Scenario: Iniciar sesion en la pagina de Zelmichat de manera exitosa
    When el usuario hace click en el boton Iniciar sesion con Google
    And el usuario ingresa sus credenciales validas
    Then el usuario es redirigido a la home, visualiza su nombre "Hola, Angelica"

  @LogoutExitosoZelmichat @Smoke @ReadyToAutomate @Do
  Scenario: Cerrar sesion en Zelmichat de manera exitosa
    Given el usuario se encuentra logueado en Zelmichat
    When el usuario hace click en el menu hamburguesa
    And el usuario hace click en el boton "Cerrar sesión"
    And el usuario hace click en el boton "Cerrar sesión" del popup
    Then el usuario vuelve a la pagina de login