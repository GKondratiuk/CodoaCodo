
// Se arroja InputMismatchException indican que el método no manejará directamente la excepción, 
// sino que la propagará hacia arriba en la pila de llamadas, 
// dejando la responsabilidad de manejarla a los métodos superiores o al código que llama al método.

import java.util.*;

public class Main2{
	public static void main(String[] args) throws ArithmeticException, InputMismatchException {
		//llamamos al metodo que contiene las Excepciones
		FuncionEx.activarDivisionEx();
		}
	}
