/*
 * Trabajamos con Bucles.
 * Imprimimos por consola los numeros del 0 al 100 
 * mediante un bucle while 
 * Ponemos en practica la utilizacion de variables y acumuladores
 * Aprenderemos a declarar un bucle do while
 * factorial 5! = 5*4*3*2*1
 */

public class Codo{
public static void main (String Args[]){
//DECLARACION DE LAS VARIABLES 
	int n = 5; //n Contiene el nro del que quiero hallar factorial
	int acumulador = 1; //acumula multiplicaciones sucesivas
	int contador =1;
	
	//PROCESO MEDIANTE BUCLE DO-WHILE
	do{
	//cuerpo del bucle 
	
	acumulador *= contador; //acumulador = acumulador * contador;
	
	contador++; //contador = contador +1;
	 	
	}while(contador <= n);
	
	//Resultado
	System.out.println("El resultado del factorial de 5 es: " + acumulador);
	
 }	
}
