@Login @Regression
Feature: Login Zelmira

Background:
Given Estar en la pagina de login de Zelmira https://preprod-super-admin.zelmiralearning.com/login

@LoginExitoso @Smoke
Scenario: Login exitoso en Zelmira
And El usuario debe contar con credenciales válidas
When El usuario hace clic en la caja de texto "Email"
And El usuario ingresa su email "d.andresperalta@outlook.com"
And El usuario hace clic en la caja de texto "Contraseña"
And El usuario ingresa su contraseña "Zelmira24$"
And El usuario hace clic en el botón "Ingresar"
Then El usuario se logea
And El usuario es redirigido al Dashboard