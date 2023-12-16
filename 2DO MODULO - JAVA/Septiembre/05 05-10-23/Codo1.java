/*
 * Tarea: Traer el objeto Scanner para que interactue el codigo
 * */
 /*
Realizaremos un switch donde lo configuraremos segun las opciones 
1- Dar un saludo
2- Dar un regalo
3- Dar una despedida
*/
import java.util.*;
public class Codo1{
	public static void main(String args[]){
//Declaracion de las variables
	String opcion;
//Declaracion de Objeto
	Scanner teclado;
//Inicializacion de teclado
	teclado = new Scanner(System.in);	
//Diseño del menu 
	System.out.println("***MENU***");
	System.out.println("1 Si quiere un saludo");
	System.out.println("2 Si quiere un regalo");
	System.out.println("3 Si quiere una despedida");
	System.out.println("");
//Esta linea se inicializaria con opcion con teclado.nextLine
	opcion = teclado.nextLine();
	System.out.println("");
//Estructura de switch
	switch(opcion){
	case "1":
	System.out.println("Buen día");
	break; //hace que el programa salga de la estructura switch
	
	case "2":
	System.out.println("Sorpresa !!!!");
	break;//hace que el programa salga de la estructura switch
	
	case "3":
	System.out.println("Hasta Luego");
	 break;//hace que el programa salga de la estructura switch
	
	default: 
	System.out.println("Opcion incorrecta");
	 break;//hace que el programa salga de la estructura switch
  }
  
 }
}
