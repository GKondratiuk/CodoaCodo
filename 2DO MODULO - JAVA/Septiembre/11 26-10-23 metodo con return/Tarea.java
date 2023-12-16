// 1 -Una funcion return que pida dos numeros y 
// devuelva la multiplicacion de ambos.

// 2- Una funcion return que pida dos numeros y
// los sume y al resultado lo divida por 2 y lo devolvemos o retornamos.

public class Tarea{
	
	static int multiplicar (int num1, int num2){
		
		int result;
		result = num1*num2;
		return result;
			
	}
	
	static int operacion (int num1, int num2, int num3){
		
		int resultado;
		resultado = ((num1+num2)/num3);
		return resultado;
		}
	
	public static void main(String[] args){
		
		int multiplicacion = multiplicar(5,5);
		System.out.println(multiplicacion);
		
		int resultado = operacion(5,5,2);
		System.out.println(resultado);
		}
	}
