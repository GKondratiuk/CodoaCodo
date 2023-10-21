//Usuario: Guillermo
//Fecha: 24-08-23
//Comision: 23597
//Creacion de login con datos reales
Algoritmo sin_titulo
	//Declaración de variables
	Definir userControl, emailControl, user Como Caracter;
	Definir userEsCorrecto, emailEsCorrecto, puedeContinuar Como Logico;
	
	//Inicialización de las variables de control
	userControl = "codo2023";
	emailControl = "mail@mail.com";
	
	//Inicializacìón de usuario por teclado
	Escribir "Por favor, ingrese usuario o email registrado";
	Leer user;
	
	//Proceso de comparaciones
	
	userEsCorrecto = userControl == user;
	emailEsCorrecto = emailControl == user;
	
	//Proceso con operador lógico O
	puedeContinuar = userEsCorrecto O emailEsCorrecto;
	
	//Resultado
	
	Escribir "¿El usuario puede continuar?", puedeContinuar;
	
	
FinAlgoritmo
