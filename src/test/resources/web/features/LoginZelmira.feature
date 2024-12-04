@Login @Regression
Feature: Login Zelmira

  Background:
    Given El usuario se encuentra en la pagina de login de Zelmira

  @LoginExitoso @Smoke @ReadyToAutomate
  Scenario: Login exitoso en Zelmira
    And El usuario debe contar con credenciales válidas
    When El usuario ingresa el email
    And El usuario ingresa la contraseña
    And El usuario hace click en el botón Ingresar
    Then El usuario es redirigido al Dashboard
