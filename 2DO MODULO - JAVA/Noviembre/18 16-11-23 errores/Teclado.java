import java.util.*;

/*
 * En esta clase generamos los métodos para utilizar teclados y otros que tienen
 * que ver con el sistema
 */
public class Teclado {
    // Trabajamos con objetos de clase
    // Declaramos e instanciamos el objeto en la clase
    static Scanner teclado = new Scanner(System.in);

    //1- Metodo para leer datos tipo numerico
    public static double numero(){
        return teclado.nextDouble();        
    }

    //2- Metodo para cerrar el teclado
    public static void cerrar(){
        teclado.close();
    }

//3- Metodo para limpiar el buffer
    public static void limpiar(){
        teclado.nextLine();
    }
}
