import java.util.Scanner;

public class Desafio{
public static void main(String Args[]){
	
	int num1, num2;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Coloque un numero entero");
	num1 = teclado.nextInt();
	teclado.nextLine();
	
	System.out.println("Coloque otro numero entero");
	num2 = teclado.nextInt();
	teclado.nextLine();
	
	System.out.println("Los numeros que usted eligió fueron el numero " 
	+ num1 + " y el numero " + num2);
	teclado.close();
 }	
}
