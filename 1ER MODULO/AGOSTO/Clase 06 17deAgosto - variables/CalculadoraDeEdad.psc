//Clase d�a 17 de Agosto del 2023
//Guillermo Kondratiuk
//Comision 23597
//Tema: Instrucciones de entrada
//Consigna: Realizar una calculadora de edad



Algoritmo CalculadoraDeEdad
	//declaracion de variables
	Definir nombre Como Caracter;
	Definir anioActual Como entero;
	Definir anioNac Como Entero;
	Definir resultado Como Entero;
	
	//Inicializacion de variable por instruccion de entrada
	
	Escribir "Introduzca su nombre:"
	Leer nombre;
	Escribir "Introduzca a�o actual:"
	Leer anioActual;
	Escribir "Introduzca su a�o de nacimiento:"
	Leer anioNac;
	
	//Proceso 
	resultado = (anioActual - anioNac);
	
	//resultado
	Escribir "�Hola! ",nombre;
	Escribir  "Naciste en el a�o ",anioNac, " y tenes " ,resultado, " si es que ya los cumpliste ";
	Escribir "***El programa ah finalizado."
	
	
	
	
	
FinAlgoritmo
