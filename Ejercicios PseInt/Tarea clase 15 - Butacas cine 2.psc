Algoritmo butacasCine
	
	Definir lista como logico;
	Dimension lista[240];
	Definir i como Entero;
	Definir butacaOcupada como Entero;
	
	butacaOcupada = 0;
	
	Escribir "Escanear una por una las filas de la 1 a la 15 y las butacas de la 1 a la 14 para determinar cuáles están ocupadas.";
	
	Para i=0 Hasta 239 Hacer
		Si ((azar(10)+1) > 5) Entonces
			lista[i] = falso;
		SiNo
			lista[i] = verdadero;
		FinSi
	FinPara
	
	Para i=0 Hasta 239 Hacer	
		Si (lista[i] == Verdadero) Entonces
			butacaOcupada = butacaOcupada+1;
		FinSi
	FinPara		
	
	Escribir "";
	Escribir "Hay: " , butacaOcupada , " butacas ocupadas en esta sala del cine, de las 240 disponibles.";
	
FinAlgoritmo
