import java.util.*; //importamos la clase InputMismatchException
/*
 * A la funcion division la enriqueceremos con el lanzamiento de las excepciones
 * y bloques try-catch que gestionen los errores que permitan una salida menos traumatica
 * del programa.
 * La funcion division arrojará dos excepciones Exception y AritmeticException
 */
 
 public class FuncionEx{
	 public static double divisionEx(double num1, double num2) throws ArithmeticException{
		//Variables
		double resultado;
		//Mediante una estructura if diseñamos el lanzamiento de la excepcion
		if(num2 != 0){
			resultado = num1/num2;
			//Retorno
			return resultado;
		}else{
			throw	new ArithmeticException("No se puede dividir por 0");
		}
	 }
	 
	 //Metodo que anida a otros metodos y lo llamaremos desde el Main
	 //Este metodo ataja la excepcion mediante try-catch
	 
	 public static void activarDivisionEx(){
		 //Variables
		 boolean repetir; //variable bandera
		 double num1, num2, resultado;
		 
		 //Proceso
		 do{
			try{ //Este primer try catch gestiona al objeto Scanner
				repetir = false; //comenzamos apagando la bandera
				//Instrucciones de salida entrada
				Imprimir.texto("Ingrese un numero: ");
				num1 = Teclado.numero();
				Teclado.limpiar();
				Imprimir.texto("Ingrese otro numero");
				num2 = Teclado.numero();
				Teclado.limpiar();// el programa no llega a este limpiar
				
				//Llamamos a divisionEx
				try{//Lamamos a este segundo try gestiona las excepciones que diseñamos para dividir 
					resultado = divisionEx(num1, num2);
					Imprimir.texto("el resultado es: "+ resultado);
					
					}catch(ArithmeticException e0){
						Imprimir.texto("Intentelo nuevamente. Error: " + e0.getMessage());
						activarDivisionEx(); //Llamada recursiva
						}
				
			}catch(InputMismatchExeption e1){
				Imprimir.texto("Intentelo nuevamente. Error: " + e1);
				repetir = true; //Encendemos bandera
				Teclado.limpiar(); // llega a limpiar acá
				}
			 
		 }while(repetir);
		 
		 }
	 
}
