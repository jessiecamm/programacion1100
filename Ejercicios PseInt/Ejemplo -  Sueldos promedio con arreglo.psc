Algoritmo Sueldos
	Definir i Como Entero;
	Definir sueldo,promedio, sueldomayor, sumasueldo  Como Real;
	Definir nombre Como Caracter;
	Dimension nombre[5];
	Dimension sueldo[5];
	
	sueldomayor=0;
	sumasueldo=0;
	
	Para i=0 Hasta 4
		Escribir "Ingresar el nombre del empleado:";
		Leer nombre[i];
		Escribir "Ingresar el sueldo de ",nombre[i]," :";
		Leer sueldo[i];
		Si sueldo[i]>30000 Entonces
			sueldomayor=sueldomayor+1;
		Fin Si
		sumasueldo=sumasueldo+sueldo[i];
	Fin Para
	
	promedio=sumasueldo/5;
	Escribir "La cantidad de  empleados que ganan mas de $30.000 son: ",sueldomayor;
	Escribir "Los empleados que cobran mas que el sueldo promedio son:";
	
	Para i=0 Hasta 4
		Si sueldo[i]>promedio Entonces
			Escribir "  * ",nombre[i];
		Fin Si
	Fin Para
FinAlgoritmo
