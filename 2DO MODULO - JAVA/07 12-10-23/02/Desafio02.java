/*Hacer un programa que imprima los números en orden decreciente, desde un número mayor que cero hasta 0. Si el número no es mayor a cero entonces el programa imprime solo la leyenda, no puedo contar.
*/
import java.util.Scanner;

public class Desafio02{
	public static void main(String args[]){
	//DECLARACION DE LAS VARIABLES 
	int n1, n2;
	//DECLARACION DEL OBJETO TECLADO 
	Scanner teclado; 
	//INSTANCIACION DEL OBJETO TECLADO
	teclado = new Scanner(System.in);
	//INICIALIZACION DE LAS VARIABLES
	n2 = 0;
	
	//SOLICITUD DE DATOS 
	System.out.println("Ingrese un numero entero mayor que cero");
	n1 = teclado.nextInt();
	teclado.nextLine();
	
	//DESARROLLO DE IMPRESION
	if(n1>n2){
		System.out.println("Los numeros son");
		for(int i = n1; i >= n2; i--){
		
	System.out.println(i);
	
	}
		
		}else{		
			System.out.println("El programa no puede ser ejecutado porque no siguó la consigna");
		}
		teclado.close();
		}
	}
