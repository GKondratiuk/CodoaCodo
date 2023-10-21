/** 
 * @Guillermo
 * @date: 26-09-23
 * @version: 
 */
 
/*
 1- Declaramos la clase publica atajo: class
 2- declaramos el metodo atajo: main
 */

public class Codo {
public static void main(String args[]){
	
	// Declaracion de variables 
	// <tipo> <nombre>;
	
	//DECLARACION DE VARIABLES 
	
	//Variables numericas 
	byte num1; //numeros enteros pequeños hasta 128
	int num2; //numeros enteros 
	double num3; //numeros decimales 
	
	//Variables alfanumericas 
	char letra; //cargan solo una letra y para agregarle valor se las
	//envuelve en una comillas simples.
	String palabra; //palabras
	String palabra2;
	
	//Variables booleanas
	boolean condicion1;
	boolean condicion2;
	
	//INICIALIZACION DE VARIABLES
	num1 = 127;
	num2 = 500;
	num3 = 2.5;
	letra = 'A';
	palabra = "Guille";
	palabra2 = "legajo 792";
	condicion1 = true;
	condicion2 = false;
	
	//Declaracion de otras variables 
	int suma, resta, prom;
	
	//Inicializacion de las otras variables
	suma = num1 + num2;
	resta = num2 - num1;
	prom = suma/2;
	
	//Instrucciones de salida - atajo: sout
	System.out.println("Estos son los resultados: ");
	System.out.println("El resultado de la suma es: " + suma);
 }	
} 
