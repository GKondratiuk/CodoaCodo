//Tema comparacion Mientras - hacer con hacer - mientras
// Guillermo Kondratiuk
// 05/09/23
//Consigna: Realizar un bucle que permita la carga de 5 notas numericas
//Ahora el bucle no está limitado, es el usuario cuando decide cuando cortar
//tenemos que contar la canitad de aprobados y desaprobados
Algoritmo CargarNotas
	//declaracion de variables
	Definir nota Como Real;
	Definir respuesta Como Caracter;
	Definir contAprobados, contReprobados Como Entero;
	//Inicializacion de la variable contador
	contAprobados = 0;
	contReprobados = 0;
	
	//Proceso mediante bucle Repetir-Mientras Que 
	
	Repetir
		Escribir "Ingrese una nota de examen: ";
		Leer nota;
		
		//nos valemos de una estructura SI-SINO para contar A Y R
		Si(nota >= 60) Entonces
			//Solamente actualizamos el contador correspondiente
			contAprobados = contAprobados + 1;
			
		SiNo
			contReprobados = contReprobados + 1;
			
		FinSi
		
	Mientras Que NO(Mayusculas(respuesta) == 'N' ); 
	Escribir "Informe de resultados";
	Escribir "Cantidad de aprobados: ", contAprobados;
	Escribir "Cantidad reprobados: ", contReprobados
	Escribir "*La carga finalizó correctamente*";
	
FinAlgoritmo
