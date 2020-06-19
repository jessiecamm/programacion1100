Algoritmo AsignacionAulas
	
	Definir alumnos Como Entero;
	Definir listaAsientos como entero;
	Definir listaAula, azul, verde, amarilla como caracter;
	
	Dimension listaAsientos[3];
	listaAsientos[0]=40;
	listaAsientos[1]=35;
	listaAsientos[2]=30;
	
	Dimension listaAula[3];
	listaAula[0]=azul;
	listaAula[1]=verde;
	listaAula[2]=amarilla;
	
	Escribir "Ingrese la cantidad de alumnos que se han anotado a tercer grado:";
	Leer alumnos;
	
	Si (alumnos<=30)
		Escribir "El aula apropiada es el aula Amarilla.";
	SiNo
		si (alumnos<=35)
			Escribir "El aula apropiada es el aula Verde.";
		SiNo
			si (alumnos>35) y  (alumnos<=40)
				Escribir "El aula apropiada es el aula Azul.";
			FinSi
		FinSi
		Si (alumnos>40)
			Escribir "No contamos con aulas capacitadas para tantos alumnos.";
		FinSi
	FinSi	

FinAlgoritmo
