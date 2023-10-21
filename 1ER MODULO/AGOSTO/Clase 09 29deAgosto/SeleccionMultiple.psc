//Tema: Estructura selecciòn multiple
// Guillermo Kondratiuk: Comision 23597
// Dia 29/08/23
// consigna: mediante una estructura de menu vamos a desarrolar dos opciones
//opcion uno: saludo
//opcion dos: daremos una despedida

Algoritmo SeleccionMultiple
	//declaracion de las variables 
	Definir miOpcion Como Caracter;
	
	//diseño menu
	Escribir "Te doy la bienvenida al programa";
	Escribir "digite 1 si quiere un saludo";
	Escribir "digite 2 si quiere una despedida";
	Leer miOpcion;
	//proceso mediante estructura segun - hacer -caso
	Segun (miOpcion) Hacer
		caso ('1'): 
			Escribir "Hola que tal, mucho gusto";
		Caso ('2'):
			Escribir "adios, hasta luego";
			
		De Otro Modo:
			Escribir "Ingrese una opcion correcta";
		
	FinSegun
	
	
	
FinAlgoritmo
