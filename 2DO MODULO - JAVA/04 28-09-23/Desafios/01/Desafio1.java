//2.- Hacer una aplicación que permita ingresar 2 números y mostrar sus operaciones básicas.

import java.util.Scanner;

public class Desafio1{
public static void main(String Args[]){
	
	int num1, num2;
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Ingrese un numero...");
	num1 = entrada.nextInt();
	entrada.nextLine();
	
	System.out.println("Ingrese otro numero...");
	num2 = entrada.nextInt();
	entrada.nextLine();
	
	System.out.println("la suma de ambos numeros es: " + (num1 + num2));
	System.out.println("la resta de ambos numeros es: " + (num1 - num2));
    System.out.println("la multiplicacion de ambos numeros es: " + (num1 * num2));
    System.out.println("la division de ambos numeros es: " + (num1 / num2));
entrada.close();
 }	
}
