//3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple

import java.util.Scanner;

public class Desafio2{
public static void main(String Args[]){
	
	int num1;
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Ingrese un numero...");
	num1 = entrada.nextInt();
	entrada.nextLine();
	
	System.out.println("El doble del numero seleccionado es: " + (num1 * 2));
	System.out.println("El triple del numero seleccionado es: " + (num1 * 3));
 entrada.close();
 }	
}
