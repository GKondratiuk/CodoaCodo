/*Hacer un programa pida dos números por teclado, los ordene menor y mayor e imprima los números impares que hay entre ambos y cuantos impares hay.*/

import java.util.Scanner;

public class Desafio04{
	public static void main(String args[]){
		//DECLARACION DE VARIABLES 
		int n1, n2, min, max, contador;
		//DECLARACION DEL OBJETO TECLADO
		Scanner entrada;
		//INSTANCIACION DEL OBJETO
		entrada = new Scanner(System.in);
		
		//INICIALIZACION DE LAS VARIABLES 
		max = 0;
		min = 0;
		contador = 0;
		
		//INICIALIZACION DE LAS VARIABLES N1 Y N2
		System.out.println("Ingrese un numero entero: ");
		n1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Ingrese otro numero entero: ");
		n2 = entrada.nextInt();
		entrada.nextLine();
		
		//PROCESO DE ORDENAMIENTO NUMERICO
		if(n1>n2){
			max = n1;
			min = n2;
		}else if(n2>n1){
			max = n2;
			min = n1;
		}
		
		//PROCESO DE IMPRESION DE Y CONTEO DE IMPARES
		System.out.println("Los numeros impares son: ");
		for(int i = min; i<= max; i ++){
			if(i % 2 != 0){
				System.out.print(i + " ");
				contador ++;
				}
			}
			entrada.close(); //CERRAMOS EL OBJETO TECLADO
			System.out.println("");
			System.out.println("Los numeros impares son: " + contador);
		}
	}
