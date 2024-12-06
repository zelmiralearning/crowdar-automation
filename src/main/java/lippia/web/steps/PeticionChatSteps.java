package lippia.web.steps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginWebServices;
import lippia.web.services.PeticionChatService;

public class PeticionChatSteps {
    @Given("el usuarios se encuentra logueado en Zelmichat")
    public void elUsuariosSeEncuentraLogueadoEnZelmichat() {
        PeticionChatService.paginaLoginChat();
        PeticionChatService.usuarioLogeado();
    }


    @When("el usuario hace click en el boton de {string}")
    public void elUsuarioHaceClickEnElBotonDe(String boton) {
        PeticionChatService.clickBotonArchivo();
    }
}
