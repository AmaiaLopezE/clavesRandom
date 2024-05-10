public class Comprobador {

        public static boolean comprobarClave(String clave, int longitudEsperada) {
            // Comprueba si la clave está en mayúsculas
            boolean esMayusculas = clave.equals(clave.toUpperCase());

            // Comprueba si la longitud de la clave es la esperada
            boolean longitudCorrecta = clave.length() == longitudEsperada;

            // Devuelve true si ambas condiciones se cumplen, false en caso contrario
            return esMayusculas && longitudCorrecta;
        }
}
