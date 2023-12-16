/*Hacer un programa pida dos números por teclado, los ordene de menor a mayor e imprima los números pares entre dos números y señale la cantidad de pares.*/
import java.util.Scanner;

public class Desafio03{
public static void main(String args[]){
	//DECLARACION DE LAS VARIABLES
	int n1, n2, max, min, contador; 
	
	//INICIALIZACION DE LAS VARIABLES 
	max = 0; 
	min = 0; 
	contador = 0;			
							
	//DECLARACION DEL OBJETO TECLADO
	Scanner teclado; 
	
	//INICIALIZACION O INSTANCIACION DEL OBJETO
	teclado = new Scanner(System.in);
	
	//INICIALIZACION DE LAS VARIABLES N1 Y N2;
	System.out.println("Ingrese un numero entero: ");
	n1 = teclado.nextInt();
	teclado.nextLine(); //LIMPIEZA DEL BUFFER
	
	System.out.println("Ingrese otro numero entero: ");
	n2 = teclado.nextInt();
	teclado.nextLine(); //LIMPIEZA DEL BUFFER
	
	//PROCESO DE ORDENAMIENTO NUMERICO
	if(n1>n2){
		max = n1;
		min = n2;
	}else if(n2>n1){
		max = n2;
		min = n1;
	}
	//RESULTADOS
	System.out.print("Los numeros pares son: ");
	for(int i = min; i <= max; i ++){
		if(i % 2 == 0){
			System.out.print(i + " ");
			contador ++; // contador = contador + 1; lo colocamos dentro del if para que cuente solo los numeros pares
			}
		}
		//CERRAMOS EL TECLADO
		teclado.close();
		System.out.println("");
		System.out.println("La cantidad de numeros Impares es: " + contador);
	}
}
	
