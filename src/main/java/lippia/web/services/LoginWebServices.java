package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginChatConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginWebServices {
    public static void pageLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickOnLogInButton() {

    }



    //////////////////////////////////////////ZELMICHAT//////////////////////////////////////////////

    public static void paginaLogin() {
        navigateTo(PropertyManager.getProperty("chat.base.url"));
    }

    public static void clickBtnLogin() {
        WebActionManager.waitClickable(LoginChatConstants.INICIAR_SESION_GOOGLE).click();

    }

    public static void ingresaCredenciales() {
        String email = PropertyManager.getProperty("chat.user.email");
        String password = PropertyManager.getProperty("chat.user.password");

        WebActionManager.setInput(LoginChatConstants.INGRESA_EMAIL, email);
        WebActionManager.click(LoginChatConstants.BOTON_SIGUIENTE);

        WebActionManager.setInput(LoginChatConstants.INGRESA_CONTRASENA, password);
        WebActionManager.click(LoginChatConstants.BOTON_SIGUIENTE_LOGIN);
    }

    public static String getNomUsuarioLogeado() {
        return  WebActionManager.waitVisibility(LoginChatConstants.LBL_USUARIO_LOGEADO).getText();
    }

    public static void usuarioLogeado() {
        WebActionManager.waitClickable(LoginChatConstants.INICIAR_SESION_GOOGLE).click();

        String email = PropertyManager.getProperty("chat.user.email");
        String password = PropertyManager.getProperty("chat.user.password");

        WebActionManager.setInput(LoginChatConstants.INGRESA_EMAIL, email);
        WebActionManager.click(LoginChatConstants.BOTON_SIGUIENTE);

        WebActionManager.setInput(LoginChatConstants.INGRESA_CONTRASENA, password);
        WebActionManager.click(LoginChatConstants.BOTON_SIGUIENTE_LOGIN);

    }

    public static void clickMenuHambuerguesa() {
        WebActionManager.waitClickable(LoginChatConstants.MENU_HAMBURGUESA).click();
    }


    public static void clickCerrarSesion() {
        WebActionManager.waitClickable(LoginChatConstants.BOTON_CERRAR_SESION).click();

    }

    public static void clickBtnPopup() {
        WebActionManager.waitClickable(LoginChatConstants.BOTON_LOGOUT_POPUP).click();
    }
}
