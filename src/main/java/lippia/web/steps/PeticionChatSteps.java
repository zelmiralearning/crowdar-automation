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

    @And("el usuario hace click en el boton Seleccionar manual")
    public void elUsuarioHaceClickEnElBotonSeleccionarManual() {
        PeticionChatService.ClickBtnSeleccManual();
    }

    @And("el usuario selecciona {string}")
    public void elUsuarioSelecciona(String seleccManual) {
        PeticionChatService.seleccionManual(seleccManual);
    }

    @And("el usuario hace click en el boton Seleccionar tipo de teoria")
    public void elUsuarioHaceClickEnElBotonSeleccionarTipoDeTeoria() {
        PeticionChatService.clickBtnSeleccionarTipoDeTeoria();
    }

    @And("el usuario selecciona el tipo de teoria {string}")
    public void elUsuarioSeleccionaElTipoDeTeoria(String tipoTeoria) {
        PeticionChatService.seleccionaElTipoDeTeoria( tipoTeoria);
    }

    @And("el usuario hace click en el boton Seleccionar color de adaptacion")
    public void elUsuarioHaceClickEnElBotonSeleccionarColorDeAdaptacion() {
        PeticionChatService.clickBtnSelecColorAdaptacion();
    }

    @And("el usuario selecciona el color {string}")
    public void elUsuarioSeleccionaElColor(String color) {
        PeticionChatService.seleccionaColor(color);
    }

    @And("el usuario ingresa {string} en la casilla")
    public void elUsuarioIngresaEnLaCasilla(String peticion) {
        PeticionChatService.ingresaComandoAdaptacion(peticion);
    }

    @And("el usuario hace click en el boton Enviar")
    public void elUsuarioHaceClickEnElBotonEnviar() {
        PeticionChatService.clickBtnEnviarPeticion();
    }

    @Then("se crea la peticion luego de unos segundos")
    public void seCreaLaPeticionLuegoDeUnosSegundos() {
        System.out.println("");
    }
}
