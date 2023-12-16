import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete.*;

/*
* Lectura de un archivo de un objeto ArrayList
* El proceso de lectura es paralelo al proceso de escritura,
* por lo que leer objetos del flujo de entrada  ObjectInputStream es muy simple en este práctico
* veremos sus pasos.
* */

public class Leer{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	//1- Trabajamos con la clase FIle para encontrar el archivo
	File archivo = new File("miLista.dat");
	
	//1.2- Generamos la conexión de la cañeria desde nuestro disco al codigo
	FileInputStream archivoEntrada = new FileInputStream(archivo); 
	
	//1.3- Componemos el objeto y lo preparamos para darle forma de ArrayList
	ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
	
	//1.4 Le devolvemos la forma (tipo) al objeto mediante un casteo explicito
	//El alist puede usar el mismo nombre que en el archivo anterior, o no.
	ArrayList<String> productos = (ArrayList<String>) objetoEntrada.readObject();
	
	//2-Proceso
	// Nos valemos de un for-each
	for(String producto : productos){
		Imprimir.texto(producto);
		}
		
	//3-Cierre de los objetos
	archivoEntrada.close();
	objetoEntrada.close(); 
	}
}
