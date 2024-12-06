package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginWebServices;
import lippia.web.services.PeticionChatService;
import junit.framework.Assert;

public class PeticionChatSteps {
    @Given("el usuarios se encuentra logueado en Zelmichat")
    public void elUsuariosSeEncuentraLogueadoEnZelmichat() {
        PeticionChatService.paginaLoginChat();
        PeticionChatService.usuarioLogeado();
    }


    @When("el usuario carga el archivo {string}")
    public void elUsuarioCargarElArchivo(String nomArchivo) {
        PeticionChatService.accionCargarArchivo(nomArchivo);
    }

    @And("el usuario ve cargado el archivo {string}")
    public void elUsuarioVeCargadoEl(String nomArchivo) {
        Assert.assertTrue("[WARNING] El usuario no ve cargado el archivo " + nomArchivo, PeticionChatService.buscarArchivoCargado(nomArchivo));
    }

    @And("el usuario carga la imagen {string}")
    public void elUsuarioCargaLaImagen(String nomImagen) {
        PeticionChatService.accionCargarImagen(nomImagen);
    }

    @And("el usuario hace click en el boton Seleccionar actividades")
    public void elUsuarioHaceClickEnElBotonSeleccionarActividades() {
        PeticionChatService.clicSeleccionarActividades();
    }
    @And("el usuario ve el popup de las Actividades")
    public void elUsuarioVeElPopupDeLasActividades() {
        Assert.assertTrue("[WARNING] El usuario no ve el popup de las Actividades",PeticionChatService.verPopUpActividades());
    }

    @And("el usuario selecciona la {string}")
    public void elUsuarioSeleccionaLa(String nomActividad) {
        PeticionChatService.seleccionDeActividad(nomActividad);
    }

    @And("el usuario ve la actividad {string} selecionada")
    public void elUsuarioVeLaActividadSelecionada(String nomActividad) {
        Assert.assertTrue("[WARNING] El usuario no ve la actividad " + nomActividad + " selecionada", PeticionChatService.buscarActividadSeleccionada(nomActividad));
    }

    @And("el usuario hace click en el boton Aceptar de la actividad seleccionada")
    public void elUsuarioHaceClickEnElBotonAceptarDeLaActividadSeleccionada() {
        PeticionChatService.clickBtnAceptarActividaSeleccionada();
    }
    @And("no se encuentra visible el popup de actividades")
    public void noSeEncuentraVisibleElPopupDeActividades() {
        Assert.assertFalse("[WARNING] El popup de las Actividades esta visible, cuando no deberia estar",PeticionChatService.verPopUpActividades());
    }
}
