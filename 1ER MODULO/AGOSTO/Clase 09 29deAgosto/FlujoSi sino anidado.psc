//Tema: Flujo de selección simple
// Guillermo Kondratiuk: Comision 23597
// Dia 29/08/23
// Consigna: mediante un flujo de seleccion simple 
//compararemos una clave 

Algoritmo FlujoSi
	// declaracion de las variables
	Definir claveControl, clave Como Caracter;
	
	//inicializacion de variables
	claveControl= "123codo";
	
	//inicializacion de clave por instruccion de entrada
	Escribir "Ingrese su clave de acceso"; //instruccion de salida
	Leer clave; //instruccion de entrada
	
	//proceso, mediante estructura o flujo si 
	Si(claveControl == clave) Entonces
		Escribir "su clave es correcta"; // se escribe si la clave es correcta.
	SiNo
		Escribir "Su clave es incorrecta, intente nuevamente";
		Leer clave;
		
		SI(claveControl == clave) Entonces
			Escribir "Su clave es Correcta";
		SiNo
			Escribir "Su clave es incorrecta";
		FinSi
			
			
	FinSi
	
	Escribir "Esta instruccion esta fuera del bloque si ";
	
	
FinAlgoritmo
