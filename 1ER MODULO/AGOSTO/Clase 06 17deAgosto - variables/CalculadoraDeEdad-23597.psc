// Encabezado
// Tema: Instrucciones de entrada.
// @author: Comisión 23597
// @date: 17/08/23
// Consigna: Realizar una calculadora de edad

Algoritmo CalculadoraDeEdad
	//Declaración de las variables
	Definir nombre Como Caracter;
	Definir anioActual Como Entero;
	Definir anioNac Como Entero;
	Definir resultado Como Entero;
	
	// Inicialización por instrucciones de entrada
	Escribir "Introduzca su nombre:";
	Leer nombre;
	Escribir "Introduzca el año actual:";
	Leer anioActual;
	Escribir "Introduzca su año de nacimiento:";
	Leer anioNac;
	
	// Proceso
	resultado = anioActual-anioNac;
	
	// Resultado
	Escribir "¡Hola! ",nombre;
	Escribir "Naciste en el año ",anioNac," y tenés ",resultado," años, si es que ya los cumpliste."
	Escribir "*** El programa ha finalizado ***";
	
	
	
FinAlgoritmo
