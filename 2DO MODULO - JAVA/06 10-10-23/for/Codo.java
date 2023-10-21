/*
 * Trabajamos con Bucles.
 * Imprimimos por consola los numeros del 0 al 100 
 * mediante un bucle while 
 * Ponemos en practica la utilizacion de variables y acumuladores
 * Aprenderemos a declarar un bucle do while
 * factorial 5! = 5*4*3*2*1
 */

public class Codo{
public static void main(String Args[]){
//DECLARACION DE LAS VARIABLES 
	int n = 5; // n carga el nro del factorial
	int acumulador = 1; //acumula sucesivas multiplicaciones
	
//PROCESO MEDIANTE BUCLE FOR 
	for(int i = 1; i <= n; i++){
	//Cuerpo del bucle for 
		acumulador = acumulador * i;
		
	}
	System.out.println(acumulador);
	
 }	
}
