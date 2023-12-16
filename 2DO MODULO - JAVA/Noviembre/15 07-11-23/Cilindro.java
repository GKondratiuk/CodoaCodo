/*
Esta es la clase encargada de anidar al resto
*/

public class Cilindro{
	//1- Metodo para hallar la sup del cilindro
	
	//Para diseñar los parametros de circulo pide radio
	
	//Rectangulo nos pide altura, base = perimetro del circulo
	public static double superficie(double radio, double altura){
		//1- Hallamos la superficie de tapa y piso
		double supCirculo = 2*Circulo.superficie(radio);
		//2- Hallamos el lado mayor del rectangulo de piel
		double base = Circulo.perimetro(radio);
		//3- Hallamos la sup del rectangulo
		double supRectangulo = Rectangulo.superficie(base, altura);
		//4- Valor del retorno
		return supCirculo + supRectangulo;
		}
	}
