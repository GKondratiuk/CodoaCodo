//Tema: Flujo de selección simple
// Guillermo Kondratiuk: Comision 23597
// Dia 31/08/23
// Consigna: Vamos a programar un código para contar del 0 al 5, 
//y obtener la suma de los numeros contados
//Tipos de variables de control
//1- contador
//2- acumulador
//3. bucle mientras - hacer

Algoritmo BucleBandera 
	
	//Declaracion de variables
	
	Definir cotador, acumulador Como Entero;
	Definir bandera Como Logico;
	//Inicializaciòn de la variable
	contador = 0;
	acumulador = 0;
	bandera = falso;
	//Proceso y resultados mediante bucle Mientras - Hacer
	
	
	Mientras (Contador <= 5) Hacer
		//Zona de procesos
		Escribir "Contando", contador;
		
		//Zona de actualizaciones de variables.
		
		acumulador = acumulador + contador; 
		contador = contador+1;
		
		//Estructura de control si, para cambiar el valor de la bandera
		si(contador == 3) Entonces
			bandera = verdadero; 
		FinSi
		
		si(bandera) Entonces
			Escribir "Estamos pasando por el numero 3";
			bandera = falso; //apagamos nuestra bandera
		FinSi
		
		
	FinMientras
	
	Escribir "El resultado de la suma es: ", acumulador;
	
	
FinAlgoritmo
