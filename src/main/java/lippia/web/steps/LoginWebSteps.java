package lippia.web.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginWebServices;

public class LoginWebSteps {
    @Given("El usuario se encuentra en la pagina de login de Zelmira")
    public void elUsuarioSeEncuentraEnLaPaginaDeLoginDeZelmira() {
        LoginWebServices.pageLogin();
    }

    @And("El usuario debe contar con credenciales válidas")
    public void elUsuarioDebeContarConCredencialesVálidas() {
     
    }

    @When("El usuario ingresa el email")
    public void elUsuarioIngresaElEmail() {

    }

    @Then("El usuario es redirigido al Dashboard")
    public void elUsuarioEsRedirigidoAlDashboard() {

    }

    @And("El usuario hace click en el botón Ingresar")
    public void elUsuarioHaceClickEnElBotónIngresar() {
        LoginWebServices.clickOnLogInButton();
    }

}
