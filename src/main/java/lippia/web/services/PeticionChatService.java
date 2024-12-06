package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PeticionChatConstants;
import lippia.web.utils.ColorPicker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class PeticionChatService {
    public static void paginaLoginChat() {
        navigateTo(PropertyManager.getProperty("chat.base.url"));
    }

    public static void usuarioLogeado() {
        WebActionManager.waitClickable(PeticionChatConstants.INICIAR_SESION_GOOGLE).click();

        String email = PropertyManager.getProperty("chat.user.email");
        String password = PropertyManager.getProperty("chat.user.password");

        WebActionManager.setInput(PeticionChatConstants.INGRESA_EMAIL, email);
        WebActionManager.click(PeticionChatConstants.BOTON_SIGUIENTE);

        WebActionManager.setInput(PeticionChatConstants.INGRESA_CONTRASENA, password);
        WebActionManager.click(PeticionChatConstants.BOTON_SIGUIENTE_LOGIN);

    }

    public static void accionCargarArchivo(String nomArchivo) {
        WebElement contenedor = WebActionManager.waitClickable(PeticionChatConstants.BOTON_ARCHIVO);
        // Encuentra el input de tipo file dentro del contenedor
        WebElement inputFile = contenedor.findElement(By.xpath(PeticionChatConstants.INPUT_FILE_DOCUMENTO));
        // Enviar la ruta del archivo al input de tipo file
        String path = System.getProperty("user.dir") + "/src/main/resources/archivosTest/" + nomArchivo;
        inputFile.sendKeys(path);
    }

    public static boolean buscarArchivoCargado(String nomArchivo) {
        try {
            String xpath = String.format(PeticionChatConstants.LBL_ARCHIVO_CARGADO, nomArchivo);
            WebActionManager.waitVisibility(xpath).getText();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static void accionCargarImagen(String nomImagen) {
        WebElement contenedor = WebActionManager.waitClickable(PeticionChatConstants.BTN_SUBIR_IMAGEN);
        // Encuentra el input de tipo file dentro del contenedor
        WebElement inputFile = contenedor.findElement(By.xpath(PeticionChatConstants.INPUT_FILE_DOCUMENTO));
        // Enviar la ruta del archivo al input de tipo file
        String path = System.getProperty("user.dir") + "/src/main/resources/archivosTest/" + nomImagen;
        inputFile.sendKeys(path);
    }

    public static void clicSeleccionarActividades() {
        WebActionManager.waitClickable(PeticionChatConstants.BTN_SELECCIONAR_ACTIVIDADES).click();
    }

    public static void seleccionDeActividad(String nomActividad) {
        String xpathLBLSelecActiv = String.format(PeticionChatConstants.LBL_SELECCIONAR_ACTIVIDADES, nomActividad);
        WebActionManager.waitClickable(xpathLBLSelecActiv).click();
    }

    public static boolean buscarActividadSeleccionada(String nomActividad) {
        try {
            WebActionManager.waitVisibility(String.format(PeticionChatConstants.LBL_ACTIVIDAD_SELECCIONADA, nomActividad));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void clickBtnAceptarActividaSeleccionada() {
        WebActionManager.waitClickable(PeticionChatConstants.BTN_ACEPTAR_ACTIVIDAD_SELECCIONADA).click();
    }

    public static boolean verPopUpActividades() {
        try {
            WebActionManager.getElement(PeticionChatConstants.LBL_POPUP_ACTIVIDADES);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void ClickBtnSeleccManual() {
        WebActionManager.click(PeticionChatConstants.BTN_SELECCION_MANUAL);
    }

    public static void seleccionManual(String seleccManual) {
        WebActionManager.waitVisibility(String.format(PeticionChatConstants.LBL_SELECCIONAR_MANUAL, seleccManual)).click();
    }

    public static void clickBtnSeleccionarTipoDeTeoria() {
        WebActionManager.click(PeticionChatConstants.BTN_SELECCION_TIPO_TEORIA);
    }

    public static void seleccionaElTipoDeTeoria(String tipoTeoria) {
        WebActionManager.waitVisibility(String.format(PeticionChatConstants.LBL_SELECCIONAR_TIPO_TEORIA, tipoTeoria)).click();
    }

    public static void clickBtnSelecColorAdaptacion() {
        WebActionManager.click(PeticionChatConstants.BTN_SELECCION_COLOR_ADAPTACION);
    }

    public static void seleccionaColor(String color) {
        String codiColor = ColorPicker.getColorCode(color);
        WebElement inputColor = WebActionManager.getElement(PeticionChatConstants.INPUT_COLOR);

        // Usa JavaScript para asignar el valor
        ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("arguments[0].value = '" + codiColor + "';", inputColor);

    }

    public static void ingresaComandoAdaptacion(String peticion) {
        WebElement txtArea = WebActionManager.getElement(PeticionChatConstants.TXT_COMANDO_PETICION);
        txtArea.click();
        txtArea.sendKeys(peticion);
    }
}
