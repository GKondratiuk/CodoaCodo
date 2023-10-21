/*Hacer un programa que imprima los números entre dos números a ingresar por teclado.*/
import java.util.Scanner;
public class Desafio01{
	public static void main (String Args[]){
		//DECLARACION DE VARIABLES
		int n1, n2, max, min;
		
		//INICIALIZACION DE LAS VARIABLES
		max = 0;
		min = 0; 
		
		//DECLARACION DEL OBJETO TECLADO 
		Scanner teclado;
		
		//INICIALIZACION O INSTANCIACION DEL OBJETO
		teclado = new Scanner(System.in);
		
		//INICIALIZACIÓN DE N1 Y N2 POR INSTRUCCION DE E-S
		System.out.println("Ingrese un numero entero: ");
		n1 = teclado.nextInt();
		teclado.nextLine(); //Limpieza del buffer
		
		System.out.println("Ingrese otro numero entero: ");
		n2 = teclado.nextInt();
		teclado.nextLine(); //Limpieza del buffer
		
		//PROCESO DE ORDENAMIENTO NUMERICO 
		if(n1 > n2){
			max = n1; 
			min = n2;
		}else if(n2 > n1){
			max = n2;
			min = n1;
		}
		//RESULTADOS
		System.out.println("Los numeros son...");
		for(int i = min; i <= max; i++){
			System.out.println(i);
		}			
 }
}
