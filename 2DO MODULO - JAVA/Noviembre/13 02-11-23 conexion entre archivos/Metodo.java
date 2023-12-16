import java.util.*;
/*
 * Este archivo(clases) contiene todos los metodos 
 * NO CONTIENE METODO MAIN
 * */
 
 public class Metodo{
	 //1-Creamos un metodo para imprimir mas facil por consola
	//se usa void cuando solo es un procedimiento, no devuelve nada, no tiene return
	public static void imprimir(String txt){
		//Cuerpo del metodo 
		System.out.println(txt);
		}
	
		//2- Creamos un metodo que active al Scanner
		public static int tecladoInt(){
			//Declaracion e instanciacion 
			Scanner teclado = new Scanner(System.in);
			//Le damos funcionamiento al teclado 
			int numero = teclado.nextInt();
			teclado.nextLine(); //Limpiamos buffer
			teclado.close(); //Cerramos teclado
			//Valor de retorno
			return numero;
			}
			
		//3- Metodo para hacer el procedimiento y es del tipo void 
		public static void clasificarNumero(int numero){
			int elDoble = 2*numero;
			imprimir("El doble del numero ingresado es: " + elDoble);
			//Clasificamos si el nro es par o impar 
			if(numero%2 == 0){
				imprimir("El numero es par");
				imprimir("***El programa ha finalizado***");
				return;
				}
				imprimir("El numero es impar");
				imprimir("***El programa ha finalizado***");
			}
			
			//4- Creamos un metodo encargado de desencadenar las acciones 
			public static void app(){
				imprimir("Ingrese un numero: ");
				int miNum = tecladoInt();
				clasificarNumero(miNum);
				}
	 }
