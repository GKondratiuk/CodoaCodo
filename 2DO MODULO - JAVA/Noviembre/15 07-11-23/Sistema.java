import java.util.*;
/*
 * En esta clase almacenamos el metodo para activar nuestro teclado
 * ESTA CLASE NO CONTIENE METODO MAIN
 * */

public class Sistema{
	
	//Declaramos el objeto de clase 
	static Scanner teclado;
		
	// 1- Teclado para capturar texto
	public static String tecladoTexto(){
		//Instanciacion de objeto
		teclado = new Scanner(System.in);
		//valor de retorno 
		return teclado.nextLine();
	}
		//2- Teclado para capturar numeros
		public static Double tecladoNumero(){
		//Instanciacion de objeto
		teclado = new Scanner(System.in);
		//valor de retorno 
		return teclado.nextDouble();
	
	}
}
