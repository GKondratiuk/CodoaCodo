// Tema: Operadores de asignaci�n, instrucciones de entrada
// @author: Comisi�n 23595
// @date: 16/08/23
// Consigna de trabajo: realizar una calculadora matematica de sumas.

Algoritmo CalculadoraMatematica
	// Declaraci�n de las variables
	Definir num1 Como Real;
	Definir num2 Como Real;
	Definir Operador Como Caracter
	Definir resultado Como Real;
	
	// Inicializaci�n de las variables por instrucci�n de entrada
	Escribir "Indique operaci�n a realizar: (+, -, /, *";
	Leer operador;
	Escribir "Ingrese un n�mero";
	Leer num1;
	Escribir "Ingrese otro";
	Leer num2;
	
	// Proceso 
	Si operador	== '-' Entonces
		resultado = (num1 - num2)
	FinSi
	si operador == '+' Entonces
		resultado = (num1 + num2)
	FinSi
	si operador == '/' Entonces
		resultado = (num1 / num2)
	FinSi
	si operador == '*' Entonces
		resultado = (num1 * num2)
	FinSi
	
	
	// resultado
	Escribir "El resultado es: ", resultado;
	Escribir "*** El programa ha finalizado ***";
	
FinAlgoritmo
