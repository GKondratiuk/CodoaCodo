import java.util.ArrayList;

public class MiArrayList{
	public static void main(String args[]){
		//DECLARACION DEL ARRAYLIST
		//los tipos de datos se colocan dentro de broches
		//los nombres de los tipos de datos se colocan luego y fuera de los broches
		ArrayList<String> mercaderias;
		
		//INSTANCIACION DEL ARRAYLIST
		mercaderias = new ArrayList<String>();
		
		/*METODOS*/
		
		//1- INSERTAR
		mercaderias.add("1k de pan");
		mercaderias.add("1k de papa");
		mercaderias.add("6 huevos");
		
		//2 - IMPRIMIR EL ARRAYLIST
		System.out.println(mercaderias);
		
		//3- LOINGITUD DEL ARRAYLIST
		System.out.println("la cantidad de elementos es de: " + mercaderias.size());
		
		//4- AÑADIR ELEMENTOS AL ARRAYLIST
		mercaderias.add("3 limones");
		System.out.println(mercaderias);
		
		//5- OBTENER EL VALOR DE UN ELEMENTO
		System.out.println(mercaderias.get(3));
		
		//6- CAMBIAR UN ELEMENTO DEL ARRAYLIS
		//el primer numero corresponde al valor del elemento a remover
		mercaderias.set(2,"1 mermelada"); 
		System.out.println(mercaderias);
		
		//7 BORRAR UN ELEMENTO DEL ARRAYLIST
		mercaderias.remove(0);
		System.out.println(mercaderias);
		}
	}
