Algoritmo promedioAlumnos
	
	// Ejercicio 20
	// Calcular las calificaciones de un grupo de alumnos. 
	// La nota final de cada alumno se calcula seg�n el siguiente criterio: 
	// la parte pr�ctica vale el 10%; la parte de problemas vale el 50% y la parte te�rica el 40%. 
	// El algoritmo leer� el nombre del alumno, las tres notas, escribir� el resultado y volver� a pedir los datos del siguiente alumno 
	// hasta que el nombre sea una cadena vac�a. 
	// Las notas deben estar entre 0 y 10, si no lo est�n, no imprimir� las notas, mostrara un mensaje de error y volver� a pedir otro alumno.
	
	Definir notaPractica, notaProblemas, notaTeorica, nota como real;
	Definir i, alumnos como entero;
	Definir nombre Como Caracter;
	
	nota=0;
	
	Escribir "Ingrese la cantidad de alumnos de la clase";
	Leer alumnos;
	
	Para i=1 hasta alumnos hacer
		
		Escribir "Ingrese el nombre del alumno n�: " , i ;
		Leer nombre;
		
		Escribir "Ingrese la nota de la parte pr�ctica del alumno n� " , i, ": ", nombre , ".";
		Leer notaPractica;
		
		Escribir "Ingrese la nota de la resoluci�n de problemas del alumno n� " , i, ": ", nombre , ".";
		Leer notaProblemas;
		
		Escribir "Ingrese la nota de la parte te�rica del alumno n� " , i, ": ", nombre , ".";
		Leer notaTeorica;
		
		Si ((notaPractica>=0) y (notaPractica<=10)) y ((notaProblemas>=0) y (notaProblemas<=10)) y ((notaTeorica>=0) y (notaTeorica<=10)) entonces
			
			nota=(notaPractica*0.1)+(notaProblemas*0.5)+(notaTeorica*0.4);
			Escribir "La calificaci�n final de " , nombre , " es de " , nota , " puntos.";
			Escribir "";
			
		sino		
			Escribir "Debe ingresar una nota v�lida, entre 0 y 10.";
			Escribir "Alguna de las notas ingresadas no coincide con este par�metro";
			Escribir "Intentelo nuevamente con el pr�ximo alumno.";
		FinSi
		
	FinPara
	
FinAlgoritmo
