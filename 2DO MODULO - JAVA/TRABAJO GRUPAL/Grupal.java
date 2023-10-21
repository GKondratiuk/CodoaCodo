import java.util.Scanner;

public class Grupal{
	public static void main(String args[]){
		
		//DECLARACION DE VARIABLES
		String user = "";
		String password = "";
		//DECLARACION E INSTANCIACION DE OBJETO 
		Scanner teclado = new Scanner(System.in); 
		
		//DESARROLLO
		System.out.println("******************************");
		System.out.println("*********BIENVENIDO***********");
		System.out.println("******************************");
		System.out.println("Este es el nuevo sistema bancario del programa Codo a codo");
		
		//PETICION DE DATOS
		System.out.println("Por favor coloque su nombre de usuario...");
		user = teclado.nextLine();
		System.out.println("A continuación coloque su contraseña...");
		password = teclado.nextLine();
		
		System.out.println("Bienvenido " + user);
		}
	}
