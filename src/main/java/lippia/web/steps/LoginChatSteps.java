package lippia.web.steps;

import io.cucumber.java.en.Given;
import lippia.web.services.LoginWebServices;

public class LoginChatSteps {
    @Given("El usuario se encuentra en la pagina de login de Zelmichat")
    public void elUsuarioSeEncuentraEnLaPaginaDeLoginDeZelmichat() {
        LoginWebServices.paginaLogin();
    }
}
