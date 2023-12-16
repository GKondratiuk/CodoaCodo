import java.util.Scanner;

public class CajeroAutomatico{
	//Saldo inicial del usuario
	public static double saldo = 250000;
	//Método de saldo, gastos transferencia
	public static void Transferencia(double valor){
		saldo = saldo - valor;
		}
	
		public static void main(String args[]){
		
		//DECLARACION DE VARIABLES DEL USUARIO
		String user = ""; //NOMBRE DEL USUARIO
		String password = ""; //CONTRASEÑA DEL USUARIO
		String userCbu = "12345678912131415161718"; //CBU DEL USUARIO
		int opcion = 0;//OPCION DEL MENU PRINCIPAL
		
		//DECLARACION DE VARIABLES DE TERCERO
		double personaMonto = 0;
		String personaCbu = "0";
		
		//DECLARACION E INSTANCIACION DE OBJETO 
		Scanner teclado = new Scanner(System.in); 
		int bandera = 1; 
		
		//DESARROLLO MENU PRINCIPAL
		System.out.println("******************************");
		System.out.println("*********BIENVENIDO***********");
		System.out.println("******************************");
		System.out.println("Este es el nuevo sistema bancario del programa Codo a codo");
		
		//PETICION DE DATOS
		System.out.println("A continuación coloque su Usuario...");
		user = teclado.nextLine();
		
		System.out.println("A continuación coloque su contraseña...");
		password = teclado.nextLine();
		do{
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("Bienvenido " + user);
		System.out.println(" ");
		System.out.println("---------------------------------------");
		System.out.println("A continuación presione el numero segun la opción que corresponda...");
		System.out.println(" ");
		System.out.println("1. Información Personal.");
		System.out.println("2. Información de Saldo.");
		System.out.println("3. Transferencias.");
		System.out.println("4. Pagos Online.");
		opcion = teclado.nextInt();
		teclado.nextLine();
		
		switch(opcion){
			case 1: 
			System.out.println("---------------------------------------");
			System.out.println("");
			System.out.println("***INFORMACIÓN PERSONAL***");
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("Nombre de usuario es: " + user);
			System.out.println("contraseña es " + password);
			System.out.println("CBU es: " + userCbu);
			System.out.println("Alias: ");
			System.out.println("Domicilio en: Calle Falsa 123");
			System.out.println("");
			System.out.println("1. Volver al menú principal");
			bandera = teclado.nextInt();
			if(bandera != 1){
				System.out.println("La opcion ingresada es incorrecta... Volviendo al menú principal.");
				bandera = 1;
				}
			break;
			
			case 2:
			System.out.println("---------------------------------------"); 
			System.out.println("");
			System.out.println("***INFORMACIÓN DE SALDO***");
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("Su saldo actual es $: " + saldo);
			System.out.println("");
			System.out.println("1. Volver al menú principal");
			bandera = teclado.nextInt();
				if(bandera != 1){
				System.out.println("La opcion ingresada es incorrecta... Volviendo al menú principal.");
				bandera = 1;
				}
			break;
			
			case 3: 
			System.out.println("");
			System.out.println("***TRANSFERENCIAS***");
			System.out.println("");
			System.out.println("Ingrese el CBU de la persona y luego el monto deseado a transferir");
			
			System.out.println("Cbu a trnasferir...");
			personaCbu = teclado.nextLine();
			
			System.out.println("Monto a transferir:");
			personaMonto = teclado.nextInt();
			Transferencia(personaMonto);
			System.out.println("Transferencia realizada con exito.");
			System.out.println("Tu saldo actual es de " + (saldo));
					
			System.out.println("");
			System.out.println("1. Volver al menú principal");
			bandera = teclado.nextInt();
			break;
			
			case 4: 
			int option4 = 0;
			int monto4 = 0;
			System.out.println("");
			System.out.println("***PAGOS ONLINE***");
			System.out.println("");
			System.out.println("A continuación presione el numero segun la opción que corresponda...");
			System.out.println("");
			System.out.println("1. Pagar Luz");
			System.out.println("2. Pagar Agua");
			System.out.println("3. Pagar Gas");
			option4 = teclado.nextInt();
			if(option4==1||option4==2||option4==3||option4==2){
						System.out.println("Ingrese el monto que desea pagar.");
						personaMonto = teclado.nextInt();
			      Transferencia(personaMonto);
						System.out.println("El pago se ah realizado con éxito");
						System.out.println("Su saldo actaul es de: $" + (saldo));
						System.out.println("");
			System.out.println("1. Volver al menú principal");
			bandera = teclado.nextInt();
				}
			break;
			}	
			}while(bandera == 1);
		}
	}
