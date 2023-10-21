/*
 * Evaluamos si un numero es par o impar 
 * */
import java.util.*;

public class Codo{
public static void main(String args[]){
//Declaracion de variables
	int num; 
//Declaracion de variable objeto
	Scanner teclado;
//Inicialización de la variable objeto 
	teclado = new Scanner(System.in);
//Inicialización de la variable num E-S
	System.out.println("Por favor ingrese un numero entero");
	num = teclado.nextInt();
	teclado.nextLine();
//Proceso mediante estructura if
	if(num == 0){
		System.out.println("El numrto ingresado fue 0");
	}else if(num %2 == 0){
		System.out.println("Es par");
	}else{
		System.out.println("No es par");
	}
//Cerrar objetos para liberar recursos
	teclado.close();
 }	
}
