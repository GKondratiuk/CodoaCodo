import java.util.*;
/*Autor: Guillermo Kondratiuk
 * Comision: 23597
 * Fecha: 20/10/23
/*● Programar una aplicación que utilice un arraylist
para cargar un listado de cosas a comprar en el
supermercado.
● Permitir al usuario cargar en un buscador el
producto y si el producto está en el listado que
arroje un aviso “Si, tenés que comprar el producto”*/

public class DesafioAL{
	public static void main(String[] args){
		
		//DECLARACION DE VARIABLES
		String opcion = "";
		String opcionDos = "";
		String producto = "";
		
		//DECLARACION E INSTANCIACION DE OBJETOS
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		//DESARROLLO
		System.out.println("****************************************");
		System.out.println("***************WELCOME******************");
		System.out.println("****************************************");
		
		//PETICION DE DATOS AL USUARIO
		System.out.println("Este es el nuevo sistema de compras, agrege un objeto a la lista");
		lista.add(teclado.nextLine());
		System.out.println("");
		System.out.println("¡ Objeto Agregado a la lista !");
		System.out.println("");
		System.out.println("¿Desea agregar otro objeto? S/N");
		opcion = teclado.nextLine();
		
		//DESARROLLO INCORPORACION DE ITEMS AL ARRAYLIST
		while(opcion.equalsIgnoreCase("S")){
			System.out.println("Agrege el nombre del objeto");
			lista.add(teclado.nextLine());
			System.out.println("");
		System.out.println("¡ Objeto Agregado a la lista !");
		System.out.println("");
			System.out.println("¿Desea agregar otro objeto? S/N");
		opcion = teclado.nextLine();
			}
		
		if(opcion.equalsIgnoreCase("n")){
			System.out.println("******************************************");
			System.out.println("***El listado de compras ha finalizado.***");
			System.out.println("******************************************");
		}else{
			System.out.println("******************************************");
			System.out.println("***El listado de compras ha finalizado.***");
			System.out.println("******************************************");
			}
		
		System.out.println("");
		System.out.println("");
		
		//DESARROLLO DEL BUSCADOR DE ITEMS DENTRO DEL ARRAY LIST
			System.out.println("******************************************");
			System.out.println("**********BUSCADOR DE ELEMENTOS***********");
			System.out.println("******************************************");
		System.out.println("¿Desea buscar un producto dentro del listado? S/N");
		opcionDos = teclado.nextLine();
		while(opcionDos.equalsIgnoreCase("S")){
		System.out.println("");
		System.out.println("Coloque el nombre del producto...");
		producto = teclado.nextLine();
		for(String objeto : lista){
		if(objeto.equalsIgnoreCase(producto)){
				System.out.println("El producto " + producto + " está en la lista");
			}else{
				System.out.println("error");
				}
		}
		System.out.println("");
		System.out.println("¿Desea buscar un producto dentro del listado? S/N");
		opcionDos = teclado.nextLine();
	}
		
		if(opcionDos.equalsIgnoreCase("n")){
			System.out.println("*************************************************");
			System.out.println("***El buscador ha finalizado, fin del programa***");
			System.out.println("*************************************************");
		}else{
			System.out.println("*************************************************");
			System.out.println("***El buscador ha finalizado, fin del programa***");
			System.out.println("*************************************************");
			}
			
		}
	}
