package lippia.web.utils;
import java.util.HashMap;
import java.util.Map;
public class ColorPicker {

    // Método para obtener el código hexadecimal según el nombre del color
    public static String getColorCode(String colorName) {
        // Mapa con los nombres de colores y sus códigos hexadecimales
        Map<String, String> colorMap = new HashMap<>();
        colorMap.put("Azul", "#0000FF");
        colorMap.put("Verde", "#008000");
        colorMap.put("Rojo", "#FF0000");
        colorMap.put("Amarillo", "#FFFF00");

        // Retorna el código hexadecimal del color o un valor predeterminado si no está
        return colorMap.getOrDefault(colorName, "#000000"); // Negro como valor predeterminado
    }

}
