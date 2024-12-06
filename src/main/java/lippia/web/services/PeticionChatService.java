package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PeticionChatConstants;
import org.openqa.selenium.By;
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

    public static void clickBotonArchivo() {
       WebElement contenedor = WebActionManager.waitClickable(PeticionChatConstants.BOTON_ARCHIVO);

        // Encuentra el input de tipo file dentro del contenedor
        WebElement inputFile = contenedor.findElement(By.xpath(PeticionChatConstants.INPUT_FILE_DOCUMENTO));

        // Enviar la ruta del archivo al input de tipo file
        String path = System.getProperty("user.dir") + "/src/main/resources/archivosTest/5gradoZelmira.pdf";
        inputFile.sendKeys(path);

        System.out.println("");
    }
}
