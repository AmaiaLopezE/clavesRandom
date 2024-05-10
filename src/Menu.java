import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        //haz un menú con las siguientes opciones: crear una clave, comprobar clave y generar pista
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("1. Crear una clave");
            System.out.println("2. Comprobar clave");
            System.out.println("3. Generar pista");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(Creador.crearclave(5));
                    break;
                case 2:
                    System.out.println("Introduce la clave a comprobar: ");
                    String clave = scanner.next();
                    System.out.println("Introduce la longitud de la clave");

                    int longitud = scanner.nextInt();
                    if (Comprobador.comprobarClave(clave, longitud)){
                        System.out.println("La clave es correcta");
                    }else{
                        System.out.println("La clave no es correcta");
                    }
                    break;
                case 3:
                    // Aquí va el código para generar una pista
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
            }
        }
    }
}
