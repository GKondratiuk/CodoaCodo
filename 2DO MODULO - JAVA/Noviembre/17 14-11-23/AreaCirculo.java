//1-Importamos Nuestras Librerias
import paquete.Teclado;
import paquete.Imprimir;

/*
* Calcular el área de un círculo 
* utilizando el método pow de la librería Math 
* del paquete java.lang que no es necesario importar
*/

public class AreaCirculo {
	public static void main(String[]args){
		//Hallamos el area de un circulo = PI*r^2
		//1- Instruccion de salida entrada 
		Imprimir.texto("Ingrese un valor del radio:");
		double radio = Teclado.numero();
		Teclado.limpiar(); //Limpiamos el buffer
		Teclado.cerrar(); //metodo para cerrar el teclado
		
		//Proceso 
		double area = Math.PI*Math.pow(radio, 2); // .(Base, Potencia);
		
		//Resultados
		Imprimir.texto("El area del circulo es: "+area);
		}
	}
