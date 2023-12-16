/*Hacer un programa pida dos números por teclado, los ordene de menor a mayor e imprima los números pares entre dos números y señale la cantidad de pares.*/



import java.util.Scanner;

public class Codo01{
	public static void main(String Args[]){
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Tipee el primer numero");
		num1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Tipee el segundo numero");
		num2 = entrada.nextInt();
		entrada.nextLine();
		System.out.println(" ");
		System.out.println("Los numeros pares son los siguientes:");
		
	
	while ((num1 < num2) && (num1 % 2) == 0 ){
		for(num1 = num1; num1 > num2; num1--){
			System.out.print(num1 + ", ");
		}
		System.out.print(num1);
		}
 }
}
