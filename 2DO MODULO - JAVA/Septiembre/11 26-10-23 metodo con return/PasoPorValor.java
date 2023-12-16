/*
 * En este practico daremos un ejemplo de paso por valor 
 * El paso por valor indica que el valor original de una
 * variable NO se modifica al ingresarla a un metodo
 * */
public class PasoPorValor{
	//zona de metodos
	public static void transferir(double saldo, double valor){
		//Cuerpo del metodo
		saldo -= valor; // saldo = saldo - valor;
		
		}
		
		
		
		
		public static void main(String[] args){
			//Declaramos e inicializamos la variable saldo
			double saldo = 100000;
			
			//transferencia 1
			transferir(saldo, 25000);
			
			System.out.println("Su saldo es: " +saldo);
			
			
			}
	}
