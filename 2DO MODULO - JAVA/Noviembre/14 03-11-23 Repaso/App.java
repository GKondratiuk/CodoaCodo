import java.util.*;

/** 
 * Autor: Guillermo
 * */

/* Este programa me permite almacenar un listado de compras en un AL 
* cada dato se cargará por medio del teclado 
* Tendrá un menú donde nos dé opciones de:
* buscar los productos mediante palabras claves
* imprimir el array completo, 
* seguir cargando datos o 
* salir.
*
* En este práctico repasaremos:
* -Objeto ArrayLists
* -Objeto Scanner
* -Bucle for-each
* -Bucle do-while
*/

public class App {
	public static void main(String[] args){
		  // Declaracion e instanciación de los objetos
        ArrayList<String> productos = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);

        // Declaración de variables
        String respuesta = "";
        String opcion = "";
        boolean error, irMenu; // estas son variables de bandera

        //Proceso
        System.out.println("** Bienvenido/a a la app para compras del super **");
        System.out.println("");


        //Diseño del menú \n
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1- Quiero cargar un listado");
        System.out.println("2- Quiero consultar un producto");
        System.out.println("3- Quiero ver todo el listado");
        System.out.println("4- Salir");

        do{
            error = false; // las banderas se inicializan siempre apagadas (false)
            irMenu = false;

        //Instruccion salida-entrada para ingresar al switch
        System.out.println("Ingrese una opción:");
        opcion = teclado.nextLine();

        //Preparamos una estr de control que chequee la respuesta
        if(!(opcion.equals("1")||opcion.equals("2")||
             opcion.equals("3")||opcion.equals("4"))){
                System.out.println("Opción incorrecta, ingrese una opcion correcta");
                error = true;
             }

        }while(error);

        // switch
        // 1- Bloque con la tarea asignada
        // 2- Bloque repetir proceso?
        // 3- Bloque finalizar

        switch(opcion){
            case "1": // en el caso 1 cargamos el listado
            System.out.println("!Comencemos la carga!");
            do{
                System.out.println("Ingrese un producto:");
                String item = teclado.nextLine();
                //Carga del dato en el AL
                productos.add(item);

                //BLOQUE DE REPETIR PROCESO
                do{
                    System.out.println("¿Desea ingresar otro producto?(s/n)");
                    respuesta = teclado.nextLine();
                }while(!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n") ));

            }while(respuesta.equalsIgnoreCase("s"));

            case "2":
            //inicializamos variables
            String encontrado = "";
            String noEncontrado ="";
            
            //Instruccion de entrada y salida para activar nuestro buscador
            System.out.println("Ingrese producto o palabra clave");
						String clave = teclado.nextLine();

						//Proceso de busqueda mediante bucle for
						for(String producto:productos){
							if(producto.contains(clave)){
								encontrado = producto;
								}else{
									noEncontrado = producto;
									}
							}
            
            //En esta segunda estructura if informamos si se debe comprar el producto o no
            if(!encontrado.isEmpty()){
							System.out.println("tenes que comprar " +encontrado);
							}else if(!noEncontrado.isEmpty()){
								System.out.println("No tenes que comprar " +encontrado);
							}
							//Bloque de pregunta para repetir la tarea 
							do{
								System.out.println("Para realizar otra consulta presionar S, volver al menu N... Salir Q");
								respuesta = teclado.nextLine();
								}while(!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n") || respuesta.equalsIgnoreCase("n") ));
            
            
            
            case "3":



            case "4":



        }












    }
}
