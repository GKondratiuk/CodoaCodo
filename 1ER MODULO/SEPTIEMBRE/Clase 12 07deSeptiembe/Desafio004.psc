//TEMA: BUCLES Para
//GUILLERMO COMISION 23597
//07/09/23
//programa que imprime las suma de los 100 primeros numeros


Algoritmo Desafio4
	
	//declaracion de variables
	Definir acumulador, contador Como entero;
	
	//inicializacion
	contador = 0;
	acumulador = 0;
	
	mientras (contador <= 100) hacer
		
		Escribir "contando: ", contador;
		
		//actualizacion de las variables
		acumulador = acumulador + contador;
		contador = contador+1;
		
	FinMientras
	Escribir "la suma de los 100 numeros es: ", acumulador;
FinAlgoritmo
