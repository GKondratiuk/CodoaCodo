//ZONA DE IMPORTACION DE LIBRERIAS

//ZONA DE COMENTARIOS
/*
 * Se plantea la zona donde debe alojarse un metodo static cunaod aun no se ve orientacion a objetos
 * */

//ZONA DE CLASE PUBLICA
//ZONA DEL METODO MAIN

public class MiFuncion{
	//ZONA DE LOS METODOS 
	//Codificamos un metodo que nos imprima por consola un texto cualquiera
	//PUBLIC: Es un modificador de acceso
	//STATIC: Hace referencia a ocupacion de memoria (1) y a como lo activamos
	 //VOID: especifica que el metodo no trae algo en la memoria
	 
	public static void imprimir(){
		//Cuerpo del método
		System.out.println("Hola mundo");
		} 
		
		//Sobrecarga del metodo
		public static void imprimir(String nombre){
			
			//Cuerpo del metodo
			System.out.println("Hola " + nombre);
			
			}
			
		//Sobrecarga del metodo, hacemos una suma
		public static void imprimir(int num1, int num2){
			//Cuerpo del metodo
			System.out.println("Resultado de la suma es: " + (num1 + num2));
			
			} 
		
	
	public static void main(String[] args){
		//DECLARACION DE VARIABLES 
		//DECLARACION DE LOS OBJETOS
		//INICIALIZACION DE LAS VARIABLES
		//INSTANCIACION DE OBJETOS
		//PROCESO 
		//RESULTADOS
		
		//Llamamos al metodo "imprimir"
		imprimir();
		imprimir("Lara");
		imprimir("Zulma");
		imprimir(10, 10);
		
		//Tarea: Generar un metodo imprimir que imprima textos pasados como argumentos
		}
	}
