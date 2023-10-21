// Tema: Operadores de asignación, instrucciones de entrada
// @author: Comisión 23595
// @date: 16/08/23
// Consigna de trabajo: realizar una calculadora matematica de sumas.

Algoritmo CalculadoraMatematica
	// Declaración de las variables
	Definir num1 Como Real;
	Definir num2 Como Real;
	Definir Operador Como Caracter
	Definir resultado Como Real;
	
	// Inicialización de las variables por instrucción de entrada
	Escribir "Indique operación a realizar: (+, -, /, *";
	Leer operador;
	Escribir "Ingrese un número";
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
