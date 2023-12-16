import java.util.*;
/*
 *En esta clase generamos los metodos para utilizar teclados
 *  
 * */

public class Teclado{
	//1- Trabajamos con objetos de clase
	public static Scanner teclado = new Scanner(System.in);
	//2- Metodo para leer datos 
	public static String texto(){
		return teclado.nextLine();
		}
	}
