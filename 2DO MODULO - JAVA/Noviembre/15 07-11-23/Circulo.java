/*
 * En esta clase realizaremos los métodos de
perímetro y superficie del circulo
 * */

public class Circulo{
	//1- Superficie del circulo S=PI*R^2
	public static double superficie(double radio){
		//Habilitamos variable locales
		double sup = Math.PI*radio*radio;
		//valor de retorno
		return sup;
		}
		
		//2- Perimetro del circulo P=2*PI*radio
		public static double perimetro(double radio){
		//Habilitamos variables
		double perim = 2*Math.PI*radio;
		//Valor de retorno
		return perim;
}
}
