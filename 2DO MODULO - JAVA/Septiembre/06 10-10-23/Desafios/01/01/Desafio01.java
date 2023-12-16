/*Hacer un programa que imprima los números entre dos números a ingresar por teclado.*/

import java.util.Scanner;

public class Desafio01{
	public static void main (String Args[]){
		
		int num1,num2;
		
		num1 = 0;
		num2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipee el primer numero");
		num1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Tipee el segundo numero");
		num2 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("");
		System.out.println("Comenzando el conteo...");
		System.out.println("");
		
			if(num1 < num2){
				
		while(num1 < num2){
			System.out.print(num1 + ", ");
			num1++;
			}
			
			System.out.print(num1);
		
		}else{
			
			while(num1 > num2){
			System.out.print(num1 + ", ");
			num1--;
			}
			System.out.print(num1);
			
			}
		}
	}
