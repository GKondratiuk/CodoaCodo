//Encabezado
//Guillermo: comision 23597
//Clase 15/08/23

//Una variable que guarde n° decimales
//Una variable que guarde textos
//Una variable que guarde textos engañosos
//Una variable que guarde valroes logicos

Algoritmo MisVariables
	
	//declaracion de las variables
	
	Definir miNumeroEntero Como Entero; //Esta variable soporta numero enteros
	Definir miNumeroDecimal Como Real; // esta variable soporta numeros decimales
	Definir miTexto Como Caracter; // esta cariable soporta alfanumeros, letras y numeros
	Definir miTextoNumero Como Caracter;
	Definir miLogico Como Logico; // La variable logica booleana soporta solo dos valores, verdadero o falso
	Definir resultado como Real;
	
	Definir nombre Como Caracter; //forma parte del desafio en clase
	
	//Inicialización de variables
	
	miNumeroEntero = 256;
	miNumeroDecimal = 1.5;
	miTexto = "Esto es un texto en una variable"; 
	//comillas dobles para textos largos o palabras, comillas simples para un numero o una letra
	miTextoNumerico = "128"; //Este numero en realidad es un texto
	miLogico = Verdadero; // valores booleanos son solo verdadero o falso 
	resultado = miNumeroEntero+miNumeroDecimal;
	nombre = "Guillermo"; //forma parte del desafio en clase
	
	//Salidas mediante instrucciones de salida por consola
	Escribir miNumeroEntero;
	Escribir miNumeroDecimal;
	Escribir miTexto;
	Escribir miTextoNumerico;
	Escribir miLogico;
	Escribir resultado;
	
	Escribir ("Hola " + nombre); //forma parte del desafio en clase
	
	Escribir "La suma de dos numero guardados dentro de variables es:"
	Escribir (miNumeroEntero + miNumeroDecimal);
	
FinAlgoritmo
