//TEMA: BUCLES Para
//GUILLERMO COMISION 23597
//07/09/23
//impares hastra el 100 y que imprima cuantos impares hay


Algoritmo Desafio05
	
	//declaracion de variables
	Definir contadorImpar Como Entero;
	
	//inicializacion de la variable
	contadorImpar = 0;
	
	//proceso con el bucle Para 
	para i = 1 hasta (100) Con Paso (2) hacer 
		Escribir "contando: ",i;
		
		//actualizacion de la variable de control
		contadorImpar = contadorImpar + 1;
	FinPara
	
Escribir "La cantidad de numeros impares es: ", contadorImpar;
FinAlgoritmo
