Algoritmo asignarAulaAlumnos
	
    Definir alumnos, aulas, amarillo, verde, azul Como Entero;
	
    dimension amarillo[31], verde[36], azul[41];
	
	Escribir "Cuántos alumnos hay inscriptos en tercer grado?";
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
