import java.util.*;
/*Autor: Guillermo Kondratiuk
 * Comision: 23597
 * Fecha: 20/10/23
/*
 * Al ArrayList hay que importarlo
 * Los Wrappers van en mayusculas y suplantan los tipos de datos
 * */
public class MiArraylist{
	public static void main(String args[]){
	//DECLARACION DE ARRAYLIST
	ArrayList<String>autos; // siempre en plural		
	
	//INSTANCIACION DEL ALIST
	autos = new ArrayList<String>();
	
	//DECLARAR E INSTANCIAR AL MISMO TIEMPO
	//ArrayList<String> autos = new Arraylist<String>();
		
	//METODOS MAS COMUNES EN LOS ARRAYLIST
	
	//1- Altas:
	autos.add("Volvo");//esto es el elemento 1 del indice 0
	autos.add("Chevrolet");
  autos.add("Ford");
  autos.add("Audi");
  autos.add("Aston Martin"); 
  autos.add("Ferrari");
  
  //2- Consultamos e imprimimos el AList completo
  System.out.println("El Arraylist de auto es: ");
  System.out.println(autos);
  
  //3- Obtenemos la longitud del Alist, es decir la cantidad de elementos
  int longitud = autos.size();
  System.out.println("La longitud del Al de autos es: " + longitud);
  
  System.out.println("La longitud del Al de autos es  " + autos.size());
  
  //4- Agregamos un elemento al Alist
  autos.add("McLaren");
  
  //5- Agregamos un elemento al indice especifico
  //agregamos honda en el indice 1
  autos.add(1,"Honda");
  
  System.out.println("El nuevo AL autos es: " + autos);
  
  //Para hallar la nueva longitud habilitamos una nueva variable
  int longitud2 = autos.size();
  System.out.println("La longitud del Al de autos es: " +longitud2);
  
  //Metodo .get() realiza consulta o inspecciona un indice en particular 
  //autos.get(4);
  
  System.out.println("El elemento del indice 4 es: " + autos.get(4));
  
  //7- Metodo .set() - Actualiza los valores - borra un valor y agrega uno nuevo en su lugar
  autos.set(4, "Fitito");
  System.out.println("El nuevo Al autos es: " + autos);
  
  //8- Removemos elementos, a esto se le llama bajas .remove() pasamos por parametros el indice.
  autos.remove(3);
  System.out.println("El nuevo AL autos es: " + autos);
  
  //9- Podemos ordenar con los metodos Collections.sort() // Collections.reverse()
  Collections.sort(autos); //esto ordena el al de manera alfabetica
  System.out.println("El Al ordenado alfabeticamente es: " + autos);
  
  //10- Ordenado en orden inverso
  Collections.reverse(autos); //esto ordena el al de manera alfabetica al reves
  System.out.println("El Al ordenado alfabeticamente es: " + autos);
  
  //11- Para hallar el indice de un elemento .indexOf() nos devuelve un numero entero.
  System.out.println("El indice de fitito es: " + autos.indexOf("Fitito"));
  
  //12- Buscamos un elemento dentro de nuestro AL e imprimimos el auto está en el listado
  
  //Bucle for-each
  String marca = "FERRARI";
  for(String auto : autos){
		if(auto.equalsIgnoreCase(marca)){ //.equals()
			System.out.println("El auto está en stock");
		}
	}
		
		}
	}
