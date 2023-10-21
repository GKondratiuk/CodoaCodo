//Tema: Flujo de selección simple
// Guillermo Kondratiuk: Comision 23597
// Dia 31/08/23
// Consigna: Vamos a programar un código para contar del 0 al 5, 
//y obtener la suma de los numeros contados
//Tipos de variables de control
//1- variable contadora
Algoritmo ContarNumeros
	//Declaracion de variables
	Definir cotador, acumulador Como Entero;
	
	//Inicializaciòn de la variable
	contador = 0;
	acumulador = 0;
	//Proceso, autogesion del valor de la variable contadora
	Escribir "Contando: ", contador;
	contador = contador+1; //Contador incrementar, incrementa la variable + 1 
	acumulador = acumulador + contador;
	Escribir "Contando: ", contador;
	contador = contador+1;
	acumulador = acumulador + contador;
	Escribir "Contando: ", contador;
	contador = contador+1;
	acumulador = acumulador + contador;
	Escribir "Contando: ", contador;
	contador = contador+1;
	acumulador = acumulador + contador;
	Escribir "Contando: ", contador;
	contador = contador+1;
	acumulador = acumulador + contador;
	Escribir "Contando: ", contador;
	
	Escribir "La suma de los numeros contados es: ", acumulador;
	Escribir "la suma de los numeros del contador es: ", contador ; 
	
	
	
	
FinAlgoritmo
