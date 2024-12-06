package lippia.web.constants;

public class PeticionChatConstants {
    public static final String INICIAR_SESION_GOOGLE = "xpath://*[@class=\"sign-in-button google-button\"]";
    public static final String INGRESA_EMAIL = "xpath://*[@id=\"identifierId\"]";
    public static final String BOTON_SIGUIENTE = "xpath://*[@id=\"identifierNext\" and contains(., 'Siguiente')]\n" ;;
    public static final String INGRESA_CONTRASENA = "xpath://*[@id=\"password\"]//input";
    public static final String BOTON_SIGUIENTE_LOGIN = "xpath://*[@id=\"passwordNext\"]/div/button";
    public static final String BOTON_ARCHIVO = "xpath:(//div[@class='chatInput_inputButtonContainer__R_wAx'])[1]";
    public static final String INPUT_FILE_DOCUMENTO = ".//input[@type='file']";
}
