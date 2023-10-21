import java.util.Scanner;

public class Desafio02{
	public static void main(String args[]){
		//DECLARACION DE LAS VARIABLES
		int n1, n2, max, min, contador;
		
		//INICIALIZACION DE LAS VARIABLES
		max = 0;
		min = 0;
		contador = 0;
		
		//DECLARACION DEL OBJETO TECLADO
		Scanner teclado;
		
		//INSTANCIACION DEL OBJETO 
		teclado = new Scanner(System.in);
		
		//INICIALIZACION DE LAS VARIABLES N1 Y N2
		System.out.println("Ingrese un numero entero: ");
		n1 = teclado.nextInt();
		teclado.nextLine(); //LIMPIEZA DEL BUFFER
		
		System.out.println("Ingrese otro numero entero: ");
		n2 = teclado.nextInt();
		teclado.nextLine(); //LIMPIEZA DEL BUFFER
		
		//PROCESO DE ORDENAMIENTO NUMERICO 
		if(n1>n2){
		max = n1;
		min = n2;
		}else if(n2>n1){
		max = n2;
		min = n1;
		}
		
		//RESULTADOS 
		System.out.println("Los numeros pares son...");
		
		for(int i = min; i <= max; i++){
			if(i % 2 == 0){
				System.out.println(i);
				contador++; //CONTADOR = CONTADOR + 1 colocamos dentro del if para que cuente solo los numeros pares 
		 }
		}
			//Cerramos teclado
			teclado.close();
			System.out.println("La cantidad de numeros pares es " + contador);
	 }
	}
