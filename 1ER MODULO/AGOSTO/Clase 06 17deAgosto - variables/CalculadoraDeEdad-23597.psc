// Encabezado
// Tema: Instrucciones de entrada.
// @author: Comisi�n 23597
// @date: 17/08/23
// Consigna: Realizar una calculadora de edad

Algoritmo CalculadoraDeEdad
	//Declaraci�n de las variables
	Definir nombre Como Caracter;
	Definir anioActual Como Entero;
	Definir anioNac Como Entero;
	Definir resultado Como Entero;
	
	// Inicializaci�n por instrucciones de entrada
	Escribir "Introduzca su nombre:";
	Leer nombre;
	Escribir "Introduzca el a�o actual:";
	Leer anioActual;
	Escribir "Introduzca su a�o de nacimiento:";
	Leer anioNac;
	
	// Proceso
	resultado = anioActual-anioNac;
	
	// Resultado
	Escribir "�Hola! ",nombre;
	Escribir "Naciste en el a�o ",anioNac," y ten�s ",resultado," a�os, si es que ya los cumpliste."
	Escribir "*** El programa ha finalizado ***";
	
	
	
FinAlgoritmo
