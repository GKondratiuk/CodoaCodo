import java.util.Scanner;

public class Codo{
public static void main(String args[]){

/*
 * Aprendemos a declarar e inicializar objetos mediante un objeto scanner
 * pediremos el nombre al usuario y lo imprimiremos por consola
 * */

//Declaracion de variables 
String nombre; 
//Declaracion de objetos 
Scanner teclado;

//Istanciación (los objetos se istanciacían)
teclado = new Scanner (System.in); //teclado es un nuevo sanner que hace un ingreso al sistema

//Inicialización de la variable nombre por instruccion de salida-entrada
System.out.println("Ingrese un nombre: ");
nombre = teclado.nextLine();

//Resultado de instruccion de salida
System.out.println("el nombre ingresado es: " + nombre);

//Cerramos el objeto teclado para recuperar espacio en memoria ram
//lo que hacemos es destruir la variable teclado.
teclado.close();




 }
}
