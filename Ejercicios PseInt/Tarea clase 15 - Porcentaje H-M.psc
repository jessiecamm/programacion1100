Algoritmo porcentajeHomMuj
	
	Definir lista Como entero;
	Definir totHombres, totMujeres Como entero;
	Definir i como entero;
	Definir porcMuj, porcHom como real;
		
	totHombres=0;
	totMujeres=0;
	porcMuj=0;
	porcHom=0;
	
	Dimension lista[31];
	
	Para i=0 hasta 30 Hacer
		Escribir "Si el participante es HOMBRE ingrese 1.";
		Escribir "Si es MUJER, ingrese 2.";
		Leer lista[i];
		Si lista[i]= 2 entonces
			totMujeres=totMujeres+1;
		SiNo
			totHombres=totHombres+1;
		FinSi
	FinPara
	
	Escribir "Concurrieron al evento: " , totMujeres " mujeres";
	Escribir "Y: " , totHombres, " hombres";
	
	porcHom=totHombres/100;
	porcMuj=totMujeres/100;
	
	Escribir "El porcentaje de mujeres que concurrió al evento es de: " , porcMuj , " %.";
	Escribir "Mientras que el porcentaje de hombres es de: " , porcHom , "%.";	
	
FinAlgoritmo
