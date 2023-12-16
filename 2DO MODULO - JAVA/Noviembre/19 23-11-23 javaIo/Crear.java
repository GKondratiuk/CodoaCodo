//C.R.U.D
//CREAR-LEER-ACTUALIZAR-BORRAR
import java.io.*;
import java.util.ArrayList;
import paquete.*;

/**
 * @Documented Tema Biblioteca io y excepciones
 * Flujos de entrada salida de objetos
 * @dominio Codo a Codo Inicial 2023
 * @author Guillermo
 * */

/*
* Creamos un arraylist y lo almacenamos en un archivo dat
* */

public class Crear implements Serializable{
	//1- Objeto de clase 
	public static ArrayList<String> productos = new ArrayList<>();
	
	//2- Creamos el metodo para crear el objeto Alist 
	static void objeto(String nombreArchivo) throws IOException{
		
		//1- Inicicializamos al ArrayList y lo cargamos 
		Listado.setLista(productos);
		
		//2- Guardamos el Alist en local(dentro del disco rigido)
		
		//2.1 - Creamos el archivo que recibirá al objeto arraylist
		File archivo = new File(nombreArchivo+".dat");
		
		//2.2 - Creamos el stream (cañeria de conexion)
		FileOutputStream archivoSalida = new FileOutputStream(archivo);
		
		//2.3 Preparamos nuestro objeto AList para serializarlo (preparar al archivo para que pase por la cañeria)
		ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
		
		//2.4 Proceso de escritura en el disco writeObject()
		objetoSalida.writeObject(productos);
		
		//2.5 Cerramos los objetos
		archivoSalida.close();
		objetoSalida.close();
		}//llave del cierre del metodo
		
		public static void main (String[] args) throws IOException{
			
			objeto("miLista");
			
			}
	}
