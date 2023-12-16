/*Autor: Guillermo Kondratiuk
 * Comision: 23597
 * Fecha: 18/10/23
*/
/*Hacer un array que me permita la carga por teclado de
10 notas de clases, terminada la carga arrojará, las notas
cargadas y el promedio de ellas.*/

import java.util.Scanner;

public class DesafioNotas{
	public static void main (String args[]){
		
		//DECLARACION DE ARRAY
		int[] notas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//INICIALIZACION E INSTANCIACION DE OBJETO TECLADO
		Scanner teclado = new Scanner(System.in);
		
		//DESARRROLLO
		System.out.println("Coloque la primer nota...");
		notas[0] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la segunda nota...");
		notas[1] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la tercera nota...");
		notas[2] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la cuarta nota...");
		notas[3] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la quinta nota...");
		notas[4] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la sexta nota...");
		notas[5] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la septima nota...");
		notas[6] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la octava nota...");
		notas[7] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la novena nota...");
		notas[8] = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Coloque la decima nota...");
		notas[9] = teclado.nextInt();
		teclado.nextLine();
		teclado.close();
		
		System.out.println("Las notas ingresadas fueron: ");
		for(int i = 0; i < notas.length; i++){
			System.out.println(notas[i]);
			}
			System.out.println(" ");
			System.out.println("El promedio de las notas es: " + (notas[0] + notas[1] + notas[2] + notas[3] + notas[4] + notas[5] + notas[6] + notas[7] + notas[8] + notas[9]) / 10);
		}
	}
