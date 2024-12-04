package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
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
}
