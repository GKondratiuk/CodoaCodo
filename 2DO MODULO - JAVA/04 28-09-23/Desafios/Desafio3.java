/*Como Usuario quiero ingresar por teclado mi nombre y tres números para que me devuelva por consola un saludo personalizado me muestre los números que introduje y además la suma de los tres números con la leyenda “La suma de los tres números es: ”*/
import java.util.Scanner;

public class Desafio3{
public static void main(String Args[]){
	
	String nombre = "";
	int num1, num2, num3;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Ingrese su nombre");
	nombre = entrada.nextLine();
	
	System.out.println("Ingrese tres numeros");
	num1 = entrada.nextInt();
	entrada.nextLine();
	num2 = entrada.nextInt();
	entrada.nextLine();
	num3 = entrada.nextInt();
	entrada.nextLine();
	
	System.out.println("Hola " + nombre + ". Los numeros que ingresaste fueron: " + num1 + ", " + num2 + " y " + num3 + " ");
	System.out.println("La suma de los tres numeros es: " + (num1 + num2 + num3));
	entrada.close();
 }	
}
