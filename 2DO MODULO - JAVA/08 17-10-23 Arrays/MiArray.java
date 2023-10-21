/*
 * Trabajamos con arrays. 
 * Declaracion, instanciacion, inicializacion
 * Operaciones y metodos varios. 
 * Todo array se import automaticamente de la libreria java.lang.*
 * Estas son de las primeras estructuras que se utilizaron
 * */

public class MiArray{
	public static void main(String args[]){
		
		//DECLARACION DE ARRAY - 
		int[] numeros; // x convensión todo array se lo declara con palabras en plural.
		
		//INSTANCIACION (INICIALIZACION) DEL OBJETO
		numeros = new int[3]; //Declaramos la cantidad de datos a almacenar
		
		//CARGA DE DATOS O ALTAS DE DATOS 
		numeros[0]=123; //cargamos el valor del elemento 1 indice 0
		numeros[1]=456; //elemento 2 indice 1
		numeros[2]=789; //elemento 3 indice 2
		System.out.println("El elemento del indice 1 es: " + numeros[1]);
		//ACTUALIZACION DE VALORES, PISAR VALORES CARGADOS
		numeros[1]=150;
		System.out.println("El nuevo valor del indice 1 es: " + numeros[1]);
		
		//DECLARACION DE UN ARRAY NUMERICO EN UNA SOLA LINEA
		//este es el metodo que se suele utilizar 
		int[] otrosNumeros = {789, 456, 123, 654};
		
		//Consultamos el elemento 4 del indice 3
		System.out.println("el elemento 4 del indice 3 es: " + otrosNumeros[3]);
		
		//Declaramos el array frutas del tipo String
		String[] frutas = {"banana", "manzana", "naranja"};
		
		//Referencia a objetos e indices 
		//Consultamos el elemento 3 del array frutas
		System.out.println("el elemento 3 es: " + frutas[2]);
		//Consultamos el elemento de indice 0 en otrosNumeros
		System.out.println("El elemento del indice 0 en nros es: " + otrosNumeros[0]);
		//Consultamos el elemento 1 de numeros 
		System.out.println("El elemento 1 de numeros es: " + numeros[0]);
		
		//CONSULTA DEL ARRAY 
		System.out.println(frutas); // esto no funciona
		
		//Para imprimir un array completo utilizmos un bucle for .length
		//.length nos devuelve un nro entero que representa la cantidad de elementos 
		
		System.out.println("Los elementos de frutas son: ");
		for(int i = 0; i < frutas.length; i++){
			System.out.println(frutas[i]);
		}
			System.out.println("Los elementos de numeros son: ");
			for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}
			System.out.println("Los elementos de otrosNumeros son: ");
			for(int i = 0; i < otrosNumeros.length; i++){
			System.out.println(otrosNumeros[i]);
		}
		}
	}
