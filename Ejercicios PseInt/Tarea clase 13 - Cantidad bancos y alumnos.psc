Algoritmo bancosAlumnos
	
	Definir cantAlumnos, cantBancos Como Entero;
	
	Escribir "Por favor, ingrese la cantidad de alumnos inscriptos al curso.";
	Leer cantAlumnos;
	
	Escribir "Ahora ingrese la cantidad de bancos disponibles en el aula donde se dictará el curso.";
	Leer cantBancos;
	
	Si (cantAlumnos == cantBancos) entonces
		Escribir "Perfecto, la cantidad de bancos es igual a la cantidad de alumnos. Todos tendrán un asiento asignado.";
	SiNo
		Si (cantAlumnos > cantBancos) entonces
			Escribir "Hay más alumnos que bancos disponibles en el aula, faltarán " , cantAlumnos-cantBancos , " bancos, por lo que esa cantidad de alumnos deberán permanecer parados.";
		SiNo
			Escribir "Hay más bancos que alumnos anotados al curso, por lo que sobrarán " , cantBancos-cantAlumnos ," bancos en el salón.";
		FinSi
	FinSi
	
FinAlgoritmo
