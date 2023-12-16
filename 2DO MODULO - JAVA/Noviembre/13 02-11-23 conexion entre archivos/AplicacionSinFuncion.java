import java.util.*;
/*
 * Se carga un numero, se imprime por consola el doble del numero y se 
 imprime tambien si es par o no 
 * */
public class AplicacionSinFuncion{
	public static void main(String[] args){
		//Declaracion e instanciacion del objeto scanner55555
		Scanner teclado = new Scanner(System.in);
		
		//Declaracion de variables
		int miNum;
		
		//Instrucción de salida - entrada
		System.out.println("Ingrese un numero entero: ");
		miNum = teclado.nextInt();
		teclado.nextLine(); //Limpieza de buffer
		teclado.close();; //Al no ocuparlo mas, Cerramos el objeto teclado.
		
		//Proceso
		int elDoble = 2*miNum;
		System.out.println("El doble del numero ingresado es: " + elDoble);
		
		//Clasificamos si el numero es par o impar
		if(miNum%2 == 0){
			System.out.println("El numero es par");
			System.out.println("***El programa ha finalizado***");
			return; /*tambien se puede utilizar System.exit(0); este codigo lo que hace es finalizar el programa*/
			}
		
		System.out.println("El numero es impar");
		System.out.println("**El programa ha finalizado");
		
		}
	}
