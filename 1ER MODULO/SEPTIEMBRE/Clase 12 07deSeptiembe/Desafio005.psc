//TEMA: BUCLES Para
//GUILLERMO COMISION 23597
//07/09/23
//impares hastra el 100 y que imprima cuantos impares hay


Algoritmo Desafio005
	//declaracion de variable
	definir contadorNum, contadorImpar Como Entero;
	
	//inicializacion de variable
	
	contadorNum = 1;
	contadorImpar = 0; 
	
	//Proceso con bucle Mientras 
	mientras (contadorNum <= 100) hacer 
		
		Escribir "contando: ", contadorNum;
		
		//actualizar variables
		contadorImpar = contadorImpar+1;
		contadorNum = contadorNum+2;
		
		
	FinMientras
	Escribir "la cantidad de numeros impares es: ", contadorImpar;

FinAlgoritmo
