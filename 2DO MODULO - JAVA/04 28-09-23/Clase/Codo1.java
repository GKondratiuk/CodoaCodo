import java.util.Scanner;


public class Codo1{
public static void main(String args[]){

//Declaracion de variables
int num1, num2;

//Declaracion de la variable de objetos
Scanner teclado;

//Instanciacion de objetos
teclado = new Scanner(System.in);

//Inicializacion de num1 y num2 x instruccion de salida y entrada
System.out.println("Ingrese un numero entero: ");
num1 = teclado.nextInt();

//Limpieza de Buffer, para que la memoria se limpie,luego de colocar numeros
teclado.nextLine();

System.out.println("Ingrese otro numero entero: ");
num2 = teclado.nextInt();

//Limpieza de Buffer, para que la memoria se limpie,luego de colocar numeros
teclado.nextLine();


//Resultados
System.out.println("El resultado de la suma es: " + (num1 + num2));
 
 //cerramos los objetos.
 teclado.close();
 }
}
