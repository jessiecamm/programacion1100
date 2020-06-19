Algoritmo autoMasVeloz
	
	Definir velAuto, auto Como entero;
	Definir nombrePiloto como caracter;
	Definir i,j,k como entero;
	
	Dimension velAuto[5];
	velAuto[0]= 60;
	velAuto[1]= 20;
	velAuto[2]= 50;
	velAuto[3]= 85;
	velAuto[4]= 45;
	
	Dimension nombrePiloto[5];
	
	Hacer
	auto=0;
		Para i=1 Hasta 4
			Si (velAuto[i] < velAuto[i-1])
				auto=velAuto[i-1];
				velAuto[i-1]=velAuto[i];
				velAuto[i]=auto;
				auto=i;
			FinSi
		FinPara
			j=auto;
	Hasta Que auto=0
	
	Escribir "El auto más veloz es el número: " , i , ". Corresponde al piloto: ";
	
	Para k=0 hasta 4 hacer
		Segun velAuto[i] hacer
			0: Escribir "Ferrari";
			1: Escribir "Schumacher";
			2: Escribir "Senna";
			3: Escribir "Mercedes";
			4: Escribir "Benetton";
			De Otro Modo:
				Escribir "No hay pilotos en esa posición";
		Fin Segun
	Fin Para

FinAlgoritmo
