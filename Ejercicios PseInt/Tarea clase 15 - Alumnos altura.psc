Algoritmo promedioAltura
	
	Definir alturas, promedio Como Real;
	Definir lista como real;
	Definir i Como entero;
	
	alturas=0;
	
	Dimension lista[16];
	
	Para i=0 Hasta 15 hacer
		Escribir "Ingrese la altura del alumno n°: " , i , ".";
		Leer lista[i];
		alturas = alturas + lista[i];
	FinPara
	
	promedio = (alturas/15);
	Escribir "La altura promedio de los 15 alumnos del salón es: " , promedio;
	
FinAlgoritmo
