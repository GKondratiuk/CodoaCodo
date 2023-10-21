/*Hacer un programa pida dos números por teclado, los ordene de menor a mayor e imprima los números pares entre dos números y señale la cantidad de pares.*/



import java.util.Scanner;

public class Codo{
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
		
		if(num1 < num2){
		for(int i = num1; i <= num2; i++){
		if(i % 2 == 0){	
		System.out.print(i + " ");
		 }	
		}
		}else if(num1 > num2){
		for(int i = num1; i >= num2; i--){
		if(i % 2 == 0){
		System.out.print(i + " ");
		 }
		}
		}else{
		  System.out.print("ERROR CRITICO");
		  }
			
 }
}
