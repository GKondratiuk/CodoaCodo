/*Hacer un programa que imprima los números en orden decreciente, desde 
 * un número mayor que cero hasta 0. Si el número no es mayor a cero 
 * entonces el programa imprime solo la leyenda, no puedo contar.*/

import java.util.Scanner;

public class Desafio02{
	public static void main (String Args []){
		
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		
		System.out.println("Tipee un numero entero mayor a 0");
		num1 = entrada.nextInt();
		entrada.nextLine();
		System.out.println("");
		System.out.println("Comenzando conteo...");
		System.out.println("");
		if(num1 > 0){
		
			while(num1 > 0){	
			System.out.print(num1 +", ");
			num1 --;	
			}
			System.out.print(num1);
	 
		}else{
			System.out.println("No puedo contar");
		}
 }
}
