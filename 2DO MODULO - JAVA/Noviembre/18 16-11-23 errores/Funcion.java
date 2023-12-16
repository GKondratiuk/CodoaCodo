import java.util.*;

/*
* Realizaremos una función división, la dividiremos por 0 y observaremos el resultado. 
*/

public class Funcion{
	//1- Metodo para resolver una division
	public static double division(double num1, double num2){
		//Variable
		double resultado;
		//Operacion
		resultado = num1 / num2;
		//Retorno 
		return resultado;
		
		}
	

	//2- Metodo que anida y activa al resto
	public static void activarDivision(){
		//Variables
		double num1, num2, resultado;
		boolean bandera;
		
		do{
		try{ //se utiliza cuando se genera un error
		bandera = false;
		//Proceso 
		//.1- Instrucciones de salida entrada 
		Imprimir.texto("Ingrese un numero: ");
		num1 = Teclado.numero();
		Teclado.limpiar();//Limpieza del Buffer
		
		Imprimir.texto("Ingrese otro numero: ");
		num2 = Teclado.numero();
		Teclado.limpiar();//Limpieza de Buffer
		Teclado.cerrar();
		
		//Resultado
		resultado = division(num1, num2);
		Imprimir.texto("El resultado de la division es: " + resultado);
		}catch(InputMismatchException e){
			Imprimir.texto("Error, debe introducir un numero entero o decimal");
			Teclado.limpiar();
			bandera = true; // se activa la bandera solo si algo anda mal
			}
		}while(bandera);
	}
 }

		
		
