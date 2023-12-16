package paquete;
import java.util.*;

/*
 * En esta clase generamos los métodos para
 *  utilizar teclados 
 */

 public class Teclado {
    // Trabajamos con objetos de clase
    // Declaramos e instanciamos el objeto en la clase
    static Scanner teclado = new Scanner(System.in);

    //1- Metodo para leer datos tipo numerico
    public static int numero(){
        return teclado.nextInt();        
    }
//1.1- Metodo para leer datos tipo String
    public static String texto(){
        return teclado.nextLine();
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
