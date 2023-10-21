//Usuario: Guillermo
//Fecha: 24-08-23
//Comision: 23597
Algoritmo Operador
	//Declaracion de las variables
	Definir edad Como Entero;
	Definir esCorrecto1, esCorrecto2, esCorrecto3, esCorrecto4, esCorrecto5 Como Logico;
	
	
	//Inicialización edad
	edad = 18; //preposicion el usuario tiene 18 años
	
	//Procesos lógicos
	esCorrecto1 = NO(edad) == 18; 
	esCorrecto2 = NO(edad) > 18;
	esCorrecto3 = NO(edad) < 18;
	esCorrecto4 = NO(edad) >= 18;
	esCorrecto5 = NO (edad) <= 18;
	
	//Obtención de resultado 
	Escribir  "¿Quien no tiene 18 años, tiene 18 años?" , esCorrecto1;
	Escribir  "¿Quien no tiene 18 años, tiene mas de 18 años?" , esCorrecto2;
	Escribir  "¿Quien no tiene 18 años, tiene menos de 18 años?" , esCorrecto3;
	Escribir "¿Quien no tiene 18 años, tiene menos o iguañ de 18 años? " esCorrecto4;
	Escribir "¿Quien no tiene 18 años, tiene mas o igual de 18 años? " esCorrecto5;
	
FinAlgoritmo

