package lippia.web.constants;

public class LoginChatConstants {
    public static final String INICIAR_SESION_GOOGLE = "Xpath://*[@class=\"sign-in-button google-button\"]";
    public static final String INGRESA_EMAIL = "xpath://*[@id=\"identifierId\"]" ;
    public static final String BOTON_SIGUIENTE = "xpath://*[@id=\"identifierNext\" and contains(., 'Siguiente')]\n" ;
    public static final String INGRESA_CONTRASENA = "xpath://*[@id=\"password\"]//input";
    public static final String BOTON_SIGUIENTE_LOGIN = "xpath://*[@id=\"passwordNext\"]/div/button" ;
    public static final String LBL_USUARIO_LOGEADO = "xpath://main//h1";
    public static final String MENU_HAMBURGUESA = "xpath://*[@class=\"hoverIcon\"]";
    public static final String BOTON_CERRAR_SESION = "xpath://*[@class=\"logoutButtonBox\"]";
    public static final String BOTON_LOGOUT_POPUP = "xpath://*[@class=\"logOutCloseSessionModalButton\"]";
}
