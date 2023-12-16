import java.util.Scanner;
/**
 * Autor: Guillermo Kondratiuk
 *  */
 /*
  * Esto es un login 
  * */

public class Metodo{
	String user = "";
	String pass = "";
	public static void mostrar(String txt){
		System.out.println(txt);
		}
	public static String guardarDatos(){
		//Declaracion e instanciacion del teclado 
		Scanner teclado = new Scanner(System.in);
		String dato = teclado.nextLine();
		return dato;
		}
		public static void Login(){
			mostrar("--------------------------------------");
			mostrar("----INGRESANDO AL SISTEMA BANCARIO----");
			mostrar("--------------------------------------");
			mostrar("");
			mostrar("Por favor ingrese su nombre de Usuario");
			String user = guardarDatos();
			System.out.println("Ingrese su Contraseña");
			String pass = guardarDatos();
			mostrar("--------------------------------------");
			mostrar("Bienvenido " + user);
			mostrar("--------------------------------------");
			}
		public static void menuPrincipal(){
			
			mostrar("Seleccione el número segun corresponda...");	
			mostrar("");
			mostrar("1. Información Personal.");
		  mostrar("2. Información de Saldo.");
		  mostrar("3. Transferencias.");
		  mostrar("4. Pagos Online.");
			String opcion = guardarDatos();
			if(opcion.equals("s")){
				mostrar("Hola " + this.user = user);
				}else{
					mostrar("salio mal");
					}
		  }
		 
	}
