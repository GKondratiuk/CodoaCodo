import java.io.File;
import paquete.*;
public class Borrar {
	public static void main (String[] args){
		//1- Localizamos el archivo a borrar mediante la clase file
		File archivo = new File("miLista.dat");
		
		//2- Proceso, nos valemos de un if-else .exists()
		if(archivo.exists()){
			//Proceso .delete()
			archivo.delete(); //se borra completamente el archivo
			Imprimir.texto("Archivo borrado con exito");
			}else{
			Imprimir.texto("No se puede realizar la operacion.");
			}
		
		}
	}
