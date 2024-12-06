package lippia.web.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginWebServices;

public class LoginWebSteps {
    @Given("El usuario <rol> se encuentra en la página de Login de Zelmira")
    public void elUsuarioRolSeEncuentraEnLaPáginaDeLoginDeZelmira( String rol) {
        LoginWebServices.pageLogin(rol);
    }
//@When("^El usuario ingresa el email (.*)")
    @When("El usuario ingresa su email <email>")
    public void elUsuarioIngresaElEmail(String email) {
        LoginWebServices.setEmail(email);
    }
    @And("El usuario ingresa su contraseña <password>")
    public void elUsuarioIngresaSuContraseñaPassword(String password) {
        LoginWebServices.setPassword(password);
    }
    @And("El usuario hace clic en el botón Ingresar")
    public void elUsuarioHaceClicEnElBotónIngresar() {
        LoginWebServices.clickOnEnterButton();
    }
    @Then("El usuario es redirigido a la vista <view>")
    public void elUsuarioEsRedirigidoALaVistaView(String view) {
        LoginWebServices.validateView(view);
    }

}
