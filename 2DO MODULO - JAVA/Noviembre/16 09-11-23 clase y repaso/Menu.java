/*
 * Esta clase anida otros métodos y clases y
 * contiene principios de recursion.
 */
 
 public class Menu{
	 //1- Generamos un metodo que contenga un menú
	 public static void mostrarMenu(){
		 //1- Diseño del menu
		 Imprimir.texto("Menu Principal");
		 Imprimir.texto("1. Opcion 1");
		 Imprimir.texto("2. Opción 2");
     Imprimir.texto("3. Salir");
     
     //2- Instruccion salida-entrada
     Imprimir.texto("Seleccione una opción: ");
     String opcion = Teclado.texto();
     
     //3- Proceso mediante una estructura de switch
     switch(opcion){
			 case "1":
					Imprimir.texto("Ha seleccionado la opcion 1");
					Imprimir.texto("Presione enter para volver al menu principal");
					//Recursividad
					mostrarMenu();
					return;
			 
			 case "2":
					Imprimir.texto("Ha seleccionado la opcion 1");
					Imprimir.texto("Presione enter para volver al menu principal");
					//Recursividad
					mostrarMenu();
					return;
			 
			 case"3":
			 Imprimir.texto("Saliendo del programa...");
			 return;
			 
			 
			 default:
			 
			 Imprimir.texto("Opcion no valida, por favor seleccione una opcion correcta");
			 //Recursividad
			 mostrarMenu(); //Recursividad
			 return;
			 }
		 }
	 }
