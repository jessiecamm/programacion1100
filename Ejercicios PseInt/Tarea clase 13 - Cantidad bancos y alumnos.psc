Algoritmo bancosAlumnos
	
	Definir cantAlumnos, cantBancos Como Entero;
	
	Escribir "Por favor, ingrese la cantidad de alumnos inscriptos al curso.";
	Leer cantAlumnos;
	
	Escribir "Ahora ingrese la cantidad de bancos disponibles en el aula donde se dictar� el curso.";
	Leer cantBancos;
	
	Si (cantAlumnos == cantBancos) entonces
		Escribir "Perfecto, la cantidad de bancos es igual a la cantidad de alumnos. Todos tendr�n un asiento asignado.";
	SiNo
		Si (cantAlumnos > cantBancos) entonces
			Escribir "Hay m�s alumnos que bancos disponibles en el aula, faltar�n " , cantAlumnos-cantBancos , " bancos, por lo que esa cantidad de alumnos deber�n permanecer parados.";
		SiNo
			Escribir "Hay m�s bancos que alumnos anotados al curso, por lo que sobrar�n " , cantBancos-cantAlumnos ," bancos en el sal�n.";
		FinSi
	FinSi
	
FinAlgoritmo
