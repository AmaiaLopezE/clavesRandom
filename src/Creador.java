import java.util.Random;

public class Creador {

    public static String crearclave(int longitud) {
        Random random = new Random();
        StringBuilder clave = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            char letra = (char) (random.nextInt(26) + 'A'); // Genera una letra mayúscula aleatoria
            clave.append(letra);
        }

        return(clave.toString());
    }
}
