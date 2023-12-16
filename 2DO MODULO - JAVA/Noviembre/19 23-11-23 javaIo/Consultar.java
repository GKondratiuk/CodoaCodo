import java.io.*;
import java.util.ArrayList;
import paquete.Imprimir;

/*
 * Este programa me permite consultar un listado de compras almacenado en un archivo y buscar productos de compras en el.
 Utilizamos funciones.
 En este ejemplo no se propagan ni gestionan excepciones  
 * */

public class Consultar {
	public static void main (String[] args) throws IOException, ClassNotFoundException {
		//1- Trabajamos con la clase FIle para encontrar el archivo
	File archivo = new File("miLista.dat");
		
		//1.2- Generamos la conexión de la cañeria desde nuestro disco al codigo
	FileInputStream archivoEntrada = new FileInputStream(archivo); 
	
	//1.3- Componemos el objeto y lo preparamos para darle forma de ArrayList
	ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
	
	//1.4 Le devolvemos la forma (tipo) al objeto mediante un casteo explicito
	//El alist puede usar el mismo nombre que en el archivo anterior, o no.
	ArrayList<String> productos = (ArrayList<String>) objetoEntrada.readObject();
	
	//2- Proceso 
	Imprimir.texto("Busco pan");
	Metodo.buscar(productos, "pan");
	
	Imprimir.texto("Busco tomate");
	Metodo.buscar(productos, "tomate");
	
	//Cerramos los objetos
	archivoEntrada.close();
	objetoEntrada.close();
	 }
	}
