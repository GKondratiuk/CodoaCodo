//Usuario: Guillermo
//Fecha: 24-08-23
//Comision: 23597
Algoritmo Operador
	//Declaracion de las variables
	Definir edad Como Entero;
	Definir esCorrecto1, esCorrecto2, esCorrecto3, esCorrecto4, esCorrecto5 Como Logico;
	
	
	//Inicializaci�n edad
	edad = 18; //preposicion el usuario tiene 18 a�os
	
	//Procesos l�gicos
	esCorrecto1 = NO(edad) == 18; 
	esCorrecto2 = NO(edad) > 18;
	esCorrecto3 = NO(edad) < 18;
	esCorrecto4 = NO(edad) >= 18;
	esCorrecto5 = NO (edad) <= 18;
	
	//Obtenci�n de resultado 
	Escribir  "�Quien no tiene 18 a�os, tiene 18 a�os?" , esCorrecto1;
	Escribir  "�Quien no tiene 18 a�os, tiene mas de 18 a�os?" , esCorrecto2;
	Escribir  "�Quien no tiene 18 a�os, tiene menos de 18 a�os?" , esCorrecto3;
	Escribir "�Quien no tiene 18 a�os, tiene menos o igua� de 18 a�os? " esCorrecto4;
	Escribir "�Quien no tiene 18 a�os, tiene mas o igual de 18 a�os? " esCorrecto5;
	
FinAlgoritmo

