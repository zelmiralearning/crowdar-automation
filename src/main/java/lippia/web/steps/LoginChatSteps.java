package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginWebServices;

public class LoginChatSteps {
    @Given("El usuario se encuentra en la pagina de login de Zelmichat")
    public void elUsuarioSeEncuentraEnLaPaginaDeLoginDeZelmichat() {
        LoginWebServices.paginaLogin();
    }


    @When("el usuario hace click en el boton Iniciar sesion con Google")
    public void elUsuarioHaceClickEnElBotonIniciarSesionConGoogle() {
        LoginWebServices.clickBtnLogin();
    }


    @And("el usuario ingresa sus credenciales validas")
    public void elUsuarioIngresaSusCredencialesValidas() {
        LoginWebServices.ingresaCredenciales();
    }

    @Then("el usuario es redirigido a la home, visualiza su nombre {string}")
    public void elUsuarioEsRedirigidoALaHomeVisualizaSuNombre(String nombreUsuario) {
        String lblUsuarioLogeado = LoginWebServices.getNomUsuarioLogeado();
        junit.framework.Assert.assertTrue("[WARNING] No es el usuario esperado", lblUsuarioLogeado.contains(nombreUsuario));
    }

    @Given("el usuario se encuentra logueado en Zelmichat")
    public void elUsuarioSeEncuentraLogueadoEnZelmichat() {
        LoginWebServices.usuarioLogeado();
    }

    @When("el usuario hace click en el menu hamburguesa")
    public void elUsuarioHaceClickEnElMenuHamburguesa() {
        LoginWebServices.clickMenuHambuerguesa();
    }

    @And("el usuario hace click en el boton {string}")
    public void elUsuarioHaceClickEnElBoton(String boton) {
        LoginWebServices.clickCerrarSesion();
    }

    @And("el usuario hace click en el boton {string} del popup")
    public void elUsuarioHaceClickEnElBotonDelPopup(String boton) {
        LoginWebServices.clickBtnPopup();
    }

    @Then("el usuario vuelve a la pagina de login")
    public void elUsuarioVuelveALaPaginaDeLogin() {
        LoginWebServices.paginaLogin();
    }
}
