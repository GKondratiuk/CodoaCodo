// Encabezado
// Tema: Asignaci�n de variables, operadores de concatenaci�n y asignaci�n.
// @author: Comisi�n 23597
// @date: 17/08/23
// Consigna: Recolecci�n de datos del personal de una empresa
// se nos pide indagar sobre: nombre, edad, DNI, tiene hijos?, cantidad de hijos
// sueldo.

Algoritmo Colaboradores
	// Declaraci�n de las variables
	Definir nombre Como Caracter;
	Definir edad Como Entero;
	Definir DNI Como Caracter;
	Definir tieneHijos Como Logico; // Esto se responde por V o F
	Definir cantHijos Como Entero;
	Definir sueldo Como Real;
	
	// Inicializaci�n de las variables
	nombre = "Fulana Fulanez";
	edad = 40;
	DNI = "28123456";
	cantHijos = 0;
	sueldo = 180000.12;
	
	// Resultados por instruccion de salida concatenada
	Escribir "Nombre: ",nombre,".";
	Escribir "Edad: ",edad;
	Escribir "Sueldo: $",sueldo;
	Escribir "�Tiene hijos?(Verdadero-Falso): ";
	Leer tieneHijos;
	Escribir tieneHijos;
	Escribir "cuantos hijos tiene?";
	Leer cantHijos;
	Escribir "tiene ", cantHijos, " hijos";
	Escribir "Coloque su numero de dni, sin puntos";
	Leer DNI;
	Escribir "Su numero de dni es: ", DNI;
	Escribir "Pulse una tecla si los datos son correctos";
	Esperar Tecla;
	Escribir "***El programa ah finalizado***";
	Esperar Tecla
	//Tarea para la casa
	// Dar salida a tiene hijos? cant hijos y DNI
	
	
FinAlgoritmo
