package lippia.web.constants;

public class PeticionChatConstants {
    public static final String INICIAR_SESION_GOOGLE = "xpath://*[@class=\"sign-in-button google-button\"]";
    public static final String INGRESA_EMAIL = "xpath://*[@id=\"identifierId\"]";
    public static final String BOTON_SIGUIENTE = "xpath://*[@id=\"identifierNext\" and contains(., 'Siguiente')]\n";

    public static final String INGRESA_CONTRASENA = "xpath://*[@id=\"password\"]//input";
    public static final String BOTON_SIGUIENTE_LOGIN = "xpath://*[@id=\"passwordNext\"]/div/button";
    public static final String BOTON_ARCHIVO = "xpath:(//div[@class='chatInput_inputButtonContainer__R_wAx'])[1]";
    public static final String INPUT_FILE_DOCUMENTO = ".//input[@type='file']";
    public static final String LBL_ARCHIVO_CARGADO = "xpath://p[@class='chatInput_loadedPdfText__t8fDY' and contains(text(), '%s')]";
    public static final String BTN_SUBIR_IMAGEN = "xpath:(//div[@class='chatInput_inputButtonContainer__R_wAx'])[2]";
    public static final String BTN_SELECCIONAR_ACTIVIDADES = "xpath:(//div[@class='chatInput_inputButtonContainer__R_wAx'])[3]";
    public static final String LBL_SELECCIONAR_ACTIVIDADES = "xpath://button[@class='chatInput_activitiesButton__zq0TZ' and contains(text(), '%s')]";
    public static final String LBL_ACTIVIDAD_SELECCIONADA = "xpath://p[contains(text(), '%s')]";
    public static final String BTN_ACEPTAR_ACTIVIDAD_SELECCIONADA = "xpath://button[@class='commons_greenButton__kJQpj' and contains(text(), 'Aceptar')]";
    public static final String LBL_POPUP_ACTIVIDADES = "xpath://p[@class='chatInput_modalTitle__0fa2Z' and contains(text(), 'Actividades')]";
    public static final String BTN_SELECCION_MANUAL = "xpath:(//div[@class='chatInput_inputButtonContainer__R_wAx'])[4]";
    public static final String LBL_SELECCIONAR_MANUAL = "xpath://div[@class='chatInput_selectManualButton__bfvXi']//p[text()='%s']";
    public static final String BTN_SELECCION_TIPO_TEORIA ="xpath:(//div[@class='chatInput_inputButtonContainer__R_wAx'])[5]";
    public static final String LBL_SELECCIONAR_TIPO_TEORIA ="xpath://div[@class='chatInput_selectManualButton__bfvXi']//p[text()='%s']" ;
    public static final String BTN_SELECCION_COLOR_ADAPTACION ="xpath:(//div[@class='chatInput_inputButtonContainer__R_wAx'])[6]";
    public static final String INPUT_COLOR = "xpath://input[@type='color']";
    public static final String TXT_COMANDO_PETICION = "xpath://textarea[@name=\"textarea\"]";
    ;
}
