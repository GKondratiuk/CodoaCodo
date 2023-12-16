/*
Esta clase es la única que posee metodo main
Este es el punto de acceso al programa
*/

public class Main{
	public static void main(String[] args){
		Imprimir.texto("Ingrese el valor del radio");
		double radio = Sistema.tecladoNumero();
		
		Imprimir.texto("Ingrese el valor de la Altura");
		double altura = Sistema.tecladoNumero();
		
		//Habilitamos variable para almacenar la sup del cilindro
		double superficie = Cilindro.superficie(radio, altura);
		
		Imprimir.texto("La superficie del cilindro es: " + superficie);
		}
	}
