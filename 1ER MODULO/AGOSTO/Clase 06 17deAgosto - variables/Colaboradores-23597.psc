// Encabezado
// Tema: Asignación de variables, operadores de concatenación y asignación.
// @author: Comisión 23597
// @date: 17/08/23
// Consigna: Recolección de datos del personal de una empresa
// se nos pide indagar sobre: nombre, edad, DNI, tiene hijos?, cantidad de hijos
// sueldo.

Algoritmo Colaboradores
	// Declaración de las variables
	Definir nombre Como Caracter;
	Definir edad Como Entero;
	Definir DNI Como Caracter;
	Definir tieneHijos Como Logico; // Esto se responde por V o F
	Definir cantHijos Como Entero;
	Definir sueldo Como Real;
	
	// Inicialización de las variables
	nombre = "Fulana Fulanez";
	edad = 40;
	DNI = "28123456";
	cantHijos = 0;
	sueldo = 180000.12;
	
	// Resultados por instruccion de salida concatenada
	Escribir "Nombre: ",nombre,".";
	Escribir "Edad: ",edad;
	Escribir "Sueldo: $",sueldo;
	Escribir "¿Tiene hijos?(Verdadero-Falso): ";
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
